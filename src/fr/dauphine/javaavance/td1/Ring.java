package fr.dauphine.javaavance.td1;

public class Ring {
	
	private Point center;
	
	private double radius1;
	
	private double radius2;

	public Ring(Point center, double radius1, double radius2) {
		if (radius1 <= radius2) {
			this.center = center;
			this.radius1 = radius1;
			this.radius2 = radius2;
		}
		else System.out.println("Can't create this ring!");
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub		
		if (obj == null) {
			return false;
		}
		if (obj instanceof Ring) {
			Ring rng = (Ring) obj;
			if(this.center.equals(rng.center) && this.radius1 == rng.radius1 && this.radius2 == rng.radius2) {
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		return "Center = " + "[" + this.center.getX() + ", " + this.center.getY() + "]\n"
				+ "Radius1 = " + radius1 + "\n"
				+ "Radius2 = " + radius2 + "\n";
	}
	
	public boolean contains(Point p) {
		int deltaX = this.center.getX() - p.getX();
		int deltaY = this.center.getY() - p.getY();
		
		if (deltaX *deltaX + deltaY * deltaY > this.radius1 * this.radius1 && deltaX *deltaX + deltaY * deltaY < this.radius2 * this.radius2) {
			return true;
		}
		else return false;
	}
	
	public static boolean contains(Point p, Ring r) {
		int deltaX = r.center.getX() - p.getX();
		int deltaY = r.center.getY() - p.getY();
		
		if (deltaX *deltaX + deltaY * deltaY > r.radius1 * r.radius1 && deltaX *deltaX + deltaY * deltaY < r.radius2 * r.radius2) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,2);
		Ring r1 = new Ring(p1,1,2);
		Ring r2 = new Ring(p1,2,1);
		Ring r3 = new Ring(p1,1,2);
		Ring r4 = new Ring(p1,2,3);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		System.out.println(r1.equals(r4));
		
		System.out.println(r1);
		System.out.println(r1.contains(p2));
		System.out.println(contains(p2,r1));
	}
	
	

}
