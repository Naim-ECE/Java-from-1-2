import java.util.Scanner;
public class BankAccount {
    Scanner scan = new Scanner(System.in);
    long acno = 1890473858;
    double dep, wth;
    String acholdername = "Naim";
    public static void main(String...Naim) {
        BankAccount b = new BankAccount();
        b.getAccHolderName();
        b.getAccNum();
        b.deposit();
        b.withdraw();
        b.getAccBalance();
    }
    void deposit() {
        System.out.print("Input your deposit amount: ");
        dep = scan.nextDouble();
        scan.nextLine();
    }
    void withdraw() {
        System.out.print("Input how much you want to withdraw: ");
        wth = scan.nextDouble();
        scan.nextLine();
    }
    void getAccNum() {
        System.out.println("Account number: " + acno);
    }
    void getAccBalance() {
        System.out.println("Your current balance is: " + (dep - wth) + " taka");
    }
    void getAccHolderName() {
        System.out.println("Account holder name: " + acholdername);
    }
}