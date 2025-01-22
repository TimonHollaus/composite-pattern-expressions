/**
 * Negiert 2 übergenene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Sinus implements Ausdruck{
    Ausdruck a;
    public Sinus(Ausdruck a){
        this.a = a;
    }

    public double wert() throws Exception {
        if(a==null){
            throw new Exception("Einer der übergebenen Ausdrücke ist null");
        }
        if(a.wert() == 0){
            return 0;
        }
        return Math.sin(a.wert());
    }

    @Override
    public String darstellung() throws Exception {
        return "sin(" + a.wert() + ") = " + this.wert();
    }

    @Override
    public void toString(StringBuilder sb) throws Exception {
        sb.append(darstellung());
    }
}
