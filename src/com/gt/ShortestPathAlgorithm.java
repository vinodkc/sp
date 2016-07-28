package com.gt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathAlgorithm
{
    public static void computePaths(Location source)
    {
        source.setMinDistance(0.);
        PriorityQueue<Location> vertexQueue = new PriorityQueue<Location>();
    vertexQueue.add(source);

    while (!vertexQueue.isEmpty()) {
        Location u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Orbit e : u.getAdjacencies())
            {
                Location v = e.getTarget();
                double weight = e.getWeight();
                double distanceThroughU = u.getMinDistance() + weight;
        if (distanceThroughU < v.getMinDistance()) {
            vertexQueue.remove(v);

            v.setMinDistance(distanceThroughU) ;
            v.setPrevious(u);
            v.setShortestOrbit(e);
            vertexQueue.add(v);
        }
            }
        }
    }

    public static List<Location> getShortestPathTo(Location target)
    {
        List<Location> path = new ArrayList<Location>();
        for (Location vertex = target; vertex != null; vertex = vertex.getPrevious())
            if (vertex.getShortestOrbit() != null) {
            	path.add(vertex);
			}

        Collections.reverse(path);
        return path;
    }

   

	
}