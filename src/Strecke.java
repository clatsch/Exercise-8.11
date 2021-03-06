public class Strecke {

    private Punkt p;
    private Punkt q;

    //Konstruktoren
    public Strecke(Punkt p, Punkt q) {
        this.p = p;
        this.q = q;
    }

    //READ
    public void read() {
        System.out.println("Punkt p der Strecke eingeben: ");
        p.read();
        System.out.println("Punkt q der Strecke eingeben: ");
        q.read();
    }

    //CALCULATION OF VECTOR
    public double getLaenge() {
        double xdiff = p.getX() - q.getX();
        double ydiff = p.getY() - q.getY();
        return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
    }

    @Override
    public String toString () {
        return p + "_" + q;
    }
}
