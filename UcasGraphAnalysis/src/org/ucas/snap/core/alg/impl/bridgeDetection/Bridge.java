/*FileName:Bridge.java
 * Date:2015,05.13
 * Author:Yan Lingyong
 * Description: Class used to store the bridge detected in a graph
 * */
package org.ucas.snap.core.alg.impl.bridgeDetection;

import java.util.Vector;

public class  Bridge{
	private Vector<int[]> vbridge = new Vector<int[]>();;
	Bridge(){
		init();
	}
	
	private void init(){
		this.vbridge = new Vector<int[]>();
	}
	
	public void AddBridge(int a, int b){
		int[] s = new int[2];
		s[0] = a;
		s[1] = b;
		vbridge.add(s);
	}
	
	public void set(Bridge other){
		this.vbridge = other.vbridge;
	}
	
	public void printBridge(){
		int size = this.vbridge.size();
		for(int i=0;i<size;i++){
			System.out.println("("+vbridge.get(i)[0]+","+vbridge.get(i)[1]+")");
		}
	}
}
