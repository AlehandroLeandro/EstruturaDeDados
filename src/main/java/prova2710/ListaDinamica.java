package prova2710;

import javax.swing.*;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showConfirmDialog;

public class ListaDinamica {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        boolean addNome = true;

        while(addNome){
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar um nome?", "Adicionar nome: ", JOptionPane.YES_NO_OPTION);

            if(opcao == JOptionPane.YES_OPTION){
                String nome = JOptionPane.showInputDialog("Nome: ");
                listaNomes.add(nome);
            } else{
                addNome = false;
            }
        }

        int tamLista = listaNomes.size();

        JOptionPane.showMessageDialog(null, tamLista);

        String nmRemover = JOptionPane.showInputDialog("Nome que deseja remover da lista: ");

        if(listaNomes.contains(nmRemover)){
            listaNomes.remove(nmRemover);
            JOptionPane.showMessageDialog(null, nmRemover + "Nome removido com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Nome não encontrado");
        }

        JOptionPane.showMessageDialog(null, listaNomes + " - [" + listaNomes.size() + "]");
    }
}
