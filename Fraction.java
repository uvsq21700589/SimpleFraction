public class Fraction {

    private int numerateur;
    private int denominateur;
    private static final int ZERO = 0;
    private static final int UN = 1;

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Fraction() {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public String toString() {
        String chaine = numerateur + "/" + denominateur;
        return chaine;

    }

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public double doubleValue() {
        double d = (double) numerateur / denominateur;
        return d;
    }

    public Fraction add(Fraction g) {
        int tmp1 = this.getDenominateur();
        int tmp2 = g.getDenominateur();

        Fraction r = new Fraction(this.getNumerateur() * tmp2 + g.getNumerateur() * tmp1, tmp1 * tmp2);

        return r;
    }

    public boolean FracEquals(Fraction g) {
        int tmp1 = g.Pgcd();
        int tmp2 = this.Pgcd();
        Fraction t = new Fraction(g.getNumerateur() / tmp1, g.getDenominateur() / tmp1);
        Fraction u = new Fraction(this.getNumerateur() / tmp2, this.getDenominateur() / tmp2);
        return t.toString().equals(u.toString());
    }

    public int Pgcd() {
        int tmp1 = this.getNumerateur();
        int tmp2 = this.getDenominateur();
        while (tmp1 != tmp2) {
            if (tmp1 > tmp2)
                tmp1 = tmp1 - tmp2;
            else
                tmp2 = tmp2 - tmp1;

        }
        return tmp2;
    }
}
