class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,

    byte[] daysDefaulted = {1, 4, 8, 14, 20, 23, 26, 29}; 
   
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them

    float amountPerDay = 500; float amountPaid = 1100;
   
   // declare all the variables needed for your calculations
    float totalAmountToPay=0; byte daysPaid; byte dayNotPaid; 
    byte daysNotPaid; byte daysDefaultedNo = (byte)daysDefaulted.length;
    float amountNotPaid; float amountLeft; float amountDue; 
    float amountExtra;

   // calculate and print total amount the debtor is to pay using for each loop
    for(byte day : daysDefaulted) {
      
      totalAmountToPay += amountPerDay;
    }
      System.out.println("The total amount to pay is " + totalAmountToPay);


   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. 
    daysPaid = (byte) (amountPaid/amountPerDay);
    System.out.println("The days the debtor paid for are " + daysPaid);
       System.out.print("The days paid for are ");
    for(int i=0; i<daysPaid; i++){
     
      System.out.print(" " + daysDefaulted[i]);
      
    }
    
   //Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
     if(amountPaid%amountPerDay > 0){
      dayNotPaid = daysDefaulted[daysPaid];
      amountLeft = amountPerDay - (amountPaid%amountPerDay);
      System.out.println("\n Yes there was an incomplete day " + dayNotPaid + " and amount left to pay was " + amountLeft);
      
   }
    else{
      System.out.println("All days were complete");
      
    }

    
    
  
   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
    if(totalAmountToPay > amountPaid){
      amountDue = totalAmountToPay-amountPaid;
      daysNotPaid = (byte) (daysDefaultedNo-daysPaid);
    
    System.out.println("The debtor is to pay " + amountDue);
    System.out.println("Days not payed are " + daysNotPaid);
    }


    else if(totalAmountToPay == amountPaid){
        System.out.println("You have paid the exact amount needed");

    }
   
    else if(totalAmountToPay < amountPaid){
      amountExtra = amountPaid - totalAmountToPay;
      System.out.println("You have paid " + amountExtra + " extra");
    }
   //kindly remove the statement below when you are done with the assignment
  
  }
}