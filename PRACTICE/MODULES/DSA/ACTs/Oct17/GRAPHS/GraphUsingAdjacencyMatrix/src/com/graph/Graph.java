package com.graph;

public class Graph {
	public int [] [] adjMatrix;
	public int noOfVertices;
	public Graph(int noOfVertices) {
		super();
		this.noOfVertices = noOfVertices;
		adjMatrix = new int[noOfVertices][noOfVertices];
	}
	
}
