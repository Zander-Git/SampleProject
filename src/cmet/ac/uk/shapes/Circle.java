package cmet.ac.uk.shapes;

import java.util.ArrayList;

public class Circle extends EllipticalShape {
	
	static double pi = 3.14159;

	public Circle(Point centre, double radius) {
		super(centre, radius);		
	}

	@Override
	public void rotate() {
		return;
		
	}

	@Override
	public void changeScale() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getArea() {
		
		return pi * Math.pow(getRadius(), 2);
	} 

	@Override
	public double getPerimeterLength() {
		return 2 * pi * getRadius();
	}

	@Override
	public ArrayList<Point> getBoundingReact() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getRadius() {
		return getSemiMajorAxis();		
	}
	
	
	
	
	
	
}
