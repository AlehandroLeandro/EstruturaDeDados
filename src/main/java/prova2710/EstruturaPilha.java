package prova2710;

import javax.swing.*;

public class EstruturaPilha {
    public static void main(String[] args) {
        String cores[] = new String[8];

        int topo = 5;
        cores[0] = "Amarelo";
        cores[1] = "Verde";
        cores[2] = "Preto";
        cores[3] = "Azul";
        cores[4] = "Branco";
        cores[5] = "Vermelho";

        for(int i = topo; i< cores.length; i++){
            cores[i] = JOptionPane.showInputDialog("Nova cor: ");
        }
    }

}
