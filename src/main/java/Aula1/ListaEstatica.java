package Aula1;

import javax.swing.*;

public class ListaEstatica {
    public static void main(String[] args) {
        int qntLista = 5;
        String ListaEstatica[] = new String[qntLista];

        for(int i = 0; i < qntLista; i++ ) {
            ListaEstatica[i] = JOptionPane.showInputDialog("Nome");
        }

        /*StringBuilder sb = new StringBuilder();
        for(int i = 0; i < qntLista; i++ ) {
            sb.append(ListaEstatica[i] + "\n");
        }
        String nomes = sb.toString();
        JOptionPane.showMessageDialog(null, nomes);*/

        int posListaAlt = Integer.parseInt(JOptionPane.showInputDialog("Posição da lista que deseja alterar: "));
        if(posListaAlt >= 0 && posListaAlt < qntLista) {
            ListaEstatica[posListaAlt] = JOptionPane.showInputDialog(null, "Novo nome");
        }

        int posListaExc = Integer.parseInt(JOptionPane.showInputDialog("Posição que deseja excluir: "));
        if(posListaExc >= 0 && posListaExc < qntLista){
            ListaEstatica[posListaExc] = null;
        }

        if(ListaEstatica[0] == null) {
            for(int i = 0; i < qntLista ; i ++) {
                if(i<qntLista-1) {
                    ListaEstatica[i] = ListaEstatica[i + 1];
                } else{
                    ListaEstatica[i] = "";
                }
            }
        } else for (int i = 1; i < qntLista; i++) {
            if (i < qntLista) {
                ListaEstatica[i] = ListaEstatica[i + 1];
            } else {
                ListaEstatica[i] = "";
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < qntLista; i++ ) {
            sb.append(ListaEstatica[i] + "\n");
        }
        String nomes = sb.toString();
        JOptionPane.showMessageDialog(null, nomes);
    }


}
