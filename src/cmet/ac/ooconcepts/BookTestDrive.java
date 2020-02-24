/**
 * 
 */
package cmet.ac.ooconcepts;

/**
 * @author st20066908
 *
 */
public class BookTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book[] myBooks = new Book[3];
		myBooks[0] = new Book("whatever", "something");
		myBooks[1] = new Book("whatever1", "something1");
		myBooks[2] = new Book("whatever2", "something2");
		myBooks[3] = new Book("How to zander", "Zander");
		
		myBooks[3] = new Book("test branch", "Zander");
		
		for (Book book : myBooks) {
			System.out.println("the book " + book.getTitle() +
					"is written by " + book.getAuthor());
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
