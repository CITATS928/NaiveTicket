// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;


/**
 * Answers are in the README.txt
        */

public class Main {
  public static void main(String[] args) {
    System.out.println("Naive Ticket running.");

    //TicketMachine.Exercise();


    TicketMachine m1 = new TicketMachine(500);

    System.out.println("Prise of ticket is " + m1.getPrice()+ " cents.\n"+"Simulate inserting money:  "+m1.insertMoney(500)+ " cents.\nBalance is: "+m1.getBalance()+" cents.\nMachine's action - Print ticket: "+m1.printTicket()+" cents. \nCostomer's Remaining Balance is "+m1.getBalance()+" cents.\n"+"TicketNumber is "+m1.getTicketNumber());

    
    TicketMachine m2 = new TicketMachine(1000);

    System.out.println("\n\n\n\n2.3\nPrise of ticket is " + m2.getPrice()+ " cents.\n"+"Simulate inserting money:  "+m2.insertMoney(1000)+ " cents.\nBalance is: "+m2.getBalance()+" cents.\n"+"incrementTicketNumber is "+m2.incrementTicketNumber()+"\nMachine's action - Print ticket: "+m2.printTicket()+" cents. \nCostomer's Remaining Balance is "+m2.getBalance()+" cents.\n"+"TicketNumber is "+m2.getTicketNumber());


    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}