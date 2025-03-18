public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("João");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setMatricula(123);
        a1.setCurso("Informática");
        a1.setIdade(20);
        a1.setSexo("F");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(321);
        b1.setNome("José");
        b1.setSexo("M");
        b1.setBolsa(15.5f);
        b1.setIdade(25);
        b1.pagarMensalidade();
        b1.renovarBolsa();
    }
}