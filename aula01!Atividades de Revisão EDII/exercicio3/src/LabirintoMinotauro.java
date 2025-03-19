import javax.swing.JOptionPane;

public class LabirintoMinotauro {
    public static void main(String[] args) {
        // Solicita o tamanho do labirinto ao usuário
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do labirinto (ex: 5 para 5x5):"));

        // Cria o labirinto
        labirinto labirinto = new labirinto(tamanho, tamanho);

        // Tenta resolver o labirinto
        ResolvedorLabirinto resolvedor = new ResolvedorLabirinto();
        boolean resolvido = resolvedor.resolver(labirinto);

        // Exibe o resultado
        if (resolvido) {
            JOptionPane.showMessageDialog(null, "Labirinto resolvido:\n" + labirinto.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Labirinto sem saída.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}