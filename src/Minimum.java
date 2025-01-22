import java.util.List;
/**
 * Gibt das Minimum einesr Ausdrucksliste zurück
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Minimum extends MinMaxRechnung {

      public Minimum(List<Ausdruck> ausdruecke) {
            super(ausdruecke);
      }
      @Override
      public double wert() throws Exception {
            if (ausdruecke.isEmpty()) {
                  return 0;  // Falls die Liste leer ist, gib 0 zurück.
            }
            double ergebnis = ausdruecke.get(0).wert();
            for(int i = 1; i < ausdruecke.size(); i++) {
                  if(ausdruecke.get(i).wert() < ergebnis) {
                        ergebnis = ausdruecke.get(i).wert();
                  }
            }
            return ergebnis;
      }

      @Override
      public String darstellung() throws Exception {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum (");

            for (int i = 0; i < ausdruecke.size(); i++) {
                  sb.append(ausdruecke.get(i).wert());
                  if (i < ausdruecke.size() - 1) {
                        sb.append(", ");
                  }
            }

            sb.append(") = ").append(this.wert());
            return sb.toString();
      }

      @Override
      public void toString(StringBuilder sb) throws Exception {
            sb.append(darstellung());
      }
}