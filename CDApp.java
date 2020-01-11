import java.util.*;

public class CDApp {
	static CD cdOne = new CD("Sun Fun", "Beck", "Artista", 4, 0);
	static CD cdTwo = new CD("Darkness", "Led Zepplin", "Capitol", 9, 19.99);
	static CD cdThr = new CD("G.A.I.B.S.IV", "Coheed and Cambria", "Columbia", 15, 10.00);
	static CD cdFou = new CD("", "", "", 0, 0);
	
	static double[] prices = {cdOne.getPrice(), cdTwo.getPrice(), cdThr.getPrice()};
	Arrays.sort(prices);
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		ArrayList<Double> titles = new ArrayList<>(cdOne.getPrice(), cdTwo.getPrice());
		System.out.println("Enter your preferred sorting method: ");
		System.out.println("1: Title\n" + "2: Artist\n" + "3: Publisher\n" + "4: Number of Songs\n" + "5: Price");
		int choice = scan.nextInt();
		printout();
		
		switch(choice) {
		case 1:
			sortTitle();
			break;
		case 2:
			sortArtist();
			break;
		case 3:
			sortPublisher();
			break;
		case 4:
			sortSongs();
			break;
		case 5:
			sortPrice();
		}
		scan.close();
	}
	
	public static void sortTitle() {
		
	}
	public static void sortArtist() {
		
	}
	public static void sortPublisher() {
		
	}
	public static void sortSongs() {
		
	}
	public static void sortPrice() {
		for(int i = 1; i < prices.length; i++){
			System.out.println(prices[i]);
		}
	}
	
	public static void printout() {
		System.out.println("Title     " + "Artist     " + "Publisher   " + "Songs     " + "Price");
	}
}
