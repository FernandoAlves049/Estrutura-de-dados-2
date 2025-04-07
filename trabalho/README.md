# 📊 Comparação de Algoritmos de Ordenação

Este projeto implementa e compara o desempenho de cinco algoritmos de ordenação: **Bubble Sort**, **Selection Sort**, **Insertion Sort**, **Merge Sort** e **Quick Sort**. O objetivo é analisar tempo de execução, comparações e trocas ao ordenar um conjunto de dados.

---

## 📋 Funcionalidades

- **Leitura de dados** de um arquivo (`dados100_mil.txt`).
- **Ordenação** com 5 algoritmos diferentes.
- **Métricas**: tempo, comparações e trocas.
- **Geração de arquivos** com resultados ordenados (em ordem decrescente).
- **Exibição** dos resultados ordenados por tempo (do mais lento para o mais rápido).

---

## 🔍 Algoritmos Implementados

| Algoritmo         | Descrição                                                                 |
|-------------------|---------------------------------------------------------------------------|
| **Bubble Sort**    | Compara pares adjacentes e troca se estiverem desordenados.              |
| **Selection Sort** | Seleciona o menor elemento a cada iteração e posiciona corretamente.     |
| **Insertion Sort** | Insere cada elemento na posição correta na lista já ordenada.            |
| **Merge Sort**     | Divide recursivamente e combina sublistas ordenadas.                     |
| **Quick Sort**     | Particiona usando um pivô e ordena recursivamente as partições.          |

---

## 🚀 Como Usar

1. **Preparação**:
   - Coloque o arquivo `dados100_mil.txt` (números separados por vírgulas) na pasta `src/`.

2. **Execução**:
   ```bash
   javac ComparacaoAlgoritmosOrdenacao.java
   java ComparacaoAlgoritmosOrdenacao
   ```

3. **Saída**:

- **Console**: Resultados comparativos.
- **Pasta `resultados/`**: Arquivos `ordenado_[Algoritmo].txt` contendo:
  - Nomes dos autores.
  - Métricas (tempo, comparações, trocas).
  - Dados ordenados em ordem decrescente.

---

## 📊 Exemplo de Saída no Console

```
Algoritmo: BubbleSort  
Tempo: 00:00:12:345  
Comparações: 49995000  
Trocas: 25000000  
-----------------------------  
Algoritmo: QuickSort  
Tempo: 00:00:00:123  
Comparações: 150000  
Trocas: 75000  
-----------------------------  
```

---

## 📌 Observações

- **Autores**: Fernando Alves de Souza e Felipe Montalvão.  
- **Desempenho**: Resultados podem variar conforme o hardware.  
  - *Nota:* O Bubble Sort tende a ser mais lento em conjuntos grandes de dados.
