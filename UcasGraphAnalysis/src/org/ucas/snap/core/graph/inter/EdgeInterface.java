package org.ucas.snap.core.graph.inter;

public interface EdgeInterface {
	
	public int getFromID();
	public int getToID();
	public double getWeight();
	public double getFlow();
}
