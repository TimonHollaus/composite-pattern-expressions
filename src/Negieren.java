public class Negieren implements Ausdruck{
      Ausdruck a;
      public Negieren(Ausdruck a){
            this.a = a;
      }

      public double wert(){
            return a.wert()*-1;
      }

      @Override
      public String darstellung() {
            return "(" + a.wert() + " * -1 ) = " + this.wert();
      }
}
