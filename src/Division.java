/**
 * Dividiert 2 übergenene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Division extends BinaereAusdruecke{

      public Division(Ausdruck a, Ausdruck b){
            super(a,b);
      }
      @Override
      public double wert() throws Exception {
            if(a==null || b==null){
                  throw new Exception("Einer der übergebenen Ausdrücke ist null");
            }
            if(b.wert() == 0){
                  throw new ArithmeticException("Division durch 0 nicht möglich!");
            }
            return a.wert() / b.wert();
      }

      @Override
      public String darstellung() throws Exception {
            return "(" + a.wert() + " / " + b.wert() + ") = " + this.wert();
      }

      @Override
      public void toString(StringBuilder sb) throws Exception {
            sb.append(darstellung());
      }
}
