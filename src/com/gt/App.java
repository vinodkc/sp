package com.gt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
	 public static void main(String[] args)
	    {
	        // mark all the vertices 
	        Location A = new Location("A");
	        Location B = new Location("B");
	        Location D = new Location("D");
	        Location F = new Location("F");
	        Location K = new Location("K");
	        Location J = new Location("J");
	        Location M = new Location("M");
	        Location O = new Location("O");
	        Location P = new Location("P");
	        Location R = new Location("R");
	        Location Z = new Location("Z");
	        
	        Graph g = new Graph();
	        g.createBiDirectionalEdge("E1", A,M,8);
	        g.createBiDirectionalEdge("E5",B,D,11);
	        g.createBiDirectionalEdge("E6",F,K,23);
	        g.createBiDirectionalEdge("E7",K,O,40);
	        g.createBiDirectionalEdge("E8",J,K,25);
	        g.createBiDirectionalEdge("E2",M,R,8);
	        g.createBiDirectionalEdge("E3",R,P,15);
	        g.createBiDirectionalEdge("E4",Z,P,18);
	        


	        ShortestPathAlgorithm.computePaths(A); 
	        System.out.println("\nDistance to " + Z.getName() + ": " + Z.getMinDistance());
	        List<Location> path = ShortestPathAlgorithm.getShortestPathTo(Z);
	        printShortestPath(path);
	        
	        g.resetCache();
	        
	        ShortestPathAlgorithm.computePaths(F); 
	        System.out.println("\nDistance to " + O.getName() + ": " + O.getMinDistance());
	         path = ShortestPathAlgorithm.getShortestPathTo(O);
	         printShortestPath(path);
	        
	        g.resetCache();
	        
	        ShortestPathAlgorithm.computePaths(Z); 
	        System.out.println("\nDistance to " + M.getName() + ": " + M.getMinDistance());
	         path = ShortestPathAlgorithm.getShortestPathTo(M);
	         printShortestPath(path);
	        
	    }

	private static void printShortestPath(List<Location> path) {
		List<String> strings = new ArrayList<String>();
		strings.add("\nTo ");
		 for (Location location : path) {
			 strings.add(location.toString());
			 strings.add(" AND ");
		}
		for (int i = 0; i < strings.size()-1; i++) {
			
			System.out.print(strings.get(i));
		}
	}

}
