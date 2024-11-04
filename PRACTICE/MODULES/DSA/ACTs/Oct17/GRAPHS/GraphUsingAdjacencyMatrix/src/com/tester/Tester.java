package com.tester;

import java.util.List;

import com.graph.Graph;
import com.impl.GraphImpl;

public class Tester {
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		GraphImpl.addEdge(graph, 1, 3);
		GraphImpl.addEdge(graph, 1, 0);
		GraphImpl.addEdge(graph, 0, 2);
		GraphImpl.addEdge(graph, 3, 2);
		GraphImpl.addEdge(graph, 0, 3);
		System.out.println("Printing the Graph : ");
		GraphImpl.printAdjMatrix(graph);
		GraphImpl.removeEdge(graph, 0, 3);
		System.out.println("Printing the Graph : ");
		GraphImpl.printAdjMatrix(graph);
		boolean isEdge = GraphImpl.isEdge(graph, 1, 3);
		System.out.println("isEdge present between " + 1 +" and " + 2 + " is : " + isEdge);
		boolean isSelfLoop = GraphImpl.isSelfLoop(graph, 1);
		System.out.println("isSelfLoop present within " + 1 + " is : " + isSelfLoop);
		int getDegree = GraphImpl.getDegree(graph, 3);
		System.out.println("Degree of " + 3 + " is : " + getDegree);
		List<Integer> getNeighbours = GraphImpl.getNeighbours(graph, 3);
		System.out.println("printing neighbours : " + getNeighbours);
	}
}
