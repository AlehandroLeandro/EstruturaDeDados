package AulaPilha;

import javax.swing.*;

public class PilhaEstatica2 {
    public static void main(String[] args) {
        String[] nome = new String[5];

        StringBuilder sb = new StringBuilder();

        for(int i = nome.length-1; i > 0; i--) {
            nome[i] = JOptionPane.showInputDialog("Nome do modelo de carro: ");
        }

        for(int i = nome.length-1; i > 0; i--) {
            sb.append(nome[i] + "\n");
        }

        JOptionPane.showMessageDialog(null,"Lista veículos:\n" + sb);

        int alterarCarro = Integer.parseInt(JOptionPane.showInputDialog("Posição do carro que deseja alterar: "));

        nome[alterarCarro] = JOptionPane.showInputDialog("Nome do carro: ");

        JOptionPane.showMessageDialog(null,"Lista veículos:\n" +  sb);

        int deletCarro = Integer.parseInt(JOptionPane.showInputDialog("Posição do carro que deseja excluir: "));

        nome[deletCarro] = "";

        JOptionPane.showMessageDialog(null, "Lista veículos:\n" + sb);

        nome[deletCarro] = JOptionPane.showInputDialog("Insira um novo carro: ");

        JOptionPane.showMessageDialog(null, "Lista veículos:\n" + sb);


    }
}
