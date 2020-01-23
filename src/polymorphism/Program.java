package polymorphism;

public class Program {
    public static void main(String[] args) {
        Insan.MeyveYemek(new Karpuz());
        Insan.MeyveYemek(new Cilek());
        Insan.MeyveYemek(new Muz());
    }
}
