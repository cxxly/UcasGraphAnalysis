/**
 * 
 */
package org.ucas.snap.core.alg.impl.bipartiteMatching;

import java.util.HashMap;
import java.util.Map;

import org.ucas.snap.core.graph.impl.commomDef.GraphReader;
import org.ucas.snap.core.graph.impl.graphBase.Graph;
import org.ucas.snap.core.graph.inter.GraphInterface;

/**
 * @author chenxx
 *
 */
public class BipartiteMatching {
	
	private GraphInterface graph;
	private final HungaryAlgorithm hungaryAlgorithm;
	/**
	 * 
	 */
	public BipartiteMatching(GraphInterface graph) {
		if(graph==null)
			throw new NullPointerException();
		this.graph = graph;
		int[][] matrix = this.graph.getAdjMatrix();
		int size = matrix.length;
		this.hungaryAlgorithm = new HungaryAlgorithm(size,size);
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(matrix[i][j] == 0) {
					this.hungaryAlgorithm.setWeight(i, j, Double.NEGATIVE_INFINITY);
				}
			}
		}
		//int[] result = this.hungaryAlgorithm.getMatching();
	}
	
	public Map<Integer, Integer> matching() {
		 Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		 int[] tmp = this.hungaryAlgorithm.getMatching();
		 for(int i=0; i<tmp.length; i++) {
			 result.put(i, tmp[i]);
		 }
		return result;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphInterface g = new Graph(GraphReader.readFromFile("tinyG.txt", false));
		BipartiteMatching m = new BipartiteMatching(g);
		System.out.println(m.matching().toString());

	}

}
