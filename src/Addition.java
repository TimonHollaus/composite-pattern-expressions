import java.util.EmptyStackException;

/**
 * Addiert 2 übergebene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Addition extends BinaereAusdruecke{
      public Addition(Ausdruck a, Ausdruck b){
          super(a, b);
      }

      public double wert() throws Exception {
            if(a==null || b==null){
                  throw new Exception("Einer der übergebenen Ausdrücke ist null");
            }
            return a.wert() + b.wert();
      }

      @Override
      public String darstellung() throws Exception {
            return "(" + a.wert() + " + " + b.wert() + ") = " + this.wert();
      }

      public void toString(StringBuilder sb) throws Exception {
            sb.append(this.darstellung());
      }
}
