package prova2710;

import javax.swing.*;
import java.util.ArrayList;

public class EstruturaLista {
    public static void main(String[] args) {
        String frutas[] = {"Abacate", "Castanha", "Figo", "Goiaba", "Jabuticaba", "Kiwi", "Limão"};


       StringBuilder sb = new StringBuilder();
        for (String fruta : frutas) {
            sb.append(fruta).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
