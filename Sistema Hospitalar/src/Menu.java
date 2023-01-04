import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame {

    public ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();

    public Menu() {

        setTitle("NAMI - Gestão Hospitalar");
        setSize(400, 300);

        // Cria uma barra de menu para o JFrame
        JMenuBar menuBar = new JMenuBar();

        // Adiciona a barra de menu ao  frame
        setJMenuBar(menuBar);

        //Cria um item de Menu na barra de Menus
        JMenu fileMenu = new JMenu("Arquivo");
        //Adiciona o item na barra
        menuBar.add(fileMenu);

        // Cria e adiciona um item simples de submenu
        JMenuItem exitAction = new JMenuItem("Sair");

        //Adiciona os itens de submenu ao item de Menu
        fileMenu.add(exitAction);

        exitAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                System.out.println("Tamanho: " + listaPacientes.size());
                System.exit(0);
            }
        });


        JMenu editMenu = new JMenu("Paciente");
        menuBar.add(editMenu);
        JMenuItem addAction = new JMenuItem("Adicionar");
        JMenuItem searchAction= new JMenuItem("Pesquisar");
        JMenuItem listAction = new JMenuItem("Mostrar");
        editMenu.add(addAction);
        editMenu.add(searchAction);
        editMenu.add(listAction);

        addAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent addPaciente) {
                AddPaciente jnlAddPaciente = new AddPaciente(Menu.this,"Adicionar Paciente");
            }
        });

        listAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListPacientes jnlListPacientes = new ListPacientes(Menu.this,"Pacientes");
            }
        });


        searchAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarConsulta janelaPesquisa = new MostrarConsulta(Menu.this, "Pesquisar");
            }
        });

        JMenu consultaMenu = new JMenu("Consulta");
        menuBar.add(consultaMenu);
        JMenuItem agendarAction = new JMenuItem("Agendar Consulta");
        JMenuItem mostrarAction = new JMenuItem("Mostrar");
        consultaMenu.add(agendarAction);
        consultaMenu.add(mostrarAction);

        agendarAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent agendarConsulta) {
                AgendarConsulta jnlAgendarConsulta = new AgendarConsulta(Menu.this,"Agendar Consulta");
            }
        });

        mostrarAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarConsulta jnlMostrarConsulta = new MostrarConsulta(Menu.this, "Mostrar Consultas");
            }
        });

        JMenu ajudaMenu = new JMenu("Ajuda");
        menuBar.add(ajudaMenu);
        JMenuItem aboutAction = new JMenuItem("Sobre");
        ajudaMenu.add(aboutAction);

        aboutAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ajuda jnlAjuda = new Ajuda(Menu.this,"Sobre");
            }
        });


        setVisible(true);
    }
}