# Classe Objeto

## Início
O código começa em ContaBancaria.java;
Note que toda programação orientada a objeto (POO), sempre vai começar com a classe objeto,
Ou seja, seu objeto (normalmente o objeto principal, ou a super classe, que você não precisa entender por enquanto),
Sempre será o primeiro arquivo que você deve criar.

## Estrutura Inicial
No código, ele deve iniciar com ```package Atividades.ContaBancaria.src```. O package vai indicar em qual pasta e projeto ele pertence...

### Note o seguinte:

- Package é o nome do comando;

- Atividades é o nome da pasta principal (que está dentro de src [src siginifica source]);

- .ContaBancaria é o nome da classe principal;

Depois disso, o próprio arquivo já vem com a declaração da classe:

    public class ContaBancaria;

### Explicando:

- "public" quer dizer sobre o encapsulamento da classe, toda classe (na maioria dos casos), ela deve ser pública;

- "class" indica que a linha de código se trata de uma classe;

- "ContaBancaria" é o nome da classe que, por padrão, deve ser declarada com a primeira letra maiúscula e, caso possua mais de uma palavra, ela deve estar junta e também iniciar com letra maúscula (CanetaEsferográfica,CarteiraDeTrabalho);

**Logo a baixo iremos declarar as variáveis desse objeto que nomeamos de ContaBancária**

### Explicando:

- "String nome" para informar o nome da pessoa que possui a ContaBancaria;

- "Double saldo" para informar o saldo ATUAL da ContaBancaria;

- "String cpf" variável de informação, só para encher linguiça... // mostrar o cpf da pessoa

- "Double dinheiro" para informar o dinheiro QUE VAI ENTRAR na ContaBancaria;

## Construtor
    public ContaBancaria(String nome, String cpf){
        this.saldo = 500.00;
        this.nome = nome;
        this.cpf = cpf;
    }

### Explicação:

O construtor vai basicamente apontar quais variáveis do objeto serão trabalhados obrigatórios receber. De forma resumida e menos complicada, as viaráveis que estão nos parêntesis do construtor, apontam na memória para as variáveis declaradas no objeto, onde serão inseridas na instanciação do objeto (Já explico o que é e como instanciamos o objeto);

## Métodos
### Explicação:

- public diz respeito ao encapsulamento (explicação na linha 22);

- void é o tipo de retorno do método, nesse caso, ele não retorna nenhum valor (não precisa entender sobre isso agora);

- nome do método;

- O valor entre parentesis é o argumento, que, de forma porcamente resumida, é um valor que necessita entrar para que o método funcione;

# Explicação de Cada Método

### Método DEPOSITAR
    public void depositar(Double dinheiro){
        System.out.println("Depositando: "+dinheiro);
        System.out.print("Saldo Atual: ");
        System.out.println(saldo+dinheiro);
    }

### Explicação:

Como já expliquei a estrutura de um método, aqui vou explicar como o método funciona;

Nesse método em específico, eu coloquei o arguemnto "Double dinheiro" para que quando o método for "chamado" na classe principal, você seja obrigado a colocar um valor no parentesis, facilitando (e não precisando de um scanner) para coletar valores;

- Por exemplo:

                jarvis.depositar(200.0);
                    jarvis é o nome da classe
                    .depositar é o método a ser utilizado
                    (200.0) é o valor que a variável dinheiro vai receber;
                Retorno:
                Depositando: 200.0
                Saldo atual: 700.0

                // (Vai ser 700.0, pois no construtor, o saldo inicial foi declarado já como 500.0 [linha 38]);

## Método SACAR
    public void sacar(Double dinheiro){
        if (saldo-dinheiro <= 0){
            System.out.println("Saldo indisponível para saque");
        } else {
            System.out.println(saldo-dinheiro);
        }
    }

### Explicação:
Nesse método, será feito o saque da conta (reduzir o valor de saldo), no método anterior foi feito o depósito (aumentar o valor de saldo);

A diferença do outro para esse, é que, o valor de dinheiro precisa ser o valor que a variável saldo irá perder, mas o problema não é apenas esse, quase nenhum banco te permite ter a conta-corrente com saldo negativo, então eteremos de utilizar uma condicional. Nesse caso eu escolhi fazer por if/else;

        if (condição){
            o que será feito;
        } else {
            o que será feito caso falso;
        }

Nesse caso, caso, caso o calculo para o saque for menor ou igual a 0, o código não irá permitir a redução do valor.

Caso contrário, será feito a redução do valor (sim, você pode retornar operações com println em várias linguagens, fazemos isso para reduzir linhas de código, mas não é uma boa prática).


## Método INFO

    public void info() {
        System.out.println("\n Nome: "+nome+
                            "\n CPF: "+cpf+
                            "\n Saldo: "+saldo);
    }

### Explicação:
Se você conseguiu entender os métodos anteriores, você já deve saber que este faz;

Falando especificamente do que o professor não explicou para a turma...

> O comando:

    System.out.prinln()
Possui formas diferentes de ser utilizado e, nesse caso, normalmente utilizado para reduzir linhas de código,
            pode ser feito sout("\n texto:" +variável);
            O "\n" indica para pular uma linha, nesse caso, você pode criar um único sout/sys para "retornar"(no sentido de aparecer no console)
            Para retonar vários valores de uma vez só!

                          ####
                        ######
                      ########
                    ##########
                    ##########
                  ############
                ##############
                ############################
    ########    ############################
    ########    ############################
    ########    ############################
    ########    ############################
    ########    ############################
    ########    ##########################
    ########    ########################
    ########    ########################
    ########    ######################
    ########    ######################
