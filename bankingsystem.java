
// Creating a program on real life banking system
import java.util.Scanner;
class bankingsystem {
    public static void main(String[] args) {
        System.out.print("WELCOME TO YOUR FINANCE BANK");
        int select;
        System.out.println("\n1. create a new account\n2.update your account\n3.deposit your account\n4.withdrawal amount\n5.fund transfer");
        Scanner sc = new Scanner(System.in);
        System.out.print("choose your option=");
        select = sc.nextInt();
        switch (select) {
            case 1:// Creating a new account
                System.out.println("you have chosen create a new account");
                int pass;
                String name, address;
                char chose;
                float contact_no, amt;
                System.out.print("Enter your name:-");
                name = sc.next();
                System.out.print("Enter your contact number:-");
                contact_no = sc.nextFloat();
                System.out.print("Enter your address:-");
                address = sc.next();
                System.out.print("Enter your 6 password:-");
                pass = sc.nextInt();

                System.out.println(
                        "congratulation your account has been created successfully.\n Your account details are given below");
                System.out.println(
                        "\n" + name + "\n" + contact_no + "\n" + address + "\nyour account number is 1249498014");
                System.out.println("Do you want to Deposit amount?\n press Y to continue and N to exit");
                chose = sc.next().charAt(0);
                if (chose == 'Y' || chose == 'y') {
                    System.out.print("Enter the amount to deposit");
                    amt = sc.nextFloat();
                    System.out.print("Your total amount is =" + (amt));

                } else {
                    System.out.print("Thank you for Banking us ");
                }

                break;
            case 2:// for updation of the account
                System.out.println("you have chosen to update your account");
                System.out.print("Enter your new name");
                name = sc.next();
                System.out.print("Enter your new contact number:-");
                contact_no = sc.nextFloat();
                System.out.print("Enter your  new address:-");
                address = sc.next();
                System.out.println("congratulation your account has been updated");
                System.out.println("\n" + name + "\n" + contact_no + "\n" + address);
                break;
            case 3:// deposit amount
                int acc_no = 1249498014, account_no;
                Float deposit = 0f;
                System.out.print("Enter your account number=");
                account_no = sc.nextInt();
                if (account_no == acc_no) {
                    System.out.print("welcome");
                    System.out.print("\nEnter The Amount to be Deposit=");
                    amt = sc.nextFloat();
                    deposit = deposit + amt;
                    System.out.println("your Deposited amount is=" + (deposit));

                    System.out.println("Thank you for Banking us ");
                } else {
                    System.out.print("You Have Entered The worng account number");
                    System.out.print("\nThank you for Banking us ");
                }
                break;
            case 4: // withdrawal amount
                int amount, balance = 10000, Total = 0, acc_no2, acc_no1 = 1249498014, pass2;

                System.out.print("Enter your account number=");
                acc_no2 = sc.nextInt();
                if (acc_no2 == acc_no1) {
                    System.out.print("Enter your password=");
                    pass2 = sc.nextInt();

                } else {
                    System.out.print("You have entered the wrong input");
                    break;
                }
                System.out.print("Enter the amount to be withdrawal=");
                amount = sc.nextInt();
                System.out.print("Your witbdrawal amount is=" + (amount));
                if (amount < balance) {
                    Total = balance - amount;
                    System.out.print("\nYour  total amount is =" + (Total));
                    System.out.print("\n4Thank you for banking us");
                } else {
                    System.out.print("insufficent balance");
                }
                break;
            case 5: // Fund transfer
                Float cont_no,amount2;
                System.out.print("Enter your account number=");
                acc_no2 = sc.nextInt();
                    System.out.print("Enter the amount to be transfer=");
                    amount2 = sc.nextFloat();
                    System.out.print("Enter the recipient's name=");
                    name = sc.next();
                    System.out.print("Enter The  recipient's account number=");
                    acc_no2 = sc.nextInt();
                    System.out.print("Enter The contact number of recipient's=");
                    cont_no = sc.nextFloat();
                if (amount2 < 10000) {
                    System.out.print("\nThe amount has been transfered successfully to");
                    System.out.print("\nName:-" + (name));
                    System.out.print("\nAccount number :-" + (acc_no2));
                    System.out.print("\ncontact number5:-" + (cont_no));

                } else {
                    System.out.print("insufficent balance");
                }

        }

    }

}
