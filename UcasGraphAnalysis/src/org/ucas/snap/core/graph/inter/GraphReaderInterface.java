package org.ucas.snap.core.graph.inter;


import java.util.Vector;

import org.ucas.snap.core.graph.impl.graphBase.Edge;

public interface GraphReaderInterface {
	public Vector<Edge> readFromFile(String fileName,boolean undirected);
}
