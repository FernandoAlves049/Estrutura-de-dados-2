package src;
public class TrabalhoImpressao {
    int idAluno;
    String nomeArquivo;
    int numeroPaginas;

    public TrabalhoImpressao(int idAluno, String nomeArquivo, int numeroPaginas) {
        this.idAluno = idAluno;
        this.nomeArquivo = nomeArquivo;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "ID: " + idAluno + ", Arquivo: " + nomeArquivo + ", Páginas: " + numeroPaginas;
    }
}