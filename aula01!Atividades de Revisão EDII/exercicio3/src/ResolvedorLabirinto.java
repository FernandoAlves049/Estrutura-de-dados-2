public class ResolvedorLabirinto {
    public boolean resolver(labirinto labirinto) {
        char[][] lab = labirinto.getLabirinto();
        int[] entrada = labirinto.encontrarPosicao('E');
        if (entrada == null) {
            return false;
        }
        return explorar(lab, entrada[0], entrada[1]);
    }

    private boolean explorar(char[][] labirinto, int x, int y) {
        // Verifica se está fora dos limites ou em uma parede/já visitado
        if (x < 0 || y < 0 || x >= labirinto.length || y >= labirinto[0].length || labirinto[x][y] == '#' || labirinto[x][y] == '*') {
            return false;
        }

        // Se chegou à saída, retorna verdadeiro
        if (labirinto[x][y] == 'S') {
            return true;
        }

        // Marca a posição como visitada
        char temp = labirinto[x][y];
        labirinto[x][y] = '*';

        // Explora as quatro direções possíveis
        if (explorar(labirinto, x + 1, y) || explorar(labirinto, x - 1, y) || explorar(labirinto, x, y + 1) || explorar(labirinto, x, y - 1)) {
            return true;
        }

        // Desmarca a posição se não levar à saída
        labirinto[x][y] = temp;
        return false;
    }
}