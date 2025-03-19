package src;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.UIManager;

@SuppressWarnings("unused")
public class FilaImpressao {
    private Queue<TrabalhoImpressao> fila = new LinkedList<>();

    public void enqueue(TrabalhoImpressao trabalho) {
        fila.add(trabalho);
        JOptionPane.showMessageDialog(null, "Trabalho adicionado à fila: " + trabalho, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public TrabalhoImpressao dequeue() {
        if (!isEmpty()) {
            TrabalhoImpressao trabalho = fila.remove();
            JOptionPane.showMessageDialog(null, "Imprimindo trabalho: " + trabalho, "Impressão", JOptionPane.INFORMATION_MESSAGE);
            return trabalho;
        } else {
            JOptionPane.showMessageDialog(null, "Fila de impressão vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public void exibirFila() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fila de impressão vazia.", "Fila", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder filaStr = new StringBuilder("Fila de impressão:\n");
            for (TrabalhoImpressao trabalho : fila) {
                filaStr.append(trabalho).append("\n");
            }
            JOptionPane.showMessageDialog(null, filaStr.toString(), "Fila", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}