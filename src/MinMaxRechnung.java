import java.util.List;
/**
 * Superklasse für Min/Max Klassen, enthält die Lsite
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class MinMaxRechnung implements Ausdruck {

    public List<Ausdruck> ausdruecke;
    public MinMaxRechnung(List<Ausdruck> ausdruecke) {
        this.ausdruecke = ausdruecke;
    }
    public List<Ausdruck> getAusdruecke() {
        return ausdruecke;
    }

    public void setAusdruecke(List<Ausdruck> ausdruecke) {
        this.ausdruecke = ausdruecke;
    }

    @Override
    public double wert() throws Exception {
        return 0;
    }
    @Override
    public String darstellung() throws Exception {
        return null;
    }

    @Override
    public void toString(StringBuilder sb) throws Exception {
        sb.append(darstellung());
    }
}
