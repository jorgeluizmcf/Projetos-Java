import java.util.ArrayList;

public class Estacionamento {

    private int capacidade;
    public ArrayList<Carro> lista = new ArrayList<Carro>();
    private double caixa;

    public Estacionamento(int capacidade) {
        this.capacidade = capacidade;
        this.caixa = 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public void Entrar(Carro carro) {
       if(lista.size() >= capacidade){
           System.out.println("Estacionamento Cheio!");
       }else {
           Carro carro_lista = carro;
           lista.add(carro_lista);
       }
    }

    public void Sair(String placa) {
        for (int i = 0; i <= lista.size(); i++) {
            if (lista.get(i).getPlaca().equals(placa)) {
                lista.remove(lista.get(i));
            }
        }
    }

    public void Consutar(String placa){
        for (int i = 0; i <= lista.size(); i++) {
            if (lista.get(i).getPlaca().equals(placa)) {
                lista.get(i).getPlaca();
                lista.get(i).getMarca();
                lista.get(i).getModelo();
                lista.get(i).getTicket();
            }
        }
    }

    public void ReceberPagamento(String placa){
        for (int i = 0; i <= lista.size(); i++) {
            if (lista.get(i).getPlaca().equals(placa)) {
              this.caixa +=  lista.get(i).getTicket().CalcularValor();
            }
        }
    }
}
