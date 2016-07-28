package com.gt;

import java.util.HashSet;
import java.util.Set;

public class Graph {
	private Set<Location> vertexSet = new HashSet<>();
	
	private void addToGraph(Location source, Location destination) {
		vertexSet.add(source);
		vertexSet.add(destination);
	}
	public void createUniDirectionalEdge(String orbitName,Location source, Location destination, int weight) {
		addToGraph(source, destination);
		source.linkEnge(new Orbit(orbitName,destination, weight));
		
	}
	
	public void createBiDirectionalEdge(String orbitName,Location source, Location destination, int weight) {
		addToGraph(source, destination);
		source.linkEnge(new Orbit(orbitName,destination, weight));
		destination.linkEnge(new Orbit(orbitName,source, weight));
		
		
	}
	public void resetCache() {
		for (Location vertex : vertexSet) {
			vertex.resetCache();
		}
		
	}

}
