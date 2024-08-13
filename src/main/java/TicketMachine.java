/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine {
  // The price of a ticket from this machine.
  private Integer price;
  // The amount of money entered by a customer so far.
  private Integer balance;
  // The total amount of money collected by this machine.
  private Integer total;
  // The number of tickets printed.
  private Integer ticketNumber;

  /**
   * Create a machine that issues tickets of the given price.
   * Note that the price must be greater than zero, and there
   * are no checks to ensure this.
   */
  public TicketMachine(Integer ticketCost) {
    price = ticketCost;
    balance = 0;
    total = 0;
    ticketNumber = 0;
  }



/*   public static void Exercise(){
    TicketMachine Machine1 = new TicketMachine(1500);
    System.out.println("\n\nExercise2.1\n==================================\nMachine1's price is "+Machine1.getPrice());
    System.out.println("Machine1's balance is "+Machine1.getBalance());
    System.out.println("now trying to insert money "+Machine1.insertMoney(1500));
    System.out.println("Machine1's balance is "+Machine1.getBalance());

    System.out.println(Machine1.printTicket());

    System.out.println("after print the ticket, the banlance is "+Machine1.getBalance());
    System.out.println("Machine1's balance is "+Machine1.getBalance());
    System.out.println("Total is "+Machine1.calculateTotal());
    System.out.println("Ticketnumber is "+Machine1.incrementTicketNumber());
    System.out.println("==================================");
  
  } */




  
  /**
   * Return the price of a ticket.
   */
  public Integer getPrice() {
    return price;
  }

  /**
   * Return ticketNumber.
   * (Increments on each print.)
   */
  public Integer getTicketNumber() {
    return ticketNumber;
  }

  /**
   * Return the amount of money already inserted for the
   * next ticket.
   */
  public Integer getBalance() {
    return balance;
  }

  /**
   * Receive an amount of money in cents from a customer.
   */
  public Integer insertMoney(Integer amount) {
    balance = balance + amount;
    return balance;
  }

  public Integer calculateTotal() {
    total = balance + total;
    return total;
  }

  public Integer incrementTicketNumber() {
    ticketNumber++;
    return ticketNumber;
  }

  /**
   * Print a ticket.
   * Update the total collected and
   * reduce the balance to zero.
   */
  public String printTicket() {
    // Increment the number of tickets printed
    incrementTicketNumber();
    // Update the total collected with the balance.
    total = total + balance;
    // Clear the balance.
    balance = 0;

    return "Ticket price: " + price + " cents. " + "Your total is " + total + ".";




  }




  
}