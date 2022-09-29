public class Main {

    public static void main(String[] args) {
        Fraction f = new Fraction(2, 4);
        Fraction g = new Fraction(4, 8);

        int t = f.getNumerateur() / f.getDenominateur();
        //assert t == 5 / 4 : "La Fraction ne correspond pas.";

        System.out.println(f.FracEquals(g));
        
    }
}