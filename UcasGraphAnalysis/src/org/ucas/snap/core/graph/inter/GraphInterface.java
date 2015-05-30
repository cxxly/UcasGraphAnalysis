package org.ucas.snap.core.graph.inter;

import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.ucas.snap.core.graph.impl.commomDef.GraphType;
import org.ucas.snap.core.graph.impl.graphBase.Edge;
import org.ucas.snap.core.graph.impl.graphBase.Node;


public interface GraphInterface {
	public GraphType getType();
	public int[][] getAdjMatrix();
	public Vector<Integer>  getAdjList(int nodeID);
	public Set<Node> getNodeSet();
	public Vector<Edge> getEdgeSet();
	public Map< Integer, Map<Integer, Double> > getWeightAdjList();
}
