package prova2710;

import javax.swing.*;
import java.util.LinkedList;

public class PilhaDinamica {
    public static void main(String[] args) {
        LinkedList<String> pilhaCaixas = new LinkedList<>();

        for(int i = 0; i < 5; i++ ){
            pilhaCaixas.push("Caixa " + (i+1));
        }

        JOptionPane.showMessageDialog(null, "Caixas na pilha: " + pilhaCaixas);

        String cxAntiga = JOptionPane.showInputDialog("Caixa que deseja alterar: ");
        if(pilhaCaixas.contains(cxAntiga)){
            String cxNova = JOptionPane.showInputDialog("Caixa que ocupara o lugar da antiga: ");
            if(pilhaCaixas.contains(cxNova)){
                pilhaCaixas.remove(cxAntiga);
                pilhaCaixas.push(cxNova);

                JOptionPane.showMessageDialog(null, cxAntiga + " alterada para " + cxNova);

            }else{
                JOptionPane.showMessageDialog(null, "A pilha não contém essa caixa");
            }
        }else{
            JOptionPane.showMessageDialog(null, "A pilha não contém essa caixa");
        }

        if(!pilhaCaixas.isEmpty()){
            String cxRemovida = pilhaCaixas.pop();
            JOptionPane.showMessageDialog(null, "Caixa removida : " + cxRemovida);
        }else{
            JOptionPane.showMessageDialog(null, "A Pilha está vazia");
        }

        JOptionPane.showMessageDialog(null, pilhaCaixas);
    }
}
