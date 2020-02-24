package cmet.ac.ooconcepts;

public class DataPoints {
	
public static void main(String[] args) {
	double score_data[] = {10.1, 11.2, 12.3, 13.4, 14.5};
	
	System.out.println("Mean of the dataset: " + compute_mean(score_data));
		
}

public static double compute_mean(double data[]) {
	/**
	 * Mean of dataset
	 */
	double mean = 0;
	for (double d : data) {
		mean = mean + d;
	}
	return mean / data.length;
}

public static double compute_variance(double data[]) {
	/**
	 * variance
	 */
}


public static double compute_standarddev(double data[]) {
	/**
	 * std
	 */
}




}
