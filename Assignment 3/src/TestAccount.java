import java.util.*;
public class TestAccount {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Account a1=new Current();
        Account a2=new Saving();
        a1.minimumBalance=0;
        a2.minimumBalance=500;
        System.out.println("Entering Details of Current Account");
        System.out.println("Enter Account Id: ");
        a1.accountId=scn.nextInt();
        System.out.println("Give Description : ");
        a1.description=scn.next();

        System.out.println("Entering Details of Saving  Account");
        System.out.println("Enter Account Id: ");
        a2.accountId=scn.nextInt();
        System.out.println("Give Description : ");
        a2.description=scn.next();

        a1.display();
        a2.display();
    }
    
}
