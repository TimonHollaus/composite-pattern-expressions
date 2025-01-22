/**
 * Negiert 2 übergenene Zahlen
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public class Cosinus implements Ausdruck{
    Ausdruck a;
    public Cosinus(Ausdruck a){
        this.a = a;
    }

    public double wert() throws Exception {
        if(a==null){
            throw new Exception("Einer der übergebenen Ausdrücke ist null");
        }
        if(a.wert() == 0){
            return 0;
        }
        return Math.cos(a.wert());
    }

    @Override
    public String darstellung() throws Exception {
        return "cos(" + a.wert() + ") = " + this.wert();
    }

    @Override
    public void toString(StringBuilder sb) throws Exception {
        sb.append(darstellung());
    }
}
