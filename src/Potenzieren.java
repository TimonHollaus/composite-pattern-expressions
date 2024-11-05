/**
 * Potenzeirt 2 übergenene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Potenzieren extends BinaereAusdruecke{
      public Potenzieren(Ausdruck a, Ausdruck b){
            super(a, b);
      }
      @Override
      public double wert() throws Exception {
            if(a==null || b==null){
                  throw new Exception("Einer der übergebenen Ausdrücke ist null");
            }
            return Math.pow(a.wert(), b.wert());
      }

      @Override
      public String darstellung() throws Exception {
            return "(" + a.wert() + " ^ " + b.wert() + ") = " + this.wert();
      }
}
