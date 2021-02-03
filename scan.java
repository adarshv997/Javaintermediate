import java.util.Scanner; // import the Scanner class 

class scan {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);//creating scanner object
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   //read user input
       
    System.out.println("Username is: " + userName); //output user input       
  }
}
