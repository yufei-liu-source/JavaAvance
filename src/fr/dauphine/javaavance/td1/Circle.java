package fr.dauphine.javaavance.td1;

public class Circle {
	private Point center;
	
	private double radius;
	

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(Point center, double radius) {
		this.radius = radius;
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		
		if (radius >= 0) {
			this.radius = radius;
		}
		else this.radius = 0.0;
		
	}
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point pc) {
		this.center = pc;
	}

	public String toString(){
		return "Center = " + "[" + this.center.getX() + ", " + this.center.getY() + "]\n"
				+ "Radius = " + radius + "\n"
				+ "Area = " + this.area() + "\n";
	}
	
	public Circle translate(int dx, int dy) {
		this.center.setX(this.center.getX()+dx);
		this.center.setY(this.center.getY()+dy);
		
		return this;
	}
	
	public double area() {
		
		return this.radius * this.radius *  Math.PI;
	}
	
	public boolean contains(Point p) {
		int deltaX = this.center.getX() - p.getX();
		int deltaY = this.center.getY() - p.getY();
		if (! (deltaX *deltaX + deltaY * deltaY > this.radius * this.radius)) {
			return true;
		}
		else return false;
	}
	
	public static boolean contains(Point p, Circle c) {
		int deltaX = c.center.getX() - p.getX();
		int deltaY = c.center.getY() - p.getY();
		if (! (deltaX *deltaX + deltaY * deltaY > c.radius * c.radius)) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Point p=new Point(0,0); 
		Circle c1=new Circle(p,1); 
		Circle c2=new Circle(p,2); 
		//c2.translate(1,1); 
		System.out.println(c1+"\n"+c2); 
		
		Circle c3 =new Circle(new Point(0,0), 1); 
		//c3.getCenter().translate(1,1); 
		System.out.println(c3); 
		
		Point p2=new Point(1,1); 
		System.out.println(c1.contains(p2));
		System.out.println(c2.contains(p2));
		System.out.println(contains(p2,c3));

	}


	

}
