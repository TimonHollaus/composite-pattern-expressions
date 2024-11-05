import java.util.*;
/**
 * Test KLasse
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class TestKlasse {
      public static void main(String[] args) throws Exception {
            Ausdruck a = new Addition(new Zahl(5), new Zahl(6));
            Ausdruck s = new Subtraktion(new Zahl(5), new Zahl(6));
            Ausdruck n = new Negieren(new Zahl(5));
            Ausdruck p = new Potenzieren(new Zahl(5), new Zahl(6));
            Ausdruck m = new Multiplikation(new Zahl(5), new Zahl(6));
            Ausdruck d = new Division(new Zahl(5), new Zahl(6));

            System.out.println(a.darstellung());
            System.out.println(s.darstellung());
            System.out.println(n.darstellung());
            System.out.println(p.darstellung());
            System.out.println(m.darstellung());
            System.out.println(d.darstellung());

            System.out.println();

            List<Ausdruck> Ausdruecke = new ArrayList<>();
            Ausdruecke.add(new Zahl(5));
            Ausdruecke.add(new Zahl(10));
            Ausdruecke.add(new Zahl(3));
            Ausdruecke.add(a);
            Ausdruecke.add(s);
            Ausdruecke.add(n);
            Ausdruecke.add(p);
            Ausdruecke.add(m);
            Ausdruecke.add(d);

            Ausdruck minAusdruck = new Minimum(Ausdruecke);
            System.out.println(minAusdruck.darstellung());

            System.out.println();

            Ausdruck maxAusdruck = new Maximum(Ausdruecke);

            System.out.println(maxAusdruck.darstellung());
      }
}
