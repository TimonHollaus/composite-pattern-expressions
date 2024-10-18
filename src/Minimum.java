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
      public double wert() {
            return ausdruecke.stream().mapToDouble(Ausdruck::wert).min().orElse(Double.NaN);
      }

      @Override
      public String darstellung() {
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
}