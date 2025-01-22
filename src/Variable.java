import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Variable extends Zahl {
    private double value;
    private String name;
    public Variable(String name, double wert) {
        super(wert);
        this.value = wert;
        this.name = name;
    }
    public void setWert(String name, double wert) {
        if(name.equals(this.name)) {
            this.value = wert;
        }
        else {
            throw new IllegalArgumentException("Variable '" + name + "' ist kein Wert");
        }
    }
    @Override
    public double wert() {
        return this.value;
    }

    @Override
    public String darstellung() {
        return "" + this.name;
    }
}