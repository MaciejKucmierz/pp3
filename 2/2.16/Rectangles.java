
public class Rectangles
{
    int height;
    int width;
    
    void showDimensions(){
        System.out.println("height = " + height);
        System.out.println("width = " + width);
    }
    void calculatePerimeters(){
        int perimeter = height * 2 + width * 2;
        System.out.println("Perimeter = " + perimeter);
    }
    void calculateSurfaceArea(){
        int surfaceArea = height * width;
        System.out.println("Surface Area = " + surfaceArea);
    }
}
