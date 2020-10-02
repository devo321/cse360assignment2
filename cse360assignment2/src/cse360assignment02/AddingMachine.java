package cse360assignment02;

public class AddingMachine {
  private int total;
  public String rtrnString = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }


  /**
   * Returns total
   * @return    total
   */
  public int getTotal () {
    return total;
  }
  

  /**
   * Adds param to total
   * @param value
   */
  public void add (int value) {
      total += value;
      rtrnString += " + " + value;
  }

  /**
   * Subtracts param from total 
   * @param value
   */
  public void subtract (int value) {
      total -= value;
      rtrnString += " - " + value;
  }

  /**
   * Returns the history of transactions done to the total
   * @return string The string of all the operations done to total 
   */
  public String toString () {
    return rtrnString;
  }

  /**
   * Clears the history of transactions
   */
  public void clear() {
      total = 0;
      rtrnString = "0";
  }

  public static void main(String args[]){
      /*
      
      Tests for AddingMachine class
      
      */

      //Create new adding machine
      AddingMachine myCalculator = new AddingMachine();

      //Operations done to total
      myCalculator.add(4);  
      myCalculator.subtract(2);
      myCalculator.add(5);

      //Print total and history
      System.out.println("Total: " + myCalculator.getTotal());
      System.out.println("String: " + myCalculator.toString());

      //clear string
      myCalculator.clear();

      //print cleared string
      System.out.println("Cleared String: " + myCalculator.toString());

      //New operations
      myCalculator.add(12);
      myCalculator.subtract(15);
      myCalculator.add(1);

      //Print new total and hisory 
      System.out.println("Total: " + myCalculator.getTotal());
      System.out.println("String: " + myCalculator.toString());

      //clear history
      myCalculator.clear();

    



  }


}
