package org.ucas.snap.core.graph.impl.graphBase;

import java.util.Set;

import org.ucas.snap.core.graph.inter.PathInteface;



public class Path implements PathInteface {
	private Set<Edge> path;
	
	
	@Override
	public Set<Edge> getPath() {
		// TODO 自动生成的方法存根
		return this.path;
	}

}
