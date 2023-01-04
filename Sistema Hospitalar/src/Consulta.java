public class Consulta {
    private Paciente paciente;

    private int dia, mes, ano, hora, status;

    public Paciente getPaciente() {
        return paciente;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getStatus() {
        return status;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Consulta(Paciente paciente, int dia, int mes, int ano, int hora) {
        this.paciente = paciente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.status = 0;
    }

    public void mostrar(){
        System.out.println("Nome: " + paciente.getNome() + " " + paciente.getSobrenome() );
        System.out.println("Data: " + dia + "/" + mes + "/" + ano );
        System.out.println("Hora: " + hora);

        switch (status){
            case 0:
                System.out.println("Status: Marcada");
                break;
            case 1:
                System.out.println("Status: Confirmada");
                break;
            case 2:
                System.out.println("Status: Realizada");
                break;
            case 3:
                System.out.println("Status: Cancelada");
                break;
        }
    }
}
