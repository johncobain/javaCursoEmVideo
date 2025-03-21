public class Main {
    public static void main(String[] args) {
        Lobo x = new Lobo();
        Cachorro y = new Cachorro();

        x.emitirSom();
        y.emitirSom();
        y.reagir("Olá");

        y.reagir(21, 12);
    }
}