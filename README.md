# ProjetoDeCompiladores

### _Repositório para a disciplina de Projeto de Compiladores_

### Observações 🚩

* Integrantes: Leonardo Marotta e Mauricio Mucci 🤝
* Para mais especificações sobre os trabalhos, olhar as pastas com nome: _docs_

### Objetivos 🎯

* Trabalho 1: Modificação do compilador didático.
  * A implementação atual do compilador didático aceita apenas números com um único
    dígito. Modificar o compilador para que ele aceite também números naturais com mais
    de um dígito
  * A implementação atual do compilador didático aceita apenas as operações de soma e
    multiplicação. Modifique o compilador para que aceite também subtração e divisão.
    Para essas operações, gerar as instruções SUB e DIV.
  * O compilador didático possui um back-end que gera código para uma máquina de pilha
    hipotética:
    CodeGen backend = new CodeGen();
    String codigo = backend.geraCodigo(arv);
    O back-end recebe como entrada a árvore sintática e percorre essa árvore gerando código
    para uma máquina de pilha. Substituir o back-end desse compilador por um back-end
    interpretador, ou seja, ao invés de gerar uma String com código para ser executado na
    máquina de pilha, o back-end já devolve o resultado da computação da expressão de
    entrada.
  * Implementar em Java, uma máquina de pilha que execute as instruções geradas pelo
    compilador didático. A máquina de pilha deve receber como entrada um arquivo texto
    com as instruções e devolver como saída o resultado final da execução dessas instruções.
    A classe principal deve se chamar MaquinaPilha
* Trabalho 2: Implementação de um analisador léxico.
  * O objetivo do trabalho é implementar um analisador léxico para a Linguagem Karloff
    usando a ferramenta javacc. O aluno deve usar a gramática da linguagem Karloff (que
    está disponível em arquivo separado no e-aula) como referência para os possíveis tokens
    da linguagem.
* Trabalho 3: Implementação de um parser para a Linguagem Karloff em Javacc.
  * O objetivo do trabalho é implementar um parser (Analisador Sintático) para a linguagem Karloff. O parser deve ser construído em cima do analisador léxico proposto para a
    mesma linguagem no trabalho anterior. Lembrando que o Javacc não aceita recursão à
    esquerda nem alternativas começando com um mesmo símbolo, dessa forma, essas construções devem ser eliminadas da gramática caso existam. As dicas de como implementar
    esse parser estão na vídeo aula: 09 - Análise Sintática usando a ferramenta Javacc. Os alunos devem entregar também dois exemplos de programas que usem
    uma grande parte das construções sintáticas disponíveis na linguagem.
* Trabalho Final: Compilador Karloff em Javacc
  * O objetivo do trabalho é implementar um compilador para a Linguagem Karloff, usando
    tradução dirigida por sintaxe, na ferramenta Javacc. Para realizar esta tarefa, o aluno
    deve adicionar ações semânticas às regras sintáticas já implementadas em Javacc, para
    que seja gerada uma árvore sintática do programa Karloff sendo compilado. Em seguida,
    o programa deve percorrer a árvore sintática gerando código Java (ou qualquer outra
    linguagem de programação) semanticamente equivalente ao código Karloff original.


3. #### Tecnologias Utilizadas 💻

| Java | javacc | javac |
|------|--------|-------|
|  17  | 7      | 17    |
