package com.gt;

class Orbit
{
    private final Location target;
    private final double weight;
    private final String orbitName;
    public Orbit(String argOrbitName, Location argTarget, double argWeight)
    { 
    	orbitName = argOrbitName;
    	target = argTarget;
    	weight = argWeight; 
    	}
	public Location getTarget() {
		return target;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return orbitName;
	}
	
}
