# CLASSE PRINCIPAL

## Início
Como o nosso professor não explicou isso (até o momento desse arquivo...),
para você conseguir diferenciar uma classe objeto de uma classe principal (normalmente no começo, existem casos e casos),
sempre procure pela linha de código:

        public static void main(String[] args){}

### Explicação:
        - public é o encapsulamento

        - static indicar que uma variável, método ou bloco pertence à classe (nesse caso a classe principal), e não a instâncias específicas dessa classe // Difícil de entender, né? Não precisa entender isso por enquanto;

        - main é o nome do método que a JVM (Java Virtual Machine) procura como ponto de entrada para a execução do programa;

Observações: JVM (Java Virtual Machine) é uma máquina virtual, de forma burramente resumida, é um simulador de uma máquina física,
        mas como um software, sem depender de hadware.

JVM - Java Virtual Machine.

Antes da criação do java, era comum os devs programarem em C, mas o C precisa de uma máqui física para processar informações, e, por causa disso, o código que você fez só poderia ser utilizado naquele sistema operacional específico (já se perguntou por que existem aplicativos que só rodam em Windows, mas não rodam em MAC e Linux? É por causa disso!).

O java foi lançado com a JVM, para que, quando um código fosse feito em Sistema Operacional, bastava instalar o java nos outros Sistemas, para que o mesmo código pudesse ser utilizado em outros sistemas operacionais, justamente porque o Java possui uma máquina virutal, que não depende de hardwares específicos para ser executado.

(Ao decorrer das aulas, eu falarei mais sobre JSE, JDK e JVM);

## Instanciando um Objeto
    ContaBancaria jarvis = new ContaBancaria("Jarvis", "123.456.789-01" );

### Explicação:

        - ContaBancaria indica a classe que será instanciada;
        - javris indica o nome que o objeto irá receber (todo método precisará desse nome antes de ser "chamado");
        - = new ContaBancaria(atributos) é a instanciação da classe, nesse caso, o objeto.

Acredito que nessa altura, você já deve estar mais familiarizado em como a POO funciona, caso não, relaxe... Existem cursos na Udemy, todo mês a Udemy faz um descondo, em que todos os cursos ficam por quase 40 reais, então aproveitem para estudar a programação estruturada pela Udemy (EM JAVA, PELO AMOR DE DEUS).

## Método INFO
    jarvis.info();

### Explicação:

        - javis é o nome do objeto que queremos acessar;
        - .info() é o método que iremos executar;

### retorno:

        Nome: Jarvis
        CPF: 123.456.789-01
        Saldo: 500.0

## Método DEPOSITAR
    jarvis.depositar(200.0);

Explicação:

        - javis é o nome do objeto;
        - .depositar(200.0) é o método a ser executado, lembrando que nessa parte precisamos inserir o arugmento (que é o valor a ser adicionado na variável saldo)
### retorno:

    Depositando: 200.0
    Saldo Atual: 700.0

## Método SACAR
    jarvis.sacar(900.0);

### Explicação:

        - javis é... Você já sabe;
        - .sacar(900.0) é... Você também já sabe...
        - MAS, nesse caso, lembra que no método sacar(Double dinheiro), nós fizemos uma condicional? Então, ela vai atuar aqui!

        Quando o método for chamado com o valor acima da valor da variável saldo, como 900.0 é um valor acima de 700 (alteração feita no método depositar [explicação na linha 174 até 182]), ele vai retornar a condição que fizemos, nesse caso...

### retorno:

    Saldo indisponível para saque

### Observação:
Caso o método ```jarvis.sacar();``` utilizasse como argumento um valor menor de saldo, O código será retornado de outra forma, por exemplo:

    jarvis.sacar(300.0);

### retorno:

    200.0

> Espero que o exercício tenha ficado mais fácil de entender
> <br>Bons estudos!