import java.util.Scanner;
public class Customer {
    Scanner scn=new Scanner(System.in);
    String Name;
    String Username;
    String Password;
    int Age;
    String SSN;
    String Address;
    String Email;
    long phone;
    float Balance=500;

    public void login()
    {
      System.out.println("Enter Username :");
      Username=scn.nextLine();
      System.out.println("Enter Password :");
      Password=scn.nextLine();

    }

    public void deposit()
    {
       System.out.println("Inside Bank for Deposit");
       
       System.out.println("Enter amount to be deposit");
       int a=scn.nextInt();
       Balance=Balance+a;
       

    
    }

    public void withdrawal()
    {
        System.out.println("Inside Bank for withdrawal");
        System.out.println("Enter amount you want to withdraw");
       int a=scn.nextInt();
       Balance=Balance-a;

    }

    public void checkBalance()
    {
        System.out.println("Your current Balance is :");
        System.out.println(Balance);
    }
    public void editProfile()
    {
        System.out.println("Profile editing");
    }
    
    public void changePassword()
    {
        System.out.println("performing Change Password");
    }
}
