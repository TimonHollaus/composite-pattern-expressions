public abstract class BinaereAusdruecke implements Ausdruck{
    protected Ausdruck a;
    protected Ausdruck b;

    public BinaereAusdruecke(Ausdruck a, Ausdruck b) {
        this.a = a;
        this.b = b;
    }

}
