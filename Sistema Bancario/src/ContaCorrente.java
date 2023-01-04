public class ContaCorrente {
    private String numero;
    protected double saldo;

    public ContaCorrente( String numero, double saldo ){
        this.numero = numero;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }


    public ContaCorrente(String numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public void creditar (double valor) {
        if (valor > 0) {
            saldo = getSaldo() + valor;
            System.out.println("Creditado valor " + valor);
        } else {
            System.out.println("Valor invalido para a operacao");
        }
    }

    public void debitar (double valor ){
        if (getSaldo() >= valor){
            saldo = getSaldo() - valor;
            System.out.println("Valor valido para debito");
        } else {
            System.out.println("Saldo insuficiente :(");
        }
    }

    public String getNumero (){
        return numero;
    }

    public double getSaldo (){
        return saldo;
    }
}
