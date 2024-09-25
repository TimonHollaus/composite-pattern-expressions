public class Multiplikation implements Ausdruck{

      Ausdruck a;
      Ausdruck b;
      public Multiplikation(Ausdruck a, Ausdruck b){
            this.a = a;
            this.b = b;
      }
      @Override
      public double wert(){
            return a.wert() * b.wert();
      }

      @Override
      public String darstellung() {
            return "(" + a.wert() + " * " + b.wert() + ") = " + this.wert();
      }
}
