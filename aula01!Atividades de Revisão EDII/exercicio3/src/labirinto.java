public class labirinto {
    private char[][] labirinto;

    public labirinto(int linhas, int colunas) {
        gerarLabirinto(linhas, colunas);
    }

    private void gerarLabirinto(int linhas, int colunas) {
        labirinto = new char[linhas][colunas];

        // Preenche o labirinto com paredes (#) e caminhos (.)
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                labirinto[i][j] = Math.random() < 0.3 ? '#' : '.';
            }
        }

        // Define a entrada (E) e a saída (S)
        int entradaX = (int) (Math.random() * linhas);
        int entradaY = (int) (Math.random() * colunas);
        labirinto[entradaX][entradaY] = 'E';

        int saidaX, saidaY;
        do {
            saidaX = (int) (Math.random() * linhas);
            saidaY = (int) (Math.random() * colunas);
        } while (saidaX == entradaX && saidaY == entradaY);
        labirinto[saidaX][saidaY] = 'S';
    }

    public char[][] getLabirinto() {
        return labirinto;
    }

    public int[] encontrarPosicao(char simbolo) {
        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[i].length; j++) {
                if (labirinto[i][j] == simbolo) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] linha : labirinto) {
            for (char celula : linha) {
                sb.append(celula).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}