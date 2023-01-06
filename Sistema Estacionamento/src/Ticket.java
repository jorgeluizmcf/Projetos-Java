public class Ticket {
    private String dataEntrada, dataSaida, horaEntrada, horaSaida;
    private boolean statusPago;

    public Ticket(String dataEntrada, String horaEntrada) {
        this.dataEntrada = dataEntrada;
        this.horaEntrada = horaEntrada;
        this.statusPago = false;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void setStatusPago(boolean statusPago) {
        this.statusPago = statusPago;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public boolean isStatusPago() {
        return statusPago;
    }

    public CalcularValor(){

    }
}
