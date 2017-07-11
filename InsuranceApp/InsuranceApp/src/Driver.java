import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {

		LinkList theLinkedList = new LinkList();
		//Insert Customer Information
		theLinkedList.insertCustInfo("Scott ", "Iowa", 1, 2, "Good");
		theLinkedList.insertCustInfo("John ", "Utah", 2, 2, "Better");
		theLinkedList.insertCustInfo("Mike ", "Texas", 3, 3, "Best");
		theLinkedList.display();
		//Create an array with coverage options for good,better,best
		int good[] = {100000,25000,2000};
		int better[] = {300000,50000,1000};
		int best[] = {500000,100000, 500};
		//Print out array to show coverage options
		System.out.println("Good Coverage: " + Arrays.toString(good));
		System.out.println("Better Coverage: " + Arrays.toString(better));
		System.out.println("Best Coverage: " + Arrays.toString(best));
		
		//Write an If statement to print coverage array?

		


	}
}
