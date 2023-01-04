public class ContaEspecial extends ContaCorrente{

    private double LIMITE_CREDITO = 1000;

    public ContaEspecial(String numero, double saldo) {
        super(numero, saldo);
    }

    public ContaEspecial(String numero) {
        super(numero);
    }

    public void debitar(double valor ){
        if (valor > 0) {

            if (getSaldo() + LIMITE_CREDITO >= valor) {
                saldo = getSaldo() - valor;
            }
        }
    }
}
