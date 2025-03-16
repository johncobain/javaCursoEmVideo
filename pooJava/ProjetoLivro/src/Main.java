public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 18, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Martins", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria da Silva", 800, p[0]);

        System.out.println(l[0].detalhes());
        System.out.println(l[0].getLeitor().getNome());
        System.out.println(l[0].getLeitor().getIdade());
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}