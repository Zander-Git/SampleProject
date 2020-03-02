package cmet.ac.uk.shapes;

/**
 * This class contains instances of coordinates in the Cartesian format. 
 * It also provides the utility functions (e.g., get distance, rotate a point etc).
 *
 * @author Thanuja Mallikarachchi
 * @version July August, 2019
 */
public class Point {
	
	/**
	 * Cartesian coordinates X and Y
	 */
	double pos_x;
	double pos_y;

	// Constructor

	/**
	 * Constructs a Point object, with a type identifier.
	 */
	public Point(double _px, double _py) {
		this.pos_x = _px;
		this.pos_y = _py;
	}
	
	// Get methods
	
	public double getX() {
		return this.pos_x;
	}
	
	public double getY() {
		return this.pos_y;
	}
	
	/**
	 * Calculates the distance in between two points using the Pythagorean theorem
	 * (C ^ 2 = A ^ 2 + B ^ 2)
	 *
	 * @param pointA The first point (the calling instance/object).
	 * @param pointB The second point.
	 * @return The distance between the two points.
	 */
	public double getDistance(Point pointB) {
		// Obtain differences in X and Y, sign is not important as these values
		// will be squared later.
		double deltaX = getX() - pointB.getX();
		double deltaY = getY() - pointB.getY();

		return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	/**
	 * Implementation of the Rotation Matrix given in
	 * https://en.wikipedia.org/wiki/Rotation_matrix
	 * Rotates points in the xy-plane counter clockwise through an angle theta 
	 * about the origin of a two-dimensional Cartesian coordinate system. 
	 *  
	 * @param theta rotation angle
	 * @return return the new Point 
	 */
	public Point rotatePoint(double theta) {
		double radTheta = Math.toRadians(theta);
		double x = getX();
		double y = getY();
		
		return new Point((Math.cos(radTheta) * x - Math.sin(radTheta)*y), 
				(Math.sin(radTheta) * x + Math.cos(radTheta)*y));
	}
	
	
	/**
	 * Returns information about the coordinates.
	 *
	 * @return A String containing information about the coordinates.
	 */
	public String toString() {
		return new String("Cartesian coordinates of the Point : (" + 
							getX() + "," + getY() + ")\n");
	}
}
