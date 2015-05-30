package org.ucas.snap.core.graph.impl.graphBase;

import org.ucas.snap.core.graph.impl.commomDef.NodeColor;
import org.ucas.snap.core.graph.inter.NodeInterface;



public class Node implements NodeInterface{
	private int ID;
	private NodeColor color;
	private int indegree = 0;
	private int outdegree = 0;
	
	public Node(int ID,NodeColor color){
		this.ID = ID;
		this.color = color;
	}
	
	public Node(int ID){
		this(ID,NodeColor.unknown);
	}
	
	
	public void setID(int ID){
		this.ID = ID;
	}
	public void setColor(NodeColor color){
		this.color = color;
	}
	public void setInDegree(int degree){
		this.indegree = degree;
	}
	public void setOutDegree(int degree){
		this.outdegree = degree;
	}
	public void setDegree(int degree){
		this.indegree = degree;
		this.outdegree = degree;
	}
	
	public int getID(){
		return this.ID;
	}
	public NodeColor getColor(){
		return this.color;
	}

	@Override
	public int getInDegree() {
		// TODO 自动生成的方法存根
		return this.indegree;
	}

	@Override
	public int getOutDegree() {
		// TODO 自动生成的方法存根
		return this.outdegree;
	}
}
