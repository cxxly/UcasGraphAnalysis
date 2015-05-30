package org.ucas.snap.core.alg.impl.bridgeDetection;

public interface BridgeDetectionNodeState {
	public final static boolean UNREACHED = false;
	public final static boolean REACHED = true;
	public final static int ROOT = 0;
	public final static boolean LASTNODEISNEW = true;
	public final static boolean LASTNODEISNOTNEW = false;
}
