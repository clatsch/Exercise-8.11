import Prog1Tools.IOTools;

public class Punkt {

    private double x;
    private double y;


// KONSTRUKTOREN
    public Punkt(double x,double y) {
        this.getX();
        this.getY();
    }

// GETER

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

//READ

    public void read() {
        x = IOTools.readDouble();
        y = IOTools.readDouble();
    }

    @Override
    public String toString() {
         return "(" + x + "," + y + ")";
    }


}


