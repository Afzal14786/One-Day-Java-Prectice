package Project;

import java.util.Scanner;

class farmer {
    String name;
    String address;
    String panNum;
    long aadharNum;
    int loanAmount;
    float timeDuration;
    static float intrestRate;
    float simpleIntrest;

    static{
        intrestRate=5.2f;
    }
    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        name = scan.nextLine();
        System.out.println("Your name is :" + name);

        System.out.println("Enter your address:");
        address= scan.nextLine();
        System.out.println("Your address is :" + address);

        System.out.println("Enter your PAN Number:");
        panNum = scan.nextLine();
        System.out.println("Your PAN Number is :" + panNum);

        System.out.println("Enter Your aadhar number:");
        aadharNum = scan.nextLong();
        System.out.println("Yr aaddhar number is :" + aadharNum);

        System.out.println("Enter the loan amount, you required:");
        loanAmount = scan.nextInt();
        System.out.println("Your Loan amount is :" + loanAmount);

        System.out.println("Enter the time duration:");
        timeDuration = scan.nextFloat();
    }

    void calc()
    {
        simpleIntrest = (intrestRate * loanAmount * timeDuration)/100;
    }
    void res()
    {
        System.out.println("Intrest Amount is :" + simpleIntrest);
    }
    void total()
    {
        float total = loanAmount + simpleIntrest;
        System.out.println("Your Total Amount is :" + total);
    }
}

public class farmerLoan {
    public static void main(String[] args) {
        farmer f = new farmer();
        farmer f1 = new farmer();
        f.input();
        f.calc();
        f.res();
        f.total();

        f1.input();
        f.calc();
        f1.res();
        f1.total();
    }
}
