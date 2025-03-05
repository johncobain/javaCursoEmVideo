import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
        //System.out.println("A nota é " + nota);
        //System.out.format("A nota de %s foi %.2f\n", nome, nota);
        System.out.printf("A nota de %s foi %.2f\n", nome, nota);
    }
}