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
    public void testZahl() throws Exception {
        Ausdruck zahl1 = new Zahl(5);
        assertEquals(5.0, zahl1.wert(), "Wert von Zahl1 sollte 5 sein");
        assertEquals("5.0", zahl1.darstellung(), "Darstellung von Zahl1 sollte '5' sein");
    }

    @Test
    public void testAddition() throws Exception {
        Ausdruck a = new Addition(new Zahl(5), new Zahl(6));
        assertEquals(11, a.wert());
        assertEquals("(5.0 + 6.0) = 11.0", a.darstellung());
    }

    @Test
    public void testNegation() throws Exception {
        Ausdruck n = new Negieren(new Zahl(5));
        assertEquals(-5, n.wert());
        assertEquals("(5.0 * -1 ) = -5.0", n.darstellung());
    }

    @Test
    public void testPotenzieren() throws Exception {
        Ausdruck p = new Potenzieren(new Zahl(5), new Zahl(2));
        assertEquals(25, p.wert());
        assertEquals("(5.0 ^ 2.0) = 25.0", p.darstellung());
    }

    @Test
    public void testMultiplikation() throws Exception {
        Ausdruck m = new Multiplikation(new Zahl(5), new Zahl(6));
        assertEquals(30, m.wert());
        assertEquals("(5.0 * 6.0) = 30.0", m.darstellung());
    }

    @Test
    public void testDivision() throws Exception {
        Ausdruck d = new Division(new Zahl(5), new Zahl(2));
        assertEquals(2.5, d.wert());
        assertEquals("(5.0 / 2.0) = 2.5", d.darstellung());
    }

    @Test
    public void testMinimum() throws Exception {
        List<Ausdruck> ausdruecke = new ArrayList<>();
        ausdruecke.add(new Zahl(5));
        ausdruecke.add(new Zahl(10));
        ausdruecke.add(new Zahl(3));
        ausdruecke.add(new Addition(new Zahl(5), new Zahl(6))); // 11
        ausdruecke.add(new Subtraktion(new Zahl(5), new Zahl(6))); // -1

        Ausdruck minAusdruck = new Minimum(ausdruecke);
        assertEquals(-1.0, minAusdruck.wert());
        assertEquals("Minimum (5.0, 10.0, 3.0, 11.0, -1.0) = -1.0", minAusdruck.darstellung());
    }

    @Test
    public void testMaximum() throws Exception {
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

    @Test
    public void testAdditionWithZero() throws Exception {
        Ausdruck addition = new Addition(new Zahl(0), new Zahl(8));

        assertEquals(8.0, addition.wert(), "Die Addition von 0 und 8 sollte 8 ergeben");
        assertEquals("(0.0 + 8.0) = 8.0", addition.darstellung(), "Darstellung sollte '0 + 8' sein");
    }


    @Test
    public void testMultiplikationWithZero() throws Exception {
        Ausdruck multiplikation = new Multiplikation(new Zahl(8), new Zahl(0));

        assertEquals(0.0, multiplikation.wert(), "Die Multiplikation von 5 und 0 sollte 0 ergeben");
        assertEquals("(8.0 * 0.0) = 0.0", multiplikation.darstellung(), "Darstellung sollte '8 * 0' sein");
    }

    @Test
    public void testPotenzierenWithZeroExponent() throws Exception {
        Ausdruck potenzieren = new Potenzieren(new Zahl(2), new Zahl(0));

        assertEquals(1.0, potenzieren.wert(), "Das Potenzieren von 2 mit Exponent 0 sollte 1 ergeben");
        assertEquals("(2.0 ^ 0.0) = 1.0", potenzieren.darstellung(), "Darstellung sollte '2^0' sein");
    }

    @Test
    public void testNegationOfZero() throws Exception {
        Ausdruck zahl1 = new Zahl(0);
        Ausdruck negation = new Negieren(zahl1);

        assertEquals(0.0, negation.wert(), "Die Negation von 0 sollte 0 ergeben");
        assertEquals("(0.0 * -1 ) = 0.0", negation.darstellung(), "Darstellung sollte '-0' sein");
    }

    @Test
    public void testMaxWithEqualNumbers() throws Exception {
        List<Ausdruck> ausdruecke = new ArrayList<>();
        ausdruecke.add(new Zahl(5));
        ausdruecke.add(new Zahl(5));
        Ausdruck max = new Maximum(ausdruecke);

        assertEquals(5.0, max.wert(), "Das Maximum zwischen 5 und 5 sollte 5 ergeben");
        assertEquals("Maximum (5.0, 5.0) = 5.0", max.darstellung(), "Darstellung sollte 'Max(5, 5)' sein");
    }

    @Test
    public void testMinWithEqualNumbers() throws Exception {
        List<Ausdruck> ausdruecke = new ArrayList<>();
        ausdruecke.add(new Zahl(5));
        ausdruecke.add(new Zahl(5));
        Ausdruck min = new Minimum(ausdruecke);

        assertEquals(5.0, min.wert(), "Das Min zwischen 5 und 5 sollte 5 ergeben");
        assertEquals("Minimum (5.0, 5.0) = 5.0", min.darstellung(), "Darstellung sollte 'Min(5, 5)' sein");
    }

    @Test
    public void testMaxWithEmptyArray() throws Exception {
        // Test für Max mit einem leeren Array (Fehlerbehandlung)
        List<Ausdruck> ausdruecke = new ArrayList<>();
        Ausdruck max = new Maximum(ausdruecke);

        assertEquals(0, max.wert(), "Das Maximum eines Arrays mit einem Element (0) sollte 0 ergeben");
    }


    @Test
    public void testMinWithEmptyArray() throws Exception {
        // Test für Min mit einem leeren Array (Fehlerbehandlung)
        List<Ausdruck> ausdruecke = new ArrayList<>();
        Ausdruck min = new Maximum(ausdruecke);

        assertEquals(0, min.wert(), "Das Minimum eines Arrays mit einem Element (0) sollte 0 ergeben");
    }
}
