import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

/**
 * Junit Test KLasse
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Tests {

    @Test
    public void testAddition() {
        Ausdruck a = new Addition(new Zahl(5), new Zahl(6));
        assertEquals(11, a.wert());
        assertEquals("(5.0 + 6.0) = 11.0", a.darstellung());
    }

    @Test
    public void testNegation() {
        Ausdruck n = new Negieren(new Zahl(5));
        assertEquals(-5, n.wert());
        assertEquals("(5.0 * -1 ) = -5.0", n.darstellung());
    }

    @Test
    public void testPotenzieren() {
        Ausdruck p = new Potenzieren(new Zahl(5), new Zahl(2));
        assertEquals(25, p.wert());
        assertEquals("(5.0 ^ 2.0) = 25.0", p.darstellung());
    }

    @Test
    public void testMultiplikation() {
        Ausdruck m = new Multiplikation(new Zahl(5), new Zahl(6));
        assertEquals(30, m.wert());
        assertEquals("(5.0 * 6.0) = 30.0", m.darstellung());
    }

    @Test
    public void testDivision() {
        Ausdruck d = new Division(new Zahl(5), new Zahl(2));
        assertEquals(2.5, d.wert());
        assertEquals("(5.0 / 2.0) = 2.5", d.darstellung());
    }

    @Test
    public void testMinimum() {
        List<Ausdruck> ausdruecke = new ArrayList<>();
        ausdruecke.add(new Zahl(5));
        ausdruecke.add(new Zahl(10));
        ausdruecke.add(new Zahl(3));
        ausdruecke.add(new Addition(new Zahl(5), new Zahl(6))); // 11
        ausdruecke.add(new Subtraktion(new Zahl(5), new Zahl(6))); // -1

        Ausdruck minAusdruck = new Minimum(ausdruecke);
        assertEquals(-1, minAusdruck.wert());
        assertEquals("Minimum (5.0, 10.0, 3.0, 11.0, -1.0) = -1.0", minAusdruck.darstellung());
    }

    @Test
    public void testMaximum() {
        List<Ausdruck> ausdruecke = new ArrayList<>();
        ausdruecke.add(new Zahl(5));
        ausdruecke.add(new Zahl(10));
        ausdruecke.add(new Zahl(3));
        ausdruecke.add(new Addition(new Zahl(5), new Zahl(6))); // 11
        ausdruecke.add(new Subtraktion(new Zahl(5), new Zahl(6))); // -1

        Ausdruck maxAusdruck = new Maximum(ausdruecke);
        assertEquals(11, maxAusdruck.wert());
        assertEquals("Maximum (5.0, 10.0, 3.0, 11.0, -1.0) = 11.0", maxAusdruck.darstellung());
    }
}
