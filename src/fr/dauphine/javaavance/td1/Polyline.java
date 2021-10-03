package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Polyline {
	
	private ArrayList<Point> list;

	public Polyline(ArrayList<Point> list) {
		this.list = list;
	}
	
	public void add(Point p) {
		list.add(p);
	}

}