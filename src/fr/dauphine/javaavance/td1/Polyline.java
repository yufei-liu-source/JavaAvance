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
	
	//Exo 4.3
	public int pointCapacity() {
		return 0;
	}
	
	public int nbPoints() {
		return this.list.size();
	}
	
	//Exo 4.4
	public boolean contains(Point pinconnu) {
		for(Point p: list) {
			if(p.equals(pinconnu)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Point p1=new Point(1,2);
		Point p2=new Point(3,5);
		Point p3=new Point(7,9);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		
		//Exo 4.5
		list.add(null);
		
		Polyline poln = new Polyline(list);
		System.out.println(poln.nbPoints());
		System.out.println(poln.contains(p1));
		System.out.println(poln.contains(p3));
		System.out.println(poln.contains(null));

	}

}