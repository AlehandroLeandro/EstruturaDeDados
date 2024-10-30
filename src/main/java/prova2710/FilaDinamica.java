package prova2710;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class FilaDinamica {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();

        for(int i = 0; i < 10; i++){
            String nome = JOptionPane.showInputDialog("Nome do cliente: " + (i+1));
            filaClientes.add(nome);
        }

        int clAtender = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes atender?"));

        for(int i = 0; i< clAtender; i++){
            if(filaClientes.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não há clientes para atender");
            }

            String clAtual = filaClientes.peek();
            JOptionPane.showMessageDialog(null, "Atendendo o cliente " + clAtual);

            filaClientes.poll();
        }

        JOptionPane.showMessageDialog(null, "Tamanho da fila apos atendimento: " + filaClientes.size());
    }
}
