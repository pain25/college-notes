
import java.util.Scanner;
class Customer
{
    Scanner read=new Scanner(System.in);
    int phno=0;
    String name=" ";
    String pswd=" ";
    void readDetails()
    {
        System.out.println("Enter name");
        name=read.nextLine();
        System.out.println("Enter phone number");
        phno=read.nextInt();
        read.nextLine();
        System.out.println("Enter password");
        pswd=read.nextLine();
    }
    void custDet()
    {
        System.out.println("Customer Name:- "+name);
        System.out.println("Phone Number:- "+phno);
        System.out.println("Password:- "+pswd);
    }
}
class Account
{
    Scanner readacc=new Scanner(System.in);
    int acn=0, blnc=0;
    String sts=" ";
    void readAccDetails()
    {
        System.out.println("Enter account number");
        acn=readacc.nextInt();
        blnc=60000;
        sts="Active";
    }
    void accDet()
    {
        System.out.println("Account number:- "+acn);
        System.out.println("Balance:- "+blnc);
        System.out.println("Status:- "+sts);
    }
}
class RBI
{
    Customer c=new Customer();
    Account a=new Account();
    int intrate=0, withdrawlmt=0;
    public void readData()
    {
        c.readDetails();
        a.readAccDetails();
    }
    public void showData()
    {
        c.custDet();
        a.accDet();
    }
    public double GetInterestRate()
    {
        intrate=4;
        return intrate;
    }
    public int GetWithdrawalLimit()
    {
        withdrawlmt=20000;
        return withdrawlmt;
    }
}
class SBI extends RBI
{
    //here override the GetInterestRate and GetwithdrawalLimit
    public double GetInterestRate()
    {
        intrate=5;
        return intrate;
    }
    public int GetWithdrawalLimit()
    {
        withdrawlmt=26000;
        return withdrawlmt;
    }
}
class ICICI extends RBI
{
    //here override the GetInterestRate and GetwithdrawalLimit
    public double GetInterestRate()
    {
        intrate=6;
        return intrate;
    }
    public int GetWithdrawalLimit()
    {
        withdrawlmt=30000;
        return withdrawlmt;
    }
}
class ass3

{
    public static void main(String args[])
    {
        RBI r=new RBI();
        r.readData();
        System.out.println("");
        r.showData();
        System.out.println("");
        r.GetWithdrawalLimit();
        System.out.println("Interest Rate for RBI="+ r.GetInterestRate());
        System.out.println("Withdrawl Limit for RBI="+ r.GetWithdrawalLimit());
        System.out.println("");
        SBI s=new SBI();
        System.out.println("Interest Rate for SBI="+ s.GetInterestRate());
        System.out.println("Withdrawl Limit for SBI="+ s.GetWithdrawalLimit());
        System.out.println("");
        ICICI i=new ICICI();
        System.out.println("Interest Rate for ICICI="+ i.GetInterestRate());
        System.out.println("Withdrawl Limit for ICICI="+ i.GetWithdrawalLimit());

    }
}


