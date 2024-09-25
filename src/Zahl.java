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
}
