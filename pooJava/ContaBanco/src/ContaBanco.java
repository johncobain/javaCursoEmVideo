public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual(){
        System.out.println("----------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("----------------");
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if(tipo.equals("CC")){
            setSaldo(50);
        }else if(tipo.equals("CP")){
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Conta não pode ser fechada com dinheiro!");
        }else if(getSaldo() < 0){
            System.out.println("Conta não pode ser fechada com débito!");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float valor){
        if(getStatus()){
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + getDono());
        }else{
            System.out.println("Conta está fechada!");
        }
    }

    public void sacar(float valor){
        if(getStatus()){
            if(getSaldo()>=valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }
    }

    public void pagarMensal(){
        float valor = 0;
        if(getTipo().equals("CC")){
            valor = 12;
        }else if(getTipo().equals("CP")){
            valor = 20;
        }
        if(getStatus()){
            setSaldo(getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso!");
        }else{
            System.out.println("Conta está fechada!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
