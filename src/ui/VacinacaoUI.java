package ui;

import filas.FilaParaVacina;
import paciente.Paciente;
import util.Entrada;

public class VacinacaoUI {
    FilaParaVacina fila = new FilaParaVacina();
    Entrada entrada = new Entrada();

    public void adicionaPaciente() {
        String nome = entrada.inString("Digite o nome do paciente:");
        int idade = entrada.inInt("Digite a idade de " + nome + ":");
        Paciente paciente = new Paciente(nome, idade);

        fila.adicionaNaListaDePacientes(paciente);        
    }

    public void vacinaPaciente() {
        if (fila.vacinaPacientePrioritario()) {
            System.out.println("Paciente vacinado!");
        }

        else {
            System.out.println("Não há pacientes para ser vacinado.");
        }
    }

    public void imprimeFilaParaVacinacao() {
        if(fila.tamanhoListaDePacientes()>0){
            System.out.println("Pacientes para vacina:");
            for (int i = 0; i < fila.tamanhoListaDePacientes(); i++) {
                System.out.println(fila.retornaPacienteDaLista(i).toString());                                  
            }            
        }

        else {
            System.out.println("Não há pacientes na fila para serem vacinados.");
        }
    }

    public void imprimeVacinados() {    
        if(fila.tamanhoListaDeVacinados()>0){
            System.out.println("Pacientes vacinados:");
            for (int i = 0; i < fila.tamanhoListaDeVacinados(); i++) {
                System.out.println(fila.retornaVacinado(i).toString());
                                   
            }            
        }

        else {
            System.out.println("Não há pacientes vacinados.");
        }
    } 
}
