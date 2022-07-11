package classwork.lessons2451011161718.lesson10;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth){
       this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){
        return width * height * depth;
    }
}
