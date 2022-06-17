package homework.chapter8;

//в этой программе наследования применяется для расширения класса Box
public class Box {
    double width;
    double height;
    double depth;

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

    //конструктор BoxWeight
    BoxWeight(double w,double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}