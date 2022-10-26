package chapters.chapter_09.Exercises09.E10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        double root1 = (-getB() + Math.sqrt(getDiscriminant())) /
                (2 * getA());
        return root1;
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        double root2 = (-getB() - Math.sqrt(getDiscriminant())) /
                (2 * getA());
        return root2;
    }
}
