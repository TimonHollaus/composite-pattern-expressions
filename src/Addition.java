/**
 * Addiert 2 übergebene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Addition implements Ausdruck{
      Ausdruck a;
      Ausdruck b;
      public Addition(Ausdruck a, Ausdruck b){
            this.a = a;
            this.b = b;
      }

      public double wert(){
            return a.wert() + b.wert();
      }

      @Override
      public String darstellung() {
            return "(" + a.wert() + " + " + b.wert() + ") = " + this.wert();
      }
}
