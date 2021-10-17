
public class bankAccount
{
    String bankName;
    String ownerName;
    float money;
    String PIN;
    boolean isBlocked;
    
    void displayInfo(){
        System.out.println(bankName);
        System.out.println(ownerName);
    }
    void switchPower(){
        isBlocked = !isBlocked;
    }
    void displayMoney(){
        System.out.println(money); 
    }
}
