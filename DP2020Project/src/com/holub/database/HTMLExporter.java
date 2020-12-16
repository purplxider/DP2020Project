package com.holub.database;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public class HTMLExporter implements Table.Exporter {
	private final Writer out;
	private int width;
	
	HTMLExporter(Writer out) {
		this.out = out;
	}

	@Override
	public void startTable() throws IOException {
		out.write("<html>" +
				"<body>" +
				"<table border ='1'>" +
				"<tr>" +
				"</tr>");
	}

	@Override
	public void storeMetadata( String tableName,
							   int width,
							   int height,
							   Iterator columnNames ) throws IOException
	{
		this.width = width;
		storeRow( columnNames ); // comma separated list of columns ids
	}

	@Override
	public void storeRow(Iterator data) throws IOException {
		
	}

	@Override
	public void endTable() throws IOException {out.write("</html>");}

}
