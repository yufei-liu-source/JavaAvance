package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {

	private int x;
	private int y;
	
	public Point(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+ this.x + ","+ this.y + ")";
	}
	
	//Exo 3.2
	public static boolean isSameAs(Point p1, Point p2) {
		if (p1.x == p2.x && p1.y == p2.y) { 
			return true;
		}		
		return false;
	}
	
	public Point translate(int dx, int dy) {
		this.setX(dx + this.getX());
		this.setY(dy + this.getY());
		return this;
	}

	public static void main(String[] args) {
		Point p=new Point(1,5);
		System.out.println(p);
		
		// Exo 3.1
//		Point p1=new Point(1,2);
//		Point p2=p1;
//		Point p3=new Point(1,2);
//		System.out.println(p1==p2);
//		System.out.println(isSameAs(p1,p3));
		
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);

		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		
		Point test  = new Point(3,3);
		System.out.println(test.translate(1, 1));
		
	}
	
	
	//Exo 3.3
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub		
		if (obj ==null) {
			return false;
		}
		if (obj instanceof Point) {
			Point pnt = (Point) obj;
			if(isSameAs (pnt, this)) {
				return true;
			}
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
