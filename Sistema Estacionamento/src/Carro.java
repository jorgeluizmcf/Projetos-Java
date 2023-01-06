public class Carro {
    private String placa, modelo, cor, marca;
    private Ticket ticket;

    public Carro(String placa, String modelo, String cor, String marca, Ticket ticket) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.ticket = ticket;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
