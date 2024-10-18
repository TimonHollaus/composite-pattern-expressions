/**
 * Potenzeirt 2 übergenene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Potenzieren implements Ausdruck{
      Ausdruck a;
      Ausdruck b;
      public Potenzieren(Ausdruck a, Ausdruck b){
            this.a = a;
            this.b = b;
      }
      @Override
      public double wert(){
            return Math.pow(a.wert(), b.wert());
      }

      @Override
      public String darstellung() {
            return "(" + a.wert() + " ^ " + b.wert() + ") = " + this.wert();
      }
}
