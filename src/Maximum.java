import java.util.*;

public class Maximum implements Ausdruck{
      private final List<Ausdruck> ausdruecke;

      public Maximum(List<Ausdruck> ausdruecke) {
            this.ausdruecke = ausdruecke;
      }
      @Override
      public double wert() {
            return ausdruecke.stream().mapToDouble(Ausdruck::wert).max().orElse(Double.NaN);
      }

      @Override
      public String darstellung() {
            StringBuilder sb = new StringBuilder();
            sb.append("Maximum (");

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
