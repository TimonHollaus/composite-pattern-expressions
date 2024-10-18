/**
 * Dividiert 2 übergenene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Division implements Ausdruck{
      Ausdruck a;
      Ausdruck b;
      public Division(Ausdruck a, Ausdruck b){
            this.a = a;
            this.b = b;
      }
      @Override
      public double wert(){
            return a.wert() / b.wert();
      }

      @Override
      public String darstellung() {
            return "(" + a.wert() + " / " + b.wert() + ") = " + this.wert();
      }
}
