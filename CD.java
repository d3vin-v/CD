public class CD {
	String title;
	String artist;
	String publisher;
	int songs;
	double price;
	
	public CD(String title, String artist, String publisher, int songs, double price) {
		
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getSongs() {
		return songs;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return title + ", " + artist + ", " + publisher + ", " + songs + ", " + price;
	}
}