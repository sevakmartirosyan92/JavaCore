package classwork.tester;

public class Alpha {
    static String s = "";

    protected Alpha() {
        s += "alpha";
    }
}

class SubAlpha extends Alpha {
    private SubAlpha() {
        s += "sub ";
    }
}
