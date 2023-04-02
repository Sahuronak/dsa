import java.io.*;
import java.util.*;
class Account implement Serializable{
    String accoNo;
    String name;
    double balance;
    Account(){}
    Account(String a, String n, double b){
        accoNo = a;
        name = n;
        balance = b;
    }
    public String toString(){
        return "Account No.: "+accoNo+"\nName"+name+"\nBalance:"+balance+"\n";
    }

}
public class menuDriven {
    public static void main(String[] arg)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Account acc=null;
        HashMap<String.Account>hm= new HashMap<>();
        try {
            FileInputStream fis= new FileInputStream("Account.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for(int i=0; i<count; i++){
                acc (Account)ois.readObject();
                System.out.int(acc);
                hm.put(acc.accNo,acc);
            }
            fis.close();
            ois.close();
        } catch (Exception e) {
           
        }
        FileInputStream fos= new FileInputStream("Account.txt");
        ObjectInputStream oos =new ObjectInputStream(fos);
        System.out.println("Menu");

        int choice;
        String accNo.name;
        double balance;
        do{
            System.out.println("1. Create Account: ");
            System.out.println("2. delete Account: ");
            System.out.println("3. view Account: ");
            System.out.println("4. view all Account: ");
            System.out.println("5. save Accounts: ");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");
           choice= sc.nextInt();
           sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

           switch(choice){

            case1:System.out.println("enter details accno.,  name, balance:");
            accNo= sc.nextLine();
            name=sc.nextLine();
            balance.nextDouble();
            acc= new Account(accNo, name, balance);
            hm.put(accNo,acc);
            System.out.println("Account Created for "+name);

            break;
            case2:System.out.println("enter accno.:");
            accNo=sc.nextLine();
            hm.remove(accNo);

            break;

            case3:System.out.println("enter account:");
            accNo= sc.nextLine();
            acc=hm.get(accNo);
            hm.put(accNo,acc);
            System.out.println(acc);
            break;
            
            case 4:for(Account a:hm.valur())
            System.out.println(a);
            break;
            case5:
            case 6: oos.writeInt(hm.size());
            for(Account a:hm.value())
            oos.writeObject(a);
        }
        while(choice!=5);
        oos.close();
        oos.flush();
        fos.close();
        
    }
}
