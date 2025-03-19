import java.util.Stack;

public class modificadordetexto {
    private StringBuilder texto;
    private Stack<String> desfazer;
    private Stack<String> refazer;

    public modificadordetexto() {
        texto = new StringBuilder();
        desfazer = new Stack<>();
        refazer = new Stack<>();
    }

    public void inserir(String novoTexto) {
        desfazer.push(texto.toString());
        refazer.clear();
        texto.append(novoTexto);
    }

    public void remover(int n) {
        if (n > texto.length()) n = texto.length();
        desfazer.push(texto.toString());
        refazer.clear();
        texto.delete(texto.length() - n, texto.length());
    }

    public void desfazer() {
        if (!desfazer.isEmpty()) {
            refazer.push(texto.toString());
            texto = new StringBuilder(desfazer.pop());
        }
    }

    public void refazer() {
        if (!refazer.isEmpty()) {
            desfazer.push(texto.toString());
            texto = new StringBuilder(refazer.pop());
        }
    }

    public String getTexto() {
        return texto.toString();
    }
}