package tarining;

import java.util.Scanner;

public class account {
    //class variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
    //constructing class
    account(String cname ,String cid ){
        customerName = cname;
        customerId = cid;
    }
    //program for deposite money
    void deposit (int amount){
        if (amount!=0){
            balance=balance+amount;
            previousTransaction=amount;
        }
    }
    //program for withdrawn money
    void withdraw(int amount){
        if (amount!=0){
            balance=balance-amount;
            previousTransaction = -amount;
        }
    }
    //program for previous transaction
    void getprevioustransaction(){
        if (previousTransaction>0){
            System.out.println("deposit:" +previousTransaction);
        }
        else if (previousTransaction<0){
            System.out.println("withdraw:" +Math.abs(previousTransaction));
        }
        else {
            System.out.println("no transaction occured");
        }
    }
    //program for calculate interest
    void calculateinterest(int years){
        double interestrate = 0.185;
        double newbalance = (balance*interestrate*years)+balance;
        System.out.println("The current interestrate is"+(100*interestrate)+"%");
        System.out.println("After"+years+"years,your balance will be:"+newbalance);
    }
    //program for main menu
     void ShowMenu()
     {
        char option ='\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome" +customerName+ "!");
        System.out.println("your Id is"+customerId+ "!");
        System.out.println();
        System.out.println("what do you like to do?");
        System.out.println();
        System.out.println("A. Check your Balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawn");
        System.out.println("D. View perivious transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");
        do {
            System.out.println();
            System.out.println("Enter an option");
            char option1 = scanner.next().charAt(0);
            option =Character.toUpperCase(option1);
            System.out.println();
            switch (option){
                case 'A':
                    System.out.println("=================");
                    System.out.println("Balance ="+"rs"+balance);
                    System.out.println("=================");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("Enter the amount to be deposited :");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("Enter the amount to be withdraw :");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("=============");
                    getprevioustransaction();
                    System.out.println("=============");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("Enter how many years of accured interest: ");
                    int years = scanner.nextInt();
                    calculateinterest(years);
                    break;



            }
        }while (option!='F');
        System.out.println("Thank you for Banking with us ! ");
    }
}
