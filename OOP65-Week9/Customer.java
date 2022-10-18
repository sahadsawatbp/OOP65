import java.util.*;
public class Customer extends CheckingAccount{
    private String firstName;
    private String lastName;
    ArrayList <Account> acct;
    private int numOfAccount;
    public Customer(){
        this("","");
        acct = new ArrayList();
    }
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    public String toString(){
        return firstName+" "+lastName+" has "+numOfAccount+" accounts.";
    }
    public Account getAccount(int index){
        return this.acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
        numOfAccount += 1;
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
    
}