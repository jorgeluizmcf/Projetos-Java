import java.util.ArrayList;

public class Agenda  {
   private boolean criou;

    public Agenda(boolean criou) {
        this.criou = criou;
    }

    public ArrayList<Consulta> ListaConsultas = new ArrayList<Consulta>();

    public void adicionar(Consulta consulta){
        boolean achou = false;
        for(int i = 0; i <= ListaConsultas.size(); i++){
            if (consulta.getAno() == ListaConsultas.get(i).getAno() && consulta.getMes() == ListaConsultas.get(i).getMes() && consulta.getDia() == ListaConsultas.get(i).getDia() && consulta.getHora() == ListaConsultas.get(i).getHora()){
                achou = true;
            }
        }
        if (achou == false){
            ListaConsultas.add(consulta);
        } else {
            new Exception("Horário Ocupado");
        }
    }

    public void confirmar(Consulta consulta){
        int achou = 0;
        for(int i = 0; i <= ListaConsultas.size(); i++){
            if (consulta.getAno() == ListaConsultas.get(i).getAno() && consulta.getMes() == ListaConsultas.get(i).getMes() && consulta.getDia() == ListaConsultas.get(i).getDia() && consulta.getHora() == ListaConsultas.get(i).getHora()){
                if (ListaConsultas.get(i).getStatus() == 0){
                    ListaConsultas.get(i).setStatus(1);
                    achou = 1;
                    break;
                } else {achou = 2; break;}
            } else {achou = 3;}
        }
        switch (achou){
            case 2:
                new Exception("Status Inválido");
                break;
            case 3:
                new Exception("Consulta Não Encontrada");
                break;
        }
    }

    public void realizar(Consulta consulta){
        int achou = 0;
        for(int i = 0; i <= ListaConsultas.size(); i++){
            if (consulta.getAno() == ListaConsultas.get(i).getAno() && consulta.getMes() == ListaConsultas.get(i).getMes() && consulta.getDia() == ListaConsultas.get(i).getDia() && consulta.getHora() == ListaConsultas.get(i).getHora()){
                if (ListaConsultas.get(i).getStatus() == 1){
                    ListaConsultas.get(i).setStatus(2);
                    achou = 1;
                    break;
                } else {achou = 2; break;}
            } else {achou = 3;}
        }
        switch (achou){
            case 2:
                new Exception("Status Inválido");
                break;
            case 3:
                new Exception("Consulta Não Encontrada");
                break;
        }
    }

    public void cancelar(Consulta consulta){
        int achou = 0;
        for(int i = 0; i <= ListaConsultas.size(); i++){
            if (consulta.getAno() == ListaConsultas.get(i).getAno() && consulta.getMes() == ListaConsultas.get(i).getMes() && consulta.getDia() == ListaConsultas.get(i).getDia() && consulta.getHora() == ListaConsultas.get(i).getHora()){
                if (ListaConsultas.get(i).getStatus() == 0 || ListaConsultas.get(i).getStatus() == 1){
                    ListaConsultas.get(i).setStatus(3);
                    achou = 1;
                    break;
                } else {achou = 2; break;}
            } else {achou = 3;}
        }
        switch (achou){
            case 2:
                new Exception("Status Inválido");
                break;
            case 3:
                new Exception("Consulta Não Encontrada");
                break;
        }
    }


    public void listar(int dia, int mes, int ano, int hora){
        for (int i = 0; i <= ListaConsultas.size(); i++){
            if (dia == ListaConsultas.get(i).getDia() || mes == ListaConsultas.get(i).getMes() || ano == ListaConsultas.get(i).getAno() || hora == ListaConsultas.get(i).getHora()){
                ListaConsultas.get(i).mostrar();
            }
        }
    }

    public Paciente pesquisar(String cpf){
        boolean achou = false;
        for (int i = 0; i <= ListaConsultas.size(); i++){
            if (ListaConsultas.get(i).getPaciente().getCpf() == cpf){
                ListaConsultas.get(i).mostrar();
                achou = true;
            }
        }

        if(achou == false){
            System.out.println("Nenhuma consulta encontrada para o CPF informado.");
        }
        return null;
    }
}