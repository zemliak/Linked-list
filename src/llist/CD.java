package llist;

public class CD {
	String title;
	String artist;
	int tracks;
	long trackingNumber;
	int amountOwned;
	
	public CD (String s, String a, int t, long tn, int ao){
		this.title = s;
		this.artist = a;
		this.tracks = t;
		this.trackingNumber = tn;
		this.amountOwned = ao;
	}
	public String toString(){
		return "Title: " + title + "\nArtist: " + artist + "\nAmount of tracks: " + tracks 
				+ "\nTracking number: " + trackingNumber + "Amount of copies owned: " + amountOwned;
	}
}
