public class ambienteTeste {

    public static void main(String[] args) {
        ContaEspecial c;

        c = new ContaEspecial("1", 1500);
        System.out.println("Conta numero: " + c.getNumero() + " com saldo R$ " + c.getSaldo());
        c.creditar(500);
        System.out.println("Conta numero: " + c.getNumero() + " com saldo R$ " + c.getSaldo());
        c.debitar(2250);
        System.out.println("Conta numero: " + c.getNumero() + " com saldo R$ " + c.getSaldo());
    }
}
