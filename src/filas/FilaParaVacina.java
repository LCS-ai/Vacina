package filas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import paciente.Paciente;

public class FilaParaVacina {
    private List<Paciente> listaDePacientes;
    private List<Paciente> listaDeVacinados;

    public FilaParaVacina() {
        listaDePacientes = new ArrayList<>();
        listaDeVacinados = new ArrayList<>();
    }

    public Paciente retornaPacienteDaLista(int i) {
        return listaDePacientes.get(i);
    }

    public Paciente retornaVacinado(int i) {
        return listaDeVacinados.get(i);
    }

    public int tamanhoListaDePacientes() {
        return listaDePacientes.size();
    }

    public void removeDaListaDePacientes(int i) {
        listaDePacientes.remove(i);
    }

    public int tamanhoListaDeVacinados() {
        return listaDeVacinados.size();
    }

    public Paciente getPaciente(int i) {
        return listaDePacientes.get(i);
    }

    public boolean verificaPacienteExistente(Paciente paciente) {
        for (int i = 0; i < listaDePacientes.size(); i++) {
            if (listaDePacientes.size() > 0 && listaDePacientes.get(i).getNome() == paciente.getNome()
                    && listaDePacientes.get(i).getIdade() == paciente.getIdade()) {
                return true;
            }
        }
        return false;
    }

    public boolean verificaPacienteVacinadoExistente(Paciente paciente) {
        for (int i = 0; i < listaDePacientes.size(); i++) {
            if (listaDeVacinados.size() > 0 && listaDeVacinados.get(i).getNome() == paciente.getNome()
                    && listaDeVacinados.get(i).getIdade() == paciente.getIdade()) {
                return true;
            }
        }
        return false;
    }

    public void adicionaNaListaDePacientes(Paciente paciente) {
        listaDePacientes.add(paciente);
        Collections.sort(listaDePacientes);
    }

    public Paciente retornaPacientePrioritario() {
        if (!listaDePacientes.isEmpty()) {
            return listaDePacientes.get(0);
        }
        return null;
    }

    public boolean vacinaPacientePrioritario() {
        if (retornaPacientePrioritario() != null) {
            listaDeVacinados.add(listaDePacientes.get(0));
            listaDePacientes.remove(0);
            return true;
        }
        return false;
    }

}
