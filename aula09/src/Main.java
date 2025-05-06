// Main.java
import javax.swing.JOptionPane;
import javax.swing.JTextArea;    // Para área de texto
import javax.swing.JScrollPane;  // Para barra de rolagem
import java.awt.Font;          // Para definir a fonte
import java.awt.Dimension;     // Para definir o tamanho preferencial do scrollpane

public class Main {
    public static void main(String[] args) {
        Árvore_Binária tree = new Árvore_Binária();

        // Números Sorteados
        int[] numerosSorteados = {50, 25, 75, 12, 37, 62, 87, 6, 18, 30, 42, 55, 68, 80, 92, 3, 9, 15, 20, 28};

        // --- Preparando conteúdo para a primeira caixa de diálogo (Estado Inicial) ---
        StringBuilder logInicial = new StringBuilder();
        logInicial.append("Sorteando e inserindo 20 números (0-100) na árvore:\n");
        logInicial.append("Ordem de inserção: ");
        for (int i = 0; i < numerosSorteados.length; i++) {
            logInicial.append(numerosSorteados[i]).append(i == numerosSorteados.length - 1 ? "" : ", ");
        }
        logInicial.append("\n\n");

        logInicial.append("Inserindo números na árvore...\n");
        for (int numero : numerosSorteados) {
            tree.insert(numero);
        }
        logInicial.append("Todos os números inseridos.\n\n");

        logInicial.append("--- Impressões da Árvore Inicial ---\n");
        logInicial.append(Árvore_Binária.formatListToString("Pré-ordem", tree.getPreOrderTraversal()));
        logInicial.append(Árvore_Binária.formatListToString("In-ordem ", tree.getInOrderTraversal())); // Espaço para alinhar
        logInicial.append(Árvore_Binária.formatListToString("Pós-ordem", tree.getPostOrderTraversal()));
        logInicial.append(Árvore_Binária.formatListToString("Em Nível ", tree.getPostOrderTraversal())); // Espaço para alinhar

        // Criar JTextArea e JScrollPane para o conteúdo inicial
        JTextArea textAreaInicial = new JTextArea(logInicial.toString());
        textAreaInicial.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Fonte monoespaçada
        textAreaInicial.setEditable(false); // Impede edição
        textAreaInicial.setCaretPosition(0); // Garante que o texto comece do topo ao exibir

        JScrollPane scrollPaneInicial = new JScrollPane(textAreaInicial);
        scrollPaneInicial.setPreferredSize(new Dimension(450, 350)); // Tamanho preferencial da área de rolagem

        // Exibe a primeira janela de diálogo
        JOptionPane.showMessageDialog(null,
                                      scrollPaneInicial,
                                      "Árvore Binária de Busca - Estado Inicial",
                                      JOptionPane.INFORMATION_MESSAGE);

        // --- Preparando conteúdo para a segunda caixa de diálogo (Estado Modificado) ---
        int[] elementosParaRemover = {3, 20, 55, 12, 75};
        StringBuilder logModificado = new StringBuilder();
        logModificado.append("Removendo 5 elementos da árvore.\n");
        logModificado.append("Elementos a serem removidos: ");
        for (int i = 0; i < elementosParaRemover.length; i++) {
            logModificado.append(elementosParaRemover[i]).append(i == elementosParaRemover.length - 1 ? "" : ", ");
        }
        logModificado.append("\n\n");

        for (int elemento : elementosParaRemover) {
            tree.delete(elemento);
        }
        logModificado.append("Elementos removidos.\n\n");

        logModificado.append("--- Impressões da Árvore Modificada (após remoções) ---\n");
        logModificado.append(Árvore_Binária.formatListToString("Pré-ordem", tree.getPreOrderTraversal()));
        logModificado.append(Árvore_Binária.formatListToString("In-ordem ", tree.getInOrderTraversal())); // Espaço para alinhar
        logModificado.append(Árvore_Binária.formatListToString("Pós-ordem", tree.getPostOrderTraversal()));
        logModificado.append(Árvore_Binária.formatListToString("Em Nível ", tree.getPostOrderTraversal())); // Espaço para alinhar

        // Criar JTextArea e JScrollPane para o conteúdo modificado
        JTextArea textAreaModificado = new JTextArea(logModificado.toString());
        textAreaModificado.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textAreaModificado.setEditable(false);
        textAreaModificado.setCaretPosition(0);

        JScrollPane scrollPaneModificado = new JScrollPane(textAreaModificado);
        scrollPaneModificado.setPreferredSize(new Dimension(450, 300));

        // Exibe a segunda janela de diálogo
        JOptionPane.showMessageDialog(null,
                                      scrollPaneModificado,
                                      "Árvore Binária de Busca - Estado Modificado",
                                      JOptionPane.INFORMATION_MESSAGE);
    }
}