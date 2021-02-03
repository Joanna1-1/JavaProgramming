package Exercise1;

import java.util.Scanner;

public class SingerTest {

	static Singers singer1 = new Singers();
	
	public static void main(String[] args) {
		//output default constructor
		outputSingerRecord(singer1);
		
		//update the record with setters with static value and output it
		updateSingerRecord(singer1);
		outputSingerRecord(singer1);
		
		//update the record with setSingerRecord method and output it
		singer1.setSingerRecord(10002, "Michael Jackson","Los Olivos, California USA", "1958/08/29", 34);
		outputSingerRecord(singer1);
		
		//enter your own record and output it
		enterYourOwnRecord(singer1);
		outputSingerRecord(singer1);

	}
	
	//output singer record
	public static void outputSingerRecord(Singers singer) {
		System.out.println("Singer id: "+ singer.getId());
		System.out.println("Singer name: "+ singer.getName());
		System.out.println("Singer address: "+ singer.getAddress());
		System.out.println("Singer DOB: "+ singer.getDateOfBirth());
		System.out.println("Number of albums published: "+ singer.getNumberOfAlbumsPublished());
		System.out.println("");
	}
	
	//update singer record
	public static void updateSingerRecord(Singers singer){		
		singer.setId(10001);
		singer.setName("Celine Dion");
		singer.setAddress("Montreal, QC Canada");
		singer.setDateOfBirth("1968/03/30");
		singer.setNumberOfAlbumsPublished(27);
	}
	
	//enter your own record
	public static void enterYourOwnRecord(Singers singer) {
		
		Scanner obj = new Scanner(System.in);
		    
	    String name;
	    System.out.print("Please enter the singer's name:");
	    name = obj.nextLine(); 
	    singer.setName(name);
	    
	    String address;
	    System.out.print("Please enter the singer's address:");
	    address = obj.nextLine(); 
	    singer.setAddress(address);
	    
	    String dob;
	    System.out.print("Please enter the singer's DOB (ex.1990/02/23):");
	    dob = obj.nextLine(); 
	    singer.setDateOfBirth(dob);
	    
	    int numberOfAlbum;
	    System.out.print("Please enter the number of albums published:");
	    numberOfAlbum = obj.nextInt(); 
	    singer.setNumberOfAlbumsPublished(numberOfAlbum);
	    
	    int id;
	    System.out.print("Please enter the singer's id (ex.10005):");
	    id = obj.nextInt(); 
	    singer.setId(id);
	    
	    System.out.println();
	    obj.close();
	}

}
