/**
 * Interface für alle Ausdrücke / Navigator des Composite Patterns
 * @author Timon Hollaus
 * @version 18.10.2024
 */
public interface Ausdruck {
      abstract double wert() throws Exception;
      abstract String darstellung() throws Exception;
      void toString(StringBuilder sb) throws Exception;
}
