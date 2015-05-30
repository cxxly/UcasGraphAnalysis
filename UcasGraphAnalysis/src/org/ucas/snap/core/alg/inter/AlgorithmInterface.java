package org.ucas.snap.core.alg.inter;

import java.util.Set;

import org.ucas.snap.core.alg.impl.bridgeDetection.Bridge;



public interface AlgorithmInterface {
	public  int exec(String fileName);
	public  int exec(Bridge br,String fileName) throws Exception;
}
