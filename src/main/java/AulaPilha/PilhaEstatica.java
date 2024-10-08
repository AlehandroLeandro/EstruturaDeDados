package AulaPilha;

import javax.swing.*;
import java.util.Stack;

public class PilhaEstatica {
    public static void main(String[] args) {
        Stack<String> pilhaCarros = new Stack<>();


        int op = 0;
        while(op!=5) {
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Inserir veículo
                    2 - Remover veículo
                    3 - Ver veículo no topo
                    4 - Exibir lista de Carros
                    5 - Sair"""));

            switch(op) {
                case 1:
                    pilhaCarros.push(JOptionPane.showInputDialog("Modelo do veículo: "));
                    break;
                case 2:
                    String carroRemovido = pilhaCarros.pop();
                    JOptionPane.showMessageDialog(null, "Carro removido: " + carroRemovido);
                    break;
                case 3:
                    String carroTopo = pilhaCarros.peek();
                    JOptionPane.showMessageDialog(null, "Carro no topo: " + carroTopo);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Lista de carros Atualizada: " + pilhaCarros);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }

        }
    }
}
