package atm_interface;
import java.util.Scanner;
public class ATM_Interface {
    static int balance =100000;
    public static void deposit(int amount){
        balance=balance+amount;
            System.out.println("Please collect your money.");
    }
    
    public static void withdraw(int amount){
      if(balance>=amount){
          balance=balance-amount;
            System.out.println("Please collect your money.");
      }else{
          System.out.println("Inefficient balance");
      }
    }
    public static void checkBalance(){
        System.out.println("Balance : "+balance);
    }
    public static void main(String[] args) {
       
       int amount;
       Scanner ip=new Scanner(System.in);
       while(true)
       {
           System.out.println("Automated Teller Machine");
           System.out.println("Choose options from below : ");
           System.out.println("For Withdraw - Choose 1");
           System.out.println("For Deposit - Choose 2");
           System.out.println("For Check Balance - Choose 3");
           System.out.println("For Exit - Choose 4");
           
           int choice=ip.nextInt();
           switch(choice)
           {
               case 1:   System.out.println("Enter Amount to withdraw:");
                         amount=ip.nextInt();
                         withdraw(amount);
                         break;
               case 2:   System.out.println("Enter Amount to deposit:");
                         amount=ip.nextInt();
                         deposit(amount);
                         break;
               case 3:   checkBalance();
                         break;
               case 4:   System.exit(0);
               default:   System.out.println("Wrong choice.");
               
           }
       }
    }
    
}
