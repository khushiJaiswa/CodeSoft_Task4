/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internship;

public class AtmMachine
{
  private double balance;
   private double deposit;
   private double withdraw;
   private int pin;

    public AtmMachine(double balance, double deposit, double withdraw,int pin)
    {
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.pin=pin;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getDeposit()
    {
        return deposit;
    }

    public void setDeposit(double deposit)
    {
        this.deposit = deposit;
    }

    public double getWithdraw()
    {
        return withdraw;
    }

    public void setWithdraw(double withdraw)
    {
        this.withdraw = withdraw;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }    
}
