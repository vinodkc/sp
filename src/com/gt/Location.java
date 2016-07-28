package com.gt;

import java.util.ArrayList;
import java.util.List;

class Location implements Comparable<Location>
{
    private final String name;
    private  List<Orbit> adjacencies = new ArrayList<Orbit>();
    private double minDistance = Double.POSITIVE_INFINITY;
    private Orbit shortestOrbit;
   

	private Location previous;
    public Location(String argName) { name = argName; }
    public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name + " via " + shortestOrbit ;
	}
    public int compareTo(Location other)
    {
        return Double.compare(getMinDistance(), other.getMinDistance());
    }
	public void linkEnge(Orbit edge) {
		getAdjacencies().add(edge);
	}
	public List<Orbit> getAdjacencies() {
		return adjacencies;
	}
	public void setAdjacencies(List<Orbit> adjacencies) {
		this.adjacencies = adjacencies;
	}
	public void resetCache() {
		minDistance=Double.POSITIVE_INFINITY;
		previous = null;
		shortestOrbit=null;
		
	}
	public double getMinDistance() {
		return minDistance;
	}
	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}
	public Location getPrevious() {
		return previous;
	}
	public void setPrevious(Location previous) {
		this.previous = previous;
	}
	 public Orbit getShortestOrbit() {
			return shortestOrbit;
		}
	public void setShortestOrbit(Orbit e) {
		shortestOrbit = e;
	}

}
