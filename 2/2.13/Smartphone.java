
public class Smartphone
{
    String brand;
    String model;
    float price;
    float size;
    boolean power;
    
    void displayInfo(){
        System.out.println(brand);
        System.out.println(model);
    }
    void switchPower(){
        power = !power;
    }
    void displayInfo2(){
        System.out.println(size);
        System.out.println(price);    
    }
}
