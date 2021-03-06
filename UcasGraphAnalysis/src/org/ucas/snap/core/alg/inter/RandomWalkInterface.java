/**
 * 
 */
package org.ucas.snap.core.alg.inter;

import java.util.List;

/**
 * A Interface to access some method of random walk
 * 
 * @author  chenxx
 * @date	2015/5/30
 */
public interface RandomWalkInterface {
	
	/**
	 * Walk from a random node with default step number.
	 * @return walk path
	 */
	public List<Integer> walk();
	
	
	/**
	 * Walk from a random node with a given step.
	 * @param step
	 * @return
	 */
	public List<Integer> walk(int step);
	
	/**
	 * Walk from given start node with a given step;
	 * @param startNode
	 * @param step
	 * @return
	 */
	public List<Integer> walk(int startNode, int step);
	
	
	/**
	 * Walk from one node to another node with a given step threshold.
	 * If it suceess to walk to end node within threshold, return path,
	 * else return empty list.
	 * @param startNode
	 * @param endNode
	 * @param stepThreshold
	 * @return
	 */
	public List<Integer> walk(int startNode, int endNode, int stepThreshold);

}
