# Jogo Secret Number - D01 Catalisa
<div align="center">
<img src="https://github.com/joaocruzzup/d01-secretnumber/blob/main/img/secretNumber.png" width="500" height="300" alt="Descrição da imagem">
</div>

## Sumário

1. [O que é o Secret Number?](#-o-que-é-o-secret-number)
2. [Funcionalidades do Secret Number](#-funcionalidades-do-secret-number)
3. [Entendendo as branchs do projeto](#-entendendo-as-branchs-do-projeto)
4. [Como executar?](#-como-executar)
5. [Tutorial do Jogo](#-tutorial-do-jogo)
6. [Assuntos do java utilizados](#-assuntos-do-java-utilizados)
7. [Possíveis Melhorias](#-possíveis-melhorias-)
8. [Autor](#-autor)

## 🎮 O que é o Secret Number?

Secret Number (Número secreto) é o nome de um jogo para ser jogado em terminal criado com a partir do desafio proposto do Programa Catalisa.

Assim o enunciado do desafio requeria os seguintes passos:
1. Criar um gerador de números aleatórios
2. Receber o número do usuário
3. Conferir se o número do usuário é igual ao gerado aleatoriamente
   1. Se for igual, o usuário deve ganhar 10 pontos
   2. Se o número gerado for +-1 do número digitado, o usuário deve ganhar 5 pontos
   3. Se não atender aos requisitos anteriores, o usuário não ganha pontos.
4. No fim, exibir a pontuação no console.

## 📱 Funcionalidades do Secret Number

O jogo Secret Number conta como algumas funcionalidades, são elas:

- Navegação entre Menus
   - Menu inicial
   - Menu Alterar Dificuldade
   - Menu Como Jogar?
- Possibilidade de jogar mais de 1 vez
- Pontuação acumulada
- Exibição detalhada dos resultados ao final


## 🧮 Entendendo as branchs do projeto

Para a entrega do desafio, explicado anteriormente era possível realizar entregas conforme a quantidade de implementações propostas. Assim, as branchs são separadas em:

1. entrega-minima: Branch com as funcionalidades da entrega mínima.
2. entrega-media: Branch com as funcionalidades da entrega média.
3. entrega-maxima: Branch com as funcionalidades da entrega máxima.

E o fluxo de commits nas branchs se deu da seguinte forma:
<div align="center">
<img src="https://github.com/joaocruzzup/d01-secretnumber/blob/main/img/branchs.png" width="600" height="300" alt="Descrição da imagem">
</div>


## ⏯️ Como executar?

- Você precisará ter o [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11) instalado no seu computador;
- Baixe o repositório do projeto;
- Abra o terminal e navegue até o diretório do programa que você deseja executar;
- Compile o arquivo executando o comando `javac` no arquivo [SecretNumber](https://github.com/joaocruzzup/d01-secretnumber/blob/main/src/SecretNumber.java):
```
javac SecretNumber.java
```
- Após compilar, execute o comando `java`, como mostra abaixo:
```
java SecretNumber.java
```

## 📋 Tutorial do jogo

1. Selecione iniciar jogo no * Menu *");
2. Você pode alterar dificuldades no Menu. O padrão é Fácil.
   1. As dificuldades são: Fácil (números gerados de 1 a 10), 
   2. Normal (números gerados de 1 a 50), 
   3. Difícil (números gerados de 1 a 100), 
   4. Muito difícil (números gerados de 1 a 1000).
3. Ao iniciar o jogo, você deverá digitar um número
4. O sistema informará se você acertou ou errou o número e dará sua pontuação
5. A pontuação é: 10 pontos para acertos, 5 pontos para quase acertos, 0 pontos para erros
6. O quase acerto é quanto o número chutado está próximo (+-1) do correto
7. Você pode jogar novamente quantas vezes quiser, basta digitar S para continuar ou N para parar
8. No final você terá uma tabela mostrando o seu desempenho
9. Se divirta!

## ☕ Assuntos do Java utilizados

- Declaração de variáveis
- Entrada e saída de dados (Scanner e print)
- Estruturas condicionais (if, else, else-if)
- Estruturas de repetição (for, do while, while)

## ⚙️ Possíveis Melhorias 

Como o jogo foi elaborado com conhecimentos que eu sei do java, assim conhecimentos ainda iniciais, os principais problemas é em relação ao código, sendo eles:

- O código está muito extenso, tornando a legibilidade difícil;
- A forma de limpar a tela para mudar de telas utiliza um laço for imprimindo várias quebras de linhas;
- Os dados são perdidos

Assim, pretendo futuramente corrigir esses problemas e melhorar o jogo!

## 👨‍💻 Autor

Nome: João Cruz<br>Linkedin: https://www.linkedin.com/in/joaosilvacruz/

---

<h4 align=center>Made with 💚 by <a href="https://github.com/joaocruzzup">João Cruz</a></h4>






