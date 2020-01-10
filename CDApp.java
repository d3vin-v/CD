import java.util.*;

public class CDApp {
	public static void main(String args[]) {
		CD cdOne = new CD("Sun Fun", "Beck", "Artista", 4, 0);
		CD cdTwo = new CD("Darkness", "Led Zepplin", "Capitol", 9, 19.99);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your preferred sorting method: ");
		System.out.println("1: Title\n" + "2: Artist\n" + "3: Publisher\n" + "4: Number of Songs\n" + "5: Price");
		int choice = scan.nextInt();
		
		public static void sortPrice() {
			double cdOneP = cdOne.getPrice();
			double cdTwoP = cdTwo.getPrice();
			if()
		}
		
		public static void printout() {
			System.out.println("Title     " + "Artist     " + "Publisher   " + "Songs     " + "Price");
		}
		
		
		
		
		
		scan.close();
	}
}
