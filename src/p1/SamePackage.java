package p1;

import p1.Protection;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("конструктор из того же самого класса");
        System.out.println("n = " + p.n);
        // доступно только для класса
        // System.out.println("n_pri = "4 + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);

    }
}
