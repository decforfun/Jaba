# Jaba
Projeto da disciplina de Compiladores usando **Java** e **ANTLR 4**.

## Sobre
Compilador simples (trabalho "a3") que usa uma gramática em ANTLR para gerar lexer e parser e executar a análise da linguagem Jaba.
Para ler o nosso artigo de documentação do projeto, acesse o link abaixo
https://drive.google.com/file/d/1kxQ8grKlWRTYiwY2eLDroY5cZ_X_fckH/view?usp=sharing

## Tecnologias
- Java  
- ANTLR 4

## Como rodar
1. Clone o repositório:
   ```bash
   git clone https://github.com/decforfun/Jaba.git
   cd Jaba
   ```

2. Gere o parser (se ainda não estiver gerado):
   ```bash
   antlr4 Jaba.g4 -visitor -o gen
   ```
   Ou usando o jar:
   ```bash
   java -jar antlr-4.X-complete.jar -Dlanguage=Java -visitor -o gen Jaba.g4
   ```

3. Compile:
   ```bash
   javac -cp ".:antlr-4.X-complete.jar" Main.java gen/*.java
   ```

4. Execute:
   ```bash
   java -cp ".:antlr-4.X-complete.jar" Main teste.jaba
   ```

## Estrutura
```
src/   -> código-fonte contendo Main.java, Jaba.g4 e arquivo de teste
gen/   -> arquivos gerados pelo ANTLR

```

## Alunos: 

- André de Carvalho Costa Silva - RA 12522197172 
- Evelyn Muniz - RA 12522159149 
- Lucas Gonçalves Braga - RA 12522131893 
- Vinícius Gabriel Almeida Sciani - RA 12522141265

