/*FileName:BridgeGraph.java
 * Date:2015,05.13
 * Author:Yan Lingyong
 * Description: Class deal with graph
 * */
package org.ucas.snap.core.alg.impl.bridgeDetection;

import java.util.Vector;

import org.ucas.snap.core.graph.impl.graphBase.Edge;
import org.ucas.snap.core.graph.impl.graphBase.Graph;


public class BridgeGraph extends Graph{
	public BridgeGraph(){
		
	}
	public BridgeGraph(int[][] gg) throws Exception {
		super(gg);
	}
	
	public BridgeGraph(Vector<Edge> edges){
		super(edges);
	}
}
