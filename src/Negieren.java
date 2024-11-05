/**
 * Negiert 2 übergenene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Negieren implements Ausdruck{
      Ausdruck a;
      public Negieren(Ausdruck a){
            this.a = a;
      }

      public double wert() throws Exception {
            if(a==null){
                  throw new Exception("Einer der übergebenen Ausdrücke ist null");
            }
            if(a.wert() == 0){
                  return 0;
            }
            return a.wert()*-1;
      }

      @Override
      public String darstellung() throws Exception {
            return "(" + a.wert() + " * -1 ) = " + this.wert();
      }
}
