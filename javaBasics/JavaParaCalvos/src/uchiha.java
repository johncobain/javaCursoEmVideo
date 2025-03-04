public class uchiha extends ninja {
    String nivelSharingan = "Sharingan 2";

    public void sharinganAtivado(){
        System.out.println("Sharingan ativado");
    }

    @Override
    public void ataqueBase(){
        System.out.println(this.getNome() + " jogou uma kunai de fogo");
    }

    public void ataqueBase(int nivelDeChacra){
        if(nivelDeChacra>2){
            System.out.println(this.getNome() + " tem o susano ativado");
        }else if(nivelDeChacra<1){
            System.out.println(this.getNome() + " só ativou o sharingan");
        }else {
            System.out.println(this.getNome() + " está sem chacra");
        }
    }
}
