# Projeto de Estruturas de Dados II

Este projeto explora e implementa diversas estruturas de dados avançadas, como árvores balanceadas, grafos e tabelas hash, com o objetivo de otimizar a eficiência e o desempenho em diferentes aplicações.

## Visão Geral

O projeto é composto por implementações detalhadas de estruturas de dados, juntamente com exemplos de uso e testes para garantir a correção e o desempenho.

## Estrutura do Projeto

-   `src`: Contém o código fonte Java.
-   `lib`: Contém as dependências do projeto.
-   `bin`: Contém os arquivos compilados.
-   `.vscode`: Configurações específicas do VS Code para o projeto.

## Pré-requisitos

-   Java Development Kit (JDK) 8 ou superior
-   Visual Studio Code (opcional, mas recomendado)
-   Extensão Java para VS Code (opcional, mas recomendado)

## Como Executar

1.  Clone o repositório:

    ```bash
    git clone <URL do repositório>
    ```
2.  Navegue até o diretório do projeto:

    ```bash
    cd <nome do projeto>
    ```
3.  Compile o código:

    ```bash
    javac -d bin src/*.java
    ```
4.  Execute a classe principal (exemplo):

    ```bash
    java -cp bin Main
    ```

## Testes

Para executar os testes, siga os passos abaixo:

1.  Certifique-se de ter o JUnit configurado no seu ambiente de desenvolvimento.
2.  Compile as classes de teste:

    ```bash
    javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar -d bin test/*.java
    ```
3.  Execute os testes:

    ```bash
    java -cp bin:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestSuite
    ```

## Contribuição

Contribuições são sempre bem-vindas! Siga estas etapas para contribuir:

1.  Faça um fork do projeto.
2.  Crie uma branch com sua feature ou correção:

    ```bash
    git checkout -b feature/nova-feature
    ```

    ou

    ```bash
    git checkout -b fix/correcao-de-bug
    ```
3.  Faça commit das suas mudanças:

    ```bash
    git commit -m 'Adiciona uma nova funcionalidade'
    ```
4.  Faça push para a branch:

    ```bash
    git push origin feature/nova-feature
    ```
5.  Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.
