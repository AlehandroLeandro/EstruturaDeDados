package prova2710;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class EstruturaFila {
    public static void main(String[] args) {
        String nomes[] = new String[5];

        for(int i = 0 ; i < nomes.length; i++){
            nomes[i] = JOptionPane.showInputDialog("Nome: ");
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nomes.length; i++){
            sb.append((i + 1)).append(" - ").append(nomes[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());


        String novoNome = JOptionPane.showInputDialog("Novo nome: ");

        nomes[1] = novoNome;

        StringBuilder sc = new StringBuilder();
        for(int i = 0; i < nomes.length; i++){
            sc.append((i + 1)).append(" - ").append(nomes[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sc.toString());

    }
}
