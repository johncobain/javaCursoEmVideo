

public class Main {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (float)(n1 + n2) / 2;
        System.out.println("A média é igual a " + m);

        int numero = 5;
        int valor = 5 + numero++;
        System.out.println("O valor e " + valor);

        numero = 5;
        valor = 5 + ++numero;
        System.out.println("O valor e " + valor);

        int x = 25;
        int sqrt = (int) Math.sqrt(x);
        System.out.println("A raiz quadrada de " + x + " e " + sqrt);

        double ran = Math.random();
        int n = 10 + (int) (ran * 90);
        System.out.println(n);
    }
}