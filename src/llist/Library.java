package llist;

import java.util.Scanner;

public class Library {
	Llist data;
	Scanner k;
	public Library(){
		data = new Llist();
		k = new Scanner(System.in);
	}
	public void add(){
		System.out.println("You have chosen add. Please enter the title of the CD:");
		String t = k.next();
		System.out.println("Please enter the artist of the CD:");
		String a = k.next();
		System.out.println("Please enter the amount of tracks on the CD:");
		int tracks = k.nextInt();
		System.out.println("Please enter the tracking number of the CD:");
		long trn = k.nextLong();
		CD disc = new CD(t, a, tracks, trn, -1);
		for(int i = 0; i < data.size(); i++){
			if(disc.trackingNumber == ((CD)(data.get(i))).trackingNumber){
				if(disc.title.equals(((CD)(data.get(i))).title)){
					System.out.println("How many copies would you like to add?");
					((CD)(data.get(i))).amountOwned += k.nextInt();
					return;
				}
				else {
					System.out.println("The tracking number is already in use for another CD. \n Please try again.");
					return;	
				}
			}
		}
		System.out.println("How many copies would you like to add?");
		disc.amountOwned = k.nextInt();
		data.add(disc);
		System.out.println("Successfully added CD.");
	}
	public void delete(){
		System.out.println("You have chosen delete. Please enter the tracking number of the CD:");
		long t = k.nextLong();
		int index = -1;
		for(int i = 0; i < data.size(); i++){
			if (t == ((CD)(data.get(i))).trackingNumber){
				index = i;
				break;
			}
		}
		if(index < 0){
			System.out.println("No Matching CD was found, please try again.");
			return;
		}
		int x = ((CD)(data.get(index))).amountOwned;
		if(x > 1){
			System.out.println("Matching CD found, it has " + x + " copies. \n Please enter how many you would like to delete:");
			int q = k.nextInt();
			((CD)(data.get(index))).amountOwned = ((CD)(data.get(index))).amountOwned - q;
			if(q == x)
				data.remove(index);
		}
		else
			data.remove(index);
		System.out.println("Successfully performed operation.");
	}
	public void find(){
		System.out.println("Please enter the tracking number of the CD you wish to find:");
		long t = k.nextLong();
		for(int i = 0; i < data.size(); i++){
			if(t == ((CD)(data.get(i))).trackingNumber){
				System.out.println("Match found: \n" + ((CD)(data.get(i))));
				return;
			}
		}
		System.out.println("No match found, please try again.");
	}
	public void list(){
		for(int i = 0; i < data.size(); i++)
			System.out.println("CD number " + i + ":" + ((CD)(data.get(i))));
	}
}