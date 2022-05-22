package problem2;

public class Ticket {
	private  int ticketid=123;
	private int price=100;
	private static int	availableTickets=25;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets<=0) {
			
		}else {
			
			Ticket.availableTickets = availableTickets;
		}
	}
	
	public int calculateTicketCost(int nooftickets) {
		if(availableTickets>=nooftickets) {
		 availableTickets=availableTickets-nooftickets;
			return  nooftickets*price;
		}else return -1;
	}

}
