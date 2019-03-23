package general;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {

		String[] counterArgs= {"1","2","3"};
		
		Ticket ticketObject = (new TestMap()).new Ticket();
			// I create my object here
		HashMap<Integer, Ticket> totalTickets = new HashMap<Integer, Ticket>(); 
		for (String counter : counterArgs) {
			ticketObject.setCounter(Integer.valueOf(counter));
			totalTickets.put(Integer.valueOf(counter), ticketObject); 
		}
		
		totalTickets.entrySet().forEach(e->System.out.println(e.getKey()+"-"+e.getValue()));


	}

	class Ticket {
		public int getCounter() {
			return counter;
		}

		public void setCounter(int num) {
			this.counter = num;
		}

		int counter;
		@Override
		public String toString(){
			
			return ""+counter;
			
		}
	}

}
