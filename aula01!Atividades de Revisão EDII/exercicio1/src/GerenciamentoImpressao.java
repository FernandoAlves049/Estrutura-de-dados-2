package src;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.UIManager;

public class GerenciamentoImpressao {
    public static void main(String[] args) {
        FilaImpressao fila = new FilaImpressao();

        while (true) {
            UIManager.put("OptionPane.background", Color.LIGHT_GRAY);
            UIManager.put("Panel.background", Color.LIGHT_GRAY);

            String[] opcoes = {"Adicionar trabalho", "Imprimir próximo trabalho", "Exibir fila", "Sair"};
            int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Gerenciamento de Impressão",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    int idAluno = Integer.parseInt(JOptionPane.showInputDialog("ID do aluno:"));
                    String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo:");
                    int numeroPaginas = Integer.parseInt(JOptionPane.showInputDialog("Número de páginas:"));
                    TrabalhoImpressao trabalho = new TrabalhoImpressao(idAluno, nomeArquivo, numeroPaginas);
                    fila.enqueue(trabalho);
                    break;
                case 1:
                    fila.dequeue();
                    break;
                case 2:
                    fila.exibirFila();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}