public class ContaPoupanca extends ContaCorrente{

    private double TAXA_JUROS;

    //construtor
    public ContaPoupanca(String numero, double saldo) {
        super(numero, saldo);
        TAXA_JUROS = 0.01;
    }

    public ContaPoupanca(String numero) {
        super(numero);
    }

    //rendimento
    public void renderJuros(){
            double juros = this.getSaldo() * this.TAXA_JUROS;
            this.creditar(juros);
    }

}
