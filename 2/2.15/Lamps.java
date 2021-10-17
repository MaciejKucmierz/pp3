
public class Lamps
{
    String name;
    boolean isOn;
    
    void turnOn(){
        isOn = true;
    }
    void turnOff(){
        isOn = false;
    }
    void powerStatus(){
        System.out.println(isOn);
    }
}
