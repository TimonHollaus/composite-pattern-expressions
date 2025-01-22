/**
 * Superklasse für alle Zahlen, die ebenso Ausdrücke sind
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Zahl implements Ausdruck{
      double wert;

      public Zahl(double wert){
            this.wert = wert;
      }
      @Override
      public double wert() {
            return wert;
      }

      @Override
      public String darstellung() {
            return "" + this.wert;
      }

      @Override
      public void toString(StringBuilder sb) throws Exception {
            sb.append(darstellung());
      }
}
