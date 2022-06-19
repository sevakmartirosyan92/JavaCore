package homework.chapter8.area;

public class FindArea {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;

        figref = r;
        System.out.println(figref.area());

        figref = t;
        System.out.println(figref.area());

        figref = f;
        System.out.println(figref.area());
    }
}
