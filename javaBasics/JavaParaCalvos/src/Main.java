public class Main {
    public static void main(String[] args) {
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.setIdade(16);
        naruto.temBiju = true;
        naruto.chacrahInfinito();
        naruto.ataqueBase();

        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.sharinganAtivado();
        System.out.println("Nivel Sharingan: " + sasuke.nivelSharingan);
        sasuke.ataqueBase();
        sasuke.ataqueBase(3);
    }
}