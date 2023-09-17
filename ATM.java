/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internship;

import java.util.Scanner;

public class ATM 
{
     public static void main(String[] args)
    {
           
            Scanner sc = new Scanner(System.in);
            System.out.println("******Welcome to ATM Machine******");  
            System.out.println("Enter your details:");
            System.out.println("Enter your userid:");
            String userid=sc.next();
            System.out.println("Enter your name:");
            String name=sc.next();
          
             AtmMachine a = new AtmMachine(2000000, 0, 0, 12345);
            for( ; ; )
            { 
            System.out.println("Choose one of the following option");
            System.out.println("1.Withdraw Amount\n 2.Deposit Amount\n 3.Check Balance\n 4.Exit");
            int option = sc.nextInt();
            
            switch(option)
            {
                case 1: System.out.println("Enter a amount to withdraw ");
                double withdraw =sc.nextDouble();
                System.out.println("Enter your pin:");
                int pin1=sc.nextInt();
                if(pin1==a.getPin())
                {
                if(a.getBalance()>=withdraw)
                {
                   double balance= a.getBalance()- withdraw;
                    System.out.println("Collect your money - " +balance);
                } 
                else
                {
                    System.out.println("Insufficient Amount");
                }
                }
                else
                {
                    System.out.println("Enter a correct pin");
                }
                  System.out.println();
                  break;
                    
                case 2:  System.out.println("Enter money to deposited:");
                 double deposit =sc.nextDouble();
                double nbalance = a.getBalance() + deposit;
                   System.out.println("Your money is deposited sucessfully");
                   System.out.println();
                   break;
                  
                case 3: System.out.println("Check Balance");
                 System.out.println("Enter your pin");
                 int pin2=sc.nextInt();
                if(pin2==a.getPin())
                {
                    System.out.println("Your Total Balance is " + a.getBalance());
                }
                else
                {
                    System.out.println("Enter a correct pin");
                }
                    System.out.println();
                    break;
                    
                case 4: 
                    System.exit(0);
                    System.out.println();
                   break;
                   
                default:
                    System.out.println("Please enter correct option");
                    System.out.println();
               }
           }
        }     
}
