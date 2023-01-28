import java.util.Scanner;
public class TestBank {
    public void bankworking()
    {
        int x;
        int ans;
        Scanner scn=new Scanner(System.in);
        Customer c=new Customer();
        c.login();
        do
        {
            System.out.println("Please select the option below :");
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Check Balance");
            System.out.println("4.Edit Profile");
            System.out.println("5.Change Password");
            System.out.println("6.Exit");
            x=scn.nextInt();
            switch(x)
            {
                case 1:
                c.deposit();
                break;
        
                case 2:
                c.withdrawal();
                break;
        
                case 3:
                c.checkBalance();
                break;
        
                case 4:
                c.editProfile();
                break;
        
                case 5:
                c.changePassword();
                break;
        
                case 6:
                break;
        
                default:
                System.out.println("Invalid selection");
            }
            System.out.println("Do you want to continue : select 1 for YES");
            System.out.println("                          select any number for NO");   
            ans=scn.nextInt();
        }while(ans==1);

        System.out.println("*********Welcome to ABC Bank Limted*************");
    }
}
