import javax.swing.JOptionPane;

public class PlaylistManager {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        while (true) {
            String[] opcoes = {"Adicionar música", "Remover música", "Buscar música", "Listar músicas", "Sair"};
            int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Gerenciador de Playlist",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    String titulo = JOptionPane.showInputDialog("Título da música:");
                    String artista = JOptionPane.showInputDialog("Artista da música:");
                    playlist.adicionarMusica(titulo, artista);
                    break;
                case 1:
                    String tituloRemover = JOptionPane.showInputDialog("Título da música a ser removida:");
                    playlist.removerMusica(tituloRemover);
                    break;
                case 2:
                    String tituloBuscar = JOptionPane.showInputDialog("Título da música a ser buscada:");
                    playlist.buscarMusica(tituloBuscar);
                    break;
                case 3:
                    playlist.listarMusicas();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}