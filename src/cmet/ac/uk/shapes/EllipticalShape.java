package cmet.ac.uk.shapes;

public abstract class EllipticalShape extends Shape2D {
	
	public EllipticalShape(Point centre, double majoraxis) {
		super(centre);		
	}

	private double semiMajorAxis;

	protected double getSemiMajorAxis() {
		return semiMajorAxis;
	}

	protected void setSemiMajorAxis(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}
}
