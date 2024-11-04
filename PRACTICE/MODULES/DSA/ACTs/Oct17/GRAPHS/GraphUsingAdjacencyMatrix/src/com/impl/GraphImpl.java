package com.impl;

import java.util.ArrayList;
import java.util.List;

import com.graph.Graph;

public class GraphImpl {

	public static void addEdge(Graph graph, int i, int j) {
		// TODO Auto-generated method stub
		graph.adjMatrix[i][j] = 1;
		graph.adjMatrix[j][i] = 1;
	}
	
	public static void removeEdge(Graph graph, int i, int j) {
		// TODO Auto-generated method stub
		graph.adjMatrix[i][j] = 0;
		graph.adjMatrix[j][i] = 0;
	}

	public static boolean isEdge(Graph graph, int i, int j) {
		// TODO Auto-generated method stub
		return graph.adjMatrix[i][j] == i;
	}

	public static boolean isSelfLoop(Graph graph, int i) {
		// TODO Auto-generated method stub
		return graph.adjMatrix[i][i] == 1;
	}

	public static int getDegree(Graph graph, int vertex) {
		// TODO Auto-generated method stub
		int degree = 0;
		for(int i = 0; i < graph.noOfVertices; i++) {
			degree += graph.adjMatrix[i][vertex];
		}
		return degree;
	}

	public static List<Integer> getNeighbours(Graph graph, int vertex) {
		// TODO Auto-generated method stub
		List<Integer> neighbours = new ArrayList();
		for(int i = 0; i < graph.noOfVertices; i++) {
			if(graph.adjMatrix[i][vertex] == 1) {
				neighbours.add(i);
			}
		}
		return neighbours;
	}

	public static void printAdjMatrix(Graph graph) {
		// TODO Auto-generated method stub
		for (int i = 0; i < graph.adjMatrix.length; i++) {
			for (int j = 0; j < graph.adjMatrix[i].length; j++) {
				System.out.print(graph.adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
}
