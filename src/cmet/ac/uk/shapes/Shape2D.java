package cmet.ac.uk.shapes;

import java.util.ArrayList;

public abstract class Shape2D {
	protected Point centre;
	
	public void translate(int x, int y) {
		centre.pos_x += x;
		centre.pos_y += y;
	}
	
	public Point getCentre() {
		return centre;
	}
	
	public Shape2D(Point centre) {
		this.centre = centre;
	}
	
	
	public abstract void rotate();
	public abstract void changeScale();
	public abstract double getArea();
	public abstract double getPerimeterLength();
	public abstract ArrayList<Point> getBoundingReact();

	
	
}
