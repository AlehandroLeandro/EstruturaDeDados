package AulaPilha;

import javax.swing.*;
import java.util.ArrayList;

public class PilhaEstatica3 {
    public static void main(String[] args) {
        // Declarar um array principal e um auxiliar
        String[] nomeCarro = new String[5];
        String[] auxNomeCarro = new String[5];
        int posicaoCarro;
        int auxPosicaoCarro;

        // Deixando o array auxiliar com todos os elementos iguais a ""
        for(int i = 0; i < auxNomeCarro.length; i++){
            auxNomeCarro[i]  = "";
        }

        // criando um FOR para alimentar o array com os nomes dos carros
        // acessar a posição e inserir no índice
        for(int i = 0; i < nomeCarro.length; i++){
            nomeCarro[i] = lerString("Nome do carro: ");
        }

        // ALTERAR UM CARRO QUE ESTÁ NA PILHA E MOSTRAR ATUALIZADO
        // com showInputDialog buscar a opção que o usuário deseja alterar
        posicaoCarro = lerInt("Posição do carro que deseja alterar: ");
        // Diminuir uma posição do para alterar o índice correto.
        // código aqui
        posicaoCarro--;
        nomeCarro[posicaoCarro] = lerString("Novo carro: ");


        // Verificando se a posição é válida
        if(posicaoCarro > 5 || posicaoCarro < 0){
            JOptionPane.showMessageDialog(null, "Posição inválida");
        } else {
            // se a posição digitada for válida, vamos fazer a alteração
            auxPosicaoCarro = 0;

            // Utilizando um array auxiliar para fazer a movimentação dos elementos
            for(int i = nomeCarro.length - 1; i > posicaoCarro; i--){
                auxNomeCarro[auxPosicaoCarro] = nomeCarro[i];
                nomeCarro[i] = "";
                auxPosicaoCarro++;
            }

            nomeCarro[posicaoCarro] = JOptionPane.showInputDialog("Digite um novo carro que foi estacionado");

            // Voltando os dados do array auxiliar para o principal
            posicaoCarro++;
            for(int i = 4; i >= 0; i--){
                if(!auxNomeCarro[i].equals("")){
                    nomeCarro[posicaoCarro] = auxNomeCarro[i];
                    auxNomeCarro[i] = "";
                    posicaoCarro++;
                }
            }

            mostrarLista(nomeCarro);


            excluiCarro(posicaoCarro, auxPosicaoCarro, auxNomeCarro, nomeCarro);
        }

    }

    public static void excluiCarro(int posicaoCarro, int posicaoCarroAux, String[] auxNomeCarro, String[] nomeCarro) {
        // Retirando um carro do estacionamento
        int tirarCarro;
        tirarCarro = JOptionPane.showConfirmDialog(null, "Você deseja tirar algum carro do estacionamento?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        // OBS: o retorno do showConfirmDialog é 0 para YES e 1 para NO
        // então, se clicar em "YES" o retorno será 0 e vice-versa

        if(tirarCarro == 0){
            posicaoCarro = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que o carro está estacionado"));
            posicaoCarro--;

            if(posicaoCarro < 0 || posicaoCarro > 4){
                JOptionPane.showMessageDialog(null, "Posição inválida");
            } else {
                posicaoCarroAux = 0;
                for (int i = 4; i > posicaoCarro; i--) {
                    // Colocar os elementos do array principal para o array auxiliar
                    // código aqui
                }

                nomeCarro[posicaoCarro] = "";

                for (int i = 4; i >= 0; i--) {
                    if (!auxNomeCarro[i].equals("")){
                        // Voltar os elementos do array auxiliar para o array principal
                        // código aqui
                    }
                }

                //INCLUIR UM NOVO CARRO NA PILHA E MOSTRAR A PILHA ATUALIZADA

                nomeCarro[4] = JOptionPane.showInputDialog("Estacione um novo carro");

                mostrarLista(nomeCarro);
            }
        }
    }

    public static void mostrarLista(String[] nomeCarro) {
        // Mostrando a lista
        JTextArea listaNomesCarros = new JTextArea();

        for (int i = 4; i >= 0; i--) {
            listaNomesCarros.append(nomeCarro[i] + "\n");
        }

        JOptionPane.showMessageDialog(null, listaNomesCarros);
    }

    //métodos auxiliares

    public static String lerString(String txt) {
        return JOptionPane.showInputDialog(txt);
    }

    public static int lerInt(String txt) {
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }
}
