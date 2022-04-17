import java.util.Scanner;
class Ticket
{
	public static void main(String args[])
	{
	    int a=0,b=0,c=0;
		ticketcentre n1=new ticketcentre();
		while(b==0)
		{
    		System.out.println("Menu");
			System.out.println("Per Person Ticket=2.5");
    		System.out.println("Press 1 to buy the ticket");
    		System.out.println("Press 2 to enter without ticket");
    		System.out.println("Press 3 to Display Total number people and amount");
    		System.out.println("Press 4 to Display number of ticket were sold");
    		Scanner s=new Scanner(System.in);
    		a=s.nextInt();
    		switch(a)
    		{
    		    case 1:
    		        n1.Buy();
    		        break;
    		    case 2:
    		        n1.notBuy();
    		        break;
    		    case 3:
    		        n1.display();
    		        break;
    		    case 4:
    		        n1.displayTicket();
    		        break;
    		    default:
    		        System.out.println("Choose a Definite value");
    		        break;
    		}
    		System.out.println("To exit press 0 or any other integer to continue");
    		c=s.nextInt();
    		if(c==0)
    		b=1;
		}
	}
}
class ticketcentre
{
    static int siri=0;
    static double sd=0.0;
    ticketcentre()
    {
        siri=0;
        sd=0.0;
    }
    void notBuy()
    {
        siri++;
    }
    void Buy()
    {
        siri++;
        sd+=2.50;
    }
    void display()
    {
        System.out.println("Number of people= "+siri);
        System.out.println("Total Amount= "+sd);
    }
    void displayTicket()
    {
        System.out.println("Number of ticket were sold= "+sd/2.5);
    }
}
