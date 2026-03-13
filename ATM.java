import java.util.Scanner;


class ATM 
{
    String card;
    int pin=1234;
    float inbal=0.0f;
    String name;
    int cid;
    
    public ATM(String card,String name,int cid)
    {
        this.card=card;

        this.name=name;
        this.cid=cid;
    }
    
    
    public void deposit(int upin,int amount)
    {
        
        if(upin==this.pin)
        {
            if(amount>0)
            {
                inbal+=amount;
                System.out.println("Amount Credited Successfully ");
            }
            else{
                System.out.println("Amount should be +ve value");
            }
        }
        else{
            System.out.println("Incorrect Pin");
        }
    }
    
    
    
    
    
    
    public void withdraw(int upin,int amount)
    {
        if(upin==this.pin)
        {
            if(amount<=inbal)
            {
                inbal-=amount;
                System.out.println("Amount Debited Successfully "+amount);
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Incorrect pin");
        }
    }
    
    
    
    public void checkBal(int upin)
    {
       if(upin==this.pin)
        {
            System.out.println("Current balance is: "+inbal);
        }
        else{
            System.out.println("Wrong Pin");
        }
    }
    
    
    public void setPin(int newpin)
    {
        this.pin=newpin;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        ATM hdfc = new ATM("DebitCard","Umer",123456);
        
        boolean d=true;
        while(d)
        {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Change Pin");
            
            System.out.println("Enter your choice ");
            int choice=sc.nextInt();
            
            int upin;
            int amount;
            
            switch(choice)
            {
                
                
                case 1: hdfc.deposit(sc.nextInt(),sc.nextInt());
                break;
                
                case 2: hdfc.withdraw(sc.nextInt(),sc.nextInt());
                break;
                
                case 3: hdfc.checkBal(sc.nextInt());
                break;
                
                case 4: hdfc.setPin(sc.nextInt());
                break;
                
                default:
                d=false;
                System.out.println("Thanku visit again!");
                break;
                
                
            }
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}