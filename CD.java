public class CD {
	String title;
	String artist;
	String publisher;
	int songs;
	double price;
	
	public CD(String title, String artist, String publisher, int songs, double price) {
		this.title = title;
		this.artist = artist;
		this.publisher = publisher;
		this.songs = songs;
		this.price = price;
		
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
		if(price == 0) {
			return title + ", " + artist + ", " + publisher + ", " + songs + ", Free";
		}
		return title + ", " + artist + ", " + publisher + ", " + songs + ", " + price;
	}
}