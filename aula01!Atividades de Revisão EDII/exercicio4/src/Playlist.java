import javax.swing.JOptionPane;
public class Playlist {
    Musica head;

    public Playlist() {
        this.head = null;
    }

    public void adicionarMusica(String titulo, String artista) {
        Musica novaMusica = new Musica(titulo, artista);
        if (head == null) {
            head = novaMusica;
        } else {
            Musica atual = head;
            while (atual.proxima != null) {
                atual = atual.proxima;
            }
            atual.proxima = novaMusica;
        }
        JOptionPane.showMessageDialog(null, "Música '" + titulo + "' adicionada à playlist.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void removerMusica(String titulo) {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "Playlist vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (head.titulo.equals(titulo)) {
            head = head.proxima;
            JOptionPane.showMessageDialog(null, "Música '" + titulo + "' removida da playlist.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Musica atual = head;
        Musica anterior = null;
        while (atual != null) {
            if (atual.titulo.equals(titulo)) {
                anterior.proxima = atual.proxima;
                JOptionPane.showMessageDialog(null, "Música '" + titulo + "' removida da playlist.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            anterior = atual;
            atual = atual.proxima;
        }

        JOptionPane.showMessageDialog(null, "Música '" + titulo + "' não encontrada na playlist.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public void buscarMusica(String titulo) {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "Playlist vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Musica atual = head;
        while (atual != null) {
            if (atual.titulo.equals(titulo)) {
                JOptionPane.showMessageDialog(null, "Artista: " + atual.artista, "Busca", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            atual = atual.proxima;
        }

        JOptionPane.showMessageDialog(null, "Música '" + titulo + "' não encontrada na playlist.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public void listarMusicas() {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "Playlist vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder lista = new StringBuilder("Playlist:\n");
        Musica atual = head;
        while (atual != null) {
            lista.append(atual.toString()).append("\n");
            atual = atual.proxima;
        }
        JOptionPane.showMessageDialog(null, lista.toString(), "Playlist", JOptionPane.INFORMATION_MESSAGE);
    }
}