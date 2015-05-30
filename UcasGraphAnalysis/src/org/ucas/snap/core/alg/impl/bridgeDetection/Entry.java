/*FileName:Entry.java
 * Date:2015,05.13
 * Author:Yan Lingyong
 * Description: the entry of main function
 * */
package org.ucas.snap.core.alg.impl.bridgeDetection;
import org.ucas.snap.core.alg.inter.AlgorithmInterface;

public class Entry {
	public static void main(String[] args){
		int[][] gg = {{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 1, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 1, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 0 }};
		try{
			long startTime=System.currentTimeMillis();
			//myGraph.printGraph();
			//System.out.println(myGraph.getType());
			Bridge br = new Bridge();
			AlgorithmInterface algInter;
			algInter = new BridgeDetection();
			int i = algInter.exec(br,"/tmp/facebook_combined.txt");
			long endTime=System.currentTimeMillis(); //获取结束时间
			System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
			if(br!=null)
				br.printBridge();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
