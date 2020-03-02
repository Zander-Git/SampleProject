package cmet.ac.ooconcepts;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	int twoD[][] = new int[4][5];
	
	for(int i = 0; i < 4; i++) {
		for(int j = 0; j < 5; j++) {
			twoD[i][j] = (int)(Math.random() * 10);
		}
	}
	
	
	
	for(int i = 0; i < 4; i++) {
		for(int j = 0; j < 5; j++) {
			System.out.print(twoD[i][j] + " ");
		}
		System.out.println();
	}
	
	
	
}

}
