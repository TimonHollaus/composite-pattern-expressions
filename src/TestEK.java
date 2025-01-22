import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestEK {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Variable v = new Variable("x", 10);
        Ausdruck a1 = new Subtraktion(new Multiplikation(new Zahl(4),new Subtraktion(v, new Zahl(5))), new Zahl(3.5));

        a1.toString(sb);
        System.out.println(a1.wert());

        v.setWert("x", 4);
        System.out.println(a1.wert());
        System.out.println(v.darstellung());
        a1.toString(sb);
        System.out.println(sb.toString());

        Ausdruck a2 = new Addition(new Sinus(new Zahl(90)),new Cosinus(new Zahl(1)));
        System.out.println(a2.darstellung());

    }
}