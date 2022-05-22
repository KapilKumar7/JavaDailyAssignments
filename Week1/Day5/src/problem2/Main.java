package problem2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Ticket t1 =new Ticket();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of bookings: ");
	    int nooftickets=sc.nextInt();
//	    System.out.println(nooftickets);
	    int total = t1.calculateTicketCost(nooftickets);
	    System.out.println("Total amount: "+total);
	    System.out.println("Available ticket after booking:"+t1.getAvailableTickets());
		

	}

}
