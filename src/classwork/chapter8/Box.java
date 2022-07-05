package classwork.chapter8;

//в этой программе наследования применяется для расширения класса Box
public class Box {
    private double width;
    private double height;
    private double depth;

    //сконструировать клон обьекта!
    Box(Box ob) {//передать обьект канструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор применяемый при указании всех размеров!
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструкор у которого нет размеров!
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор при создание куба
    Box(double len) {
        width = height = depth = len;
    }

    //метод расчитать и возвратить обьем
    double volume() {
        return width * height * depth;
    }
}

//расширить класс Box, включая в него поле веса
class BoxWeight extends Box {
    double weight;//вес параллелепипеда

    //сконструрировать клон обьекта
    BoxWeight(BoxWeight ob) {//передать обьект конструктору
        super(ob);
        weight = ob.weight;
    }


    // конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    //конструктор при создание куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

}