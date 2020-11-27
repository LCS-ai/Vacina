package ui;

import util.Entrada;

public class MenuUi {

    public void menu() {
        VacinacaoUI processoDeVacinacao = new VacinacaoUI();
        Entrada entrada = new Entrada();

        boolean chave = true;
        while (chave) {
            int opcao = entrada.inInt(
                    "--------- FILA PARA VACINAÇÃO --------\n[1] Cadastro de paciente\n[2] Vacinar\n[3] Imprimir fila de vacinação\n[4] Imprimir fila de pacientes vacinados\n[5] Sair\n------------------");
            switch (opcao) {

                case 1:
                    processoDeVacinacao.adicionaPaciente();
                    break;

                case 2:
                    processoDeVacinacao.vacinaPaciente();
                    break;

                case 3:
                    processoDeVacinacao.imprimeFilaParaVacinacao();
                    break;

                case 4:
                    processoDeVacinacao.imprimeVacinados();
                    break;

                case 5:
                    chave = false;
                    break;
                

                default:
                    break;

            }
        }

    }

}
