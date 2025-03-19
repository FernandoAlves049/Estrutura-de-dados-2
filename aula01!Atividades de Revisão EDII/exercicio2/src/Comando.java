public class Comando {
    private String tipo;
    private Object dados;

    public Comando(String tipo, Object dados) {
        this.tipo = tipo;
        this.dados = dados;
    }

    public String getTipo() {
        return tipo;
    }

    public Object getDados() {
        return dados;
    }
}