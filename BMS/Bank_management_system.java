import java.util.*;

public class Bank_management_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank b=new Bank();
        Admin admin=new Admin(b,1,"admin","password");
        int opt=1;
        while(opt!=3)
        {
            System.out.println("1. Admin  2. Customer  3. Quit");
            opt=sc.nextInt();
            if(opt==1)
            {
                System.out.println("Enter the name:");
                String name=sc.next();
                System.out.println("Enter the password:");
                String pass=sc.next();
                if(!admin.getName().equals(name) || !admin.getPassword().equals(pass))
                    System.out.println("Invalid Admin");
                else{
                    System.out.println("Valid Admin");
                    
                    int adOpt=1;
                    while(adOpt!=4)
                    {   
                        System.out.println("1. Add Customer  2. Delete  3. View customer 4. Logout");
                        adOpt=sc.nextInt();
                        if(adOpt==1)
                        {
                            admin.addCustomer();
                            System.out.println("Added Sucessfully");
                        }
                        else if(adOpt==2)
                        {
                            admin.deleteCustomer();
                            System.out.println("Deleted Sucessfully");
                        }
                        else if(adOpt==3)
                        {
                            admin.viewCustomer();
                        }
                    }
                    
                }
            }
            else if(opt==2)
            {
                System.out.println("-------------Login------------");
                Customer customer=admin.customerLogin();
                if(customer!=null)
                {
                    System.out.println("Login sucessfully");

                    
                    int cusOpt=1;
                    
                    while(cusOpt!=5)
                    {
                        System.out.println("1. Credit  2. Debit 3. View Transactions 4. View Balance 5. logout");
                        cusOpt=sc.nextInt();
                        if(cusOpt==1)
                        {
                            customer.credit();
                        }
                        else if(cusOpt ==2)
                        {
                            customer.debit();
                        }
                        else if(cusOpt==3)
                        {
                            customer.viewTransaction();
                        }
                        else if(cusOpt==4)
                        {
                            customer.viewBalance();
                        }
                    }


                }
                else{
                    System.out.println("Invalid User");
                }
            }
        }


    }
}

class Bank{
    private int id;
    private String name;
    private String location;
    Bank()
    {
        id=1;
        name="Bank of Baroda";
        location="erode";
    }
}
class Admin{
    private Bank bank;
    private int id;
    private String name;
    private String password;
    Scanner sc=new Scanner(System.in);
    ArrayList<Customer> customerList = new ArrayList<Customer>();
    Admin(Bank b,int idd,String name,String pass)
    {
        this.bank=b;
        this.id=idd;
        this.name=name;
        this.password=pass;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public void addCustomer()
    {
        System.out.println("Enter the Name:");
        String name=sc.next();
        System.out.println("Enter the password:");
        String pass=sc.next();
        Customer cus=new Customer(name,pass);
        customerList.add(cus);
    }

    public void deleteCustomer()
    {
        System.out.println("Enter the Customer Id:");
        int id=sc.nextInt();
        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext()) {
            Customer cus = iterator.next();
            if (cus.getCustomeId() == id) {
                iterator.remove(); 
                break;
            }
        }
    }

    public void viewCustomer(){
        for(Customer cus:customerList)
        {
            System.out.println(cus.info());
        }
    }

    public Customer customerLogin()
    {
        System.out.println("Enter the customer Name:");
        String name=sc.next();
        System.out.println("Enter the customer Password:");
        String pass=sc.next();

        for(Customer cus:customerList)
        {
            if(cus.getCustomeName().equals(name) && cus.getCustomePass().equals(pass))
                return cus;
        }

        return null;
    }

}

class Customer 
{
    static int i=0;
    private int id;
    private String name;
    private String password;
    private Account account;
    Scanner sc=new Scanner(System.in);
    Customer(String a,String b)
    {
        this.id=++i;
        this.name=a;
        this.password=b;
        this.account=new Account();
    }

    public String info()
    {
        return "Id: "+ id +" -> Name:" + name + " ->Account No: " + "" + account.Acc_no + " -> Balance: " + account.balance;
    }

    public int getCustomeId(){
        return id;
    }

    public String getCustomeName(){
        return name;
    }
    public String getCustomePass(){
        return password;
    }

    public void credit()
    {
        System.out.println("Enter the amount :");
        int amt=sc.nextInt();
        account.addBalance(amt);
    }
    public void debit()
    {
        System.out.println("Enter the amount :");
        int amt=sc.nextInt();
        account.removeBalance(amt);
    }

    public void viewTransaction()
    {
       account.transcation.display();
    }

    public void viewBalance()
    {
        System.out.println(account.balance);
    }



}

class Account  {
    static int i=100;;
    int Acc_no;
    int balance;
    Transcation transcation;
    Account()
    {
        Acc_no=++i;
        balance=1000;
        this.transcation=new Transcation();
    }

    // ArrayList<String> lst=trans.getTranscation();

    public void addBalance(int amt)
    {
        balance+=amt;
        // lst.add("Credit -> "+amt);
    }
    public void removeBalance(int amt)
    {
        if(amt>balance)
        {
            System.out.println("insufficient balance");
            return;
        }
        balance-=amt;
        // lst.add("Debit -> "+amt);
    }


}

class Transcation
{
    public ArrayList<String> history;

    Transcation()
    {
        history=new ArrayList<String>();
    }

    public ArrayList<String> getTranscation()
    {
        return history;
    }

    public void display()
    {
        System.out.println(history);
    }
}
