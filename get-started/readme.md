# Fundamentos da Linguagem de Programação Java

## Padrões de desenvolvimento e conceitos

1. Classe sempre inicia com letra maiuscula (Exe.: MyClass)
2. Nome de métodos em minúsculo "public static void main" (em caso de nome composto, usar a boa prática do camelCase "meuPrograma")
3. Java não possui problemas de identação (TAB) como python
4. Mesmo não sendo orientado a identação, ainda é bom para organização, legibilidade e boas práticas em programação
5. Trabalhar com packages: Sempre colocar o nome do seu domínio ao contrário (Exe.: br.com.dio) | (também é possível fazer direto na classe "br.com.dio.NomeDaClasse")
6. Declaração de comentários, Exe.: "// linha única" | "/* comentar em várias linhas JavaDocs */"
7. Comentários são ignorados na hora da compilação


## Anotações

### Diferença entre prints
- print: apenas imprime o valor
- println: imprime o valor e quebra uma linha, equivalente a usar \n no final
- printf: Permite usar %s para formatação de variáveis em string. 

### Java tipagem

Java é uma linguagem com tipagem estática e fortemente tipada, uma vez definido, não pode alterar.

Case sensitive: Java diferencia maiúsculo de minúsculo, Exe.: var new = erro | var NEW = passa. Também pode usar concatenação como var newAge = passa.

### Código de exemplo dessa aula
````java
import java.util.Scanner;

public class Main {
    // Declaração de constantes

    // Constante: uma variável cujo valor não pode ser reatribuído após a sua inicialização. Em Java, geralmente é declarada usando final.
    /*private: modificador de acesso*/ private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializa objeto scanner com o argumento "System.in"
        System.out.println("Olá, informe seu nome"); // Imprime na tela essa mensagem
        String name = scanner.next(); // Coleta dado inserido pelo usuário
        System.out.println("Olá, informe sua idade"); // Imprime na tela essa mensagem
        int age = scanner.nextInt(); // Coleta dado inserido pelo usuário
        System.out.println("Olá " + name + " sua idade é " + age); // Imprime na tela o resultado com concatenação
        // System.out.printf("Olá %s sua idade é %s", name, age); outra forma de imprimir o resultado
    }
}


````

## Keywords e tipos primitivos

Java tem keywords reservadas, isso implica que algumas palavras não podem ser utilizadas como variáveis, métodos, classes ou qualquer outro tipo de identificador. 

### Java - tipos primitivos

Em java nós temos 8 tipos primitivos:

- byte
- short
- int
- long - sempre colocar o L no final do valor para especificar "10L"
- boolean
- char 
- float - sempre colocar o f no final do valor para especificar "1.0f"
- double

Observação: A Linguagem Java não é totalmente Orientada a Objetos, e isto se deve principalmente aos atributos do tipo primitivo, pois são tipos de dados que não representam classes, mas sim valores básicos.

### Código de exemplo dessa aula


```java
public class Main {

    public static void main(String[] args) {
        byte numberByte = 1; // Variável do tipo byte
        short numberShort = 1; // Variável do tipo short
        int numberInt = 1; // Variável do tipo int
        long numberLong = 1L; // Variável do tipo long (OBS.: sempre colocar o L depois do número para especificar que o valor é long)
        float numberFloat = 1.0f; // Variável do tipo float (o f é colocado para especificar que o valor é float e não double)
        char character = 'a'; // Variável do tipo char (string sempre com aspas simples para esse tipo '')
        boolean booleano = true; // Variável do tipo booleano (true or false)
    }
}
```

## Trabalhando com Operadores de Atribuição e Lógicos

1. Sinal de igual "=" significa atribuição e/ou recebe
2. Sinal de "diferente de" "!=" significa que a variável está analisando se o valor requisitado é diferente do que a estrutura pede.
3. Sinal de ">" significa "maior", ">=" significa maior ou igual
4. Sinal de "<" significa "menor", "<=" significa menor ou igual
5. Sinal de "||" significa "ou" 
6. Sinal de "&&" significa "e"


### Some annotations

Quando o operador "!" é utilizado antes do nome da variável, é lido como inverte.

Exe.:
```java
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Quantos anos você tem: ");
            var age = scanner.nextInt();
            var canDrive = age > 17;
            System.out.printf("Você pode dirigir? (%s)", !canDrive);
    }
}
```

Este código está perguntando se o usuário possui idade maior que 17 para poder ter licença para dirigir. Porém, quando o usuário informa que a sua idade é maior que o valor 17, ao invés do programa retornar (true) irá retornar false, pois o !canDrive está invertendo o seu valor. 

## Código de exemplo dessa aula

```java
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // operador de igual = é lido como atribuição

        /* 1. primeira demonstração
        System.out.println("Quanto é 2 + 2?"); // pergunta ao usuário quanto é 2 + 2
        var result = scanner.nextInt(); // lê o dado inserido pelo usuário
        var isRight = result == 4; // "==" é lido como "igual", isso significa que está variável está pergutando se o valor iguala 4
        var isDifferent = result != 4; // "!=" é lido como "diferente de", isso significa que está variável está perguntando se o valor é diferente de 4
        System.out.printf("O resultado é 4, você acertou? (%s)", isDifferent); // printformat para mostrar ao usuário o resultado do seu dado
        */

        /* 2. segunda demonstração
        System.out.print("Quantos anos você tem: "); // pergunta ao usuário quantos anos ele possui
        var age = scanner.nextInt(); // lê o dado inserido pelo usuário
        System.out.print("Você é emancipado: "); // pergunta ao usuário se ele é emancipado
        var isEmancipated = scanner.nextBoolean(); // lê o dado inserido pelo usuário
        // var canDrive = age > 17; // ">" é lido como "maior", isso significa que está variável está perguntando se o valor é maior que 17
        // var canDrive = age >= 17; // ">=" é lido como "maior igual", isso significa que está variável está perguntando se o valor é maior ou igual a 18
        // var canNotDrive = age < 17; // "<" é lido como "menor", isso significa que está variável está perguntando se o valor é menor que 17
        // var canNotDrive = age <= 17; // "<=" é lido como "menor igual", isso significa que está variável está perguntando se o valor é menor ou igual a 17
        // var canNotDrive = age >= 18 || isEmancipated; // "||" é lido como "ou", isso significa que está variável está perguntando se o valor é 18 OU se ele é emancipado (true or false)
        var canNotDrive = age >= 18 || isEmancipated && age > 16; // "&&" é lido como "e", isso significa que está variável está perguntando se o valor é maior ou igual a 18, ou o usuário é emancipado. Se a primeira for false e a segunda true, ele pergunta logo em seguida se o usuário possuí idade maior que 16 (seguindo a legislação brasileira)
        System.out.printf("Você pode dirigir? (%s) \n", canNotDrive); // printformat para mostrar ao usuário o resultado
         */

        System.out.printf("true  && true = %s \n", true && true);
        System.out.printf("false && false = %s \n", false && false);
        System.out.printf("true  && false = %s \n", true && false);
        System.out.printf("false && true = %s \n", false && true);
        System.out.println("================================");
        System.out.printf("true  || true = %s \n", true || true);
        System.out.printf("false || false = %s \n", false || false);
        System.out.printf("true  || false = %s \n", true || false);
        System.out.printf("false || true = %s \n", false || true);
        System.out.println("=================================");
        System.out.printf("!true = %s \n", !true);
        System.out.printf("!false = %s \n", !false);

    }
}
```

## Trabalhando com operadores aritméticos 

- soma = "+"
- subtração = "-"
- divisão = "/"
- multiplicação = "*"

## Some annotations

Em uma linha de print, quando usar concatenação, utilizar o () para informar o java que você quer fazer uma operação e não concatenação

Ao usar o operador de divisão, é sempre recomedado usar tipos primitivos que representem valores decimais {double || float}

Os "()" priorizam algumas coisas como operações

**Classe Math**:

- Math.sqrt(variável) para raiz quadrada
- Math.pow(variável, number) para potência

Em java, você só consegue fazer operações de incremento e decremento, isso significa que você só pode fazer "++variavel" ou "--variavel". Não é possível fazer outros como "//"WW ou "**". Se o operador for à direita "variavel++" ou "variavel--" ele funciona, mas só é atribuído ou decrementado na próxima linha.

OBS.: em algumas linguagens como **JavaScript**, é possível fazer "**", é lido como potência, mas em **Java** não... quem sabe um dia?

## Código de exemplo dessa aula
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // 1. Primeira demonstração
        // System.out.print("Informe o primeiro número: ");
        // var value = scanner.nextInt(); caso trabalhe com decimais, é recomendado que altere para nextFloat
        // System.out.print("Informe o segundo número: ");
        // var value2 = scanner.nextInt(); caso trabalhe com decimais, é recomendado que altere para nextFloat
        // System.out.println(value + "" + value2 + "=" + (value + value2)); Exemplo com concatenação
        // System.out.printf("%s + %s = %s\n", value, value2, value + value2); Exemplo com operação de adição
        // System.out.printf("%s - %s = %s\n", value, value2, value - value2); Exemplo com operação de subtração
        // System.out.printf("%s / %s = %s\n", value, value2, value / value2); Exemplo com operação de divisão
        // System.out.printf("%s * %s = %s\n", value, value2, value * value2); Exemplo com operação de multiplicação
        // System.out.printf("%s %% %s = %s\n", value, value2, value % value2); Exemplo com operação de porcentagem

        // 2. Segunda demonstração
//        var value = 5;
//        // value = value + 12; funciona
//        value += 12; // forma mais resumida de fazer a operação acima.
//        System.out.println(value);

        // 3. Terceira demonstração
//        System.out.print("Informe o primeiro número: ");
//        var value1 = scanner.nextInt();
//        System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1)); Exemplo de raíz quadrada
//        System.out.printf("A potência de %s é %s\n", value1, Math.pow(value1, 2)); Exemplo de potência (ao quadrado)
//        System.out.printf("A potência de %s é %s\n", value1, Math.pow(value1, 2)); Exemplo de potência (ao cubo)

        // 4. Quarta demonstração
        var value = 50;
        System.out.println(++value); // Operador de incremento
        System.out.println(--value); // Operador de decremento
    //    System.out.println(value++); // Operador de incremento, porém na direita. Isso significa que ele faz a atribuição, mas só executa na próxima linha
    //    System.out.println(value--); // Operador de decremento, porém na direita. Isso significa que ele faz a decremental, mas só executa na próxima linha
        System.out.println(value);
    }
}
```

## Trabalhando com Operadores Bitwise (Bit-a-Bit)
Geralmente, os Bitwise operators são utilizados com os tipos:
- Long
- int
- short
- byte
- var

### Some Annotations

- | = orBitwise (Retorna 1 se pelo menos um dos bits comparados for 1)
- & = andBitwise (Retorna 1 somente se ambos os bits comparados forem 1)
- ^ = xorBitwise (Retorna 1 se os bits comparados forem diferentes)
- ~ = complementBitwise (Inverte todos os bits: 0 vira 1 e 1 vira 0)
- << = leftShift (Desloca os bits para a esquerda, preenchendo com 0 à direita)
- ">>" = signedRightShift (Desloca os bits para a direita, preservando o bit de sinal: 0 para positivos e 1 para negativos)
- ">>>" = unsignedRightShift (Desloca os bits para a direita, sempre preenchendo com 0 à esquerda)


- 0 = false
- 1 = true

Exemplo: 101 + 110 = (1 + 1 = true = 1. 0 + 1 = true = 1. 1 + 0 = true = 1.), resultado = 111

## Código de exemplo dessa aula
```java
//        1. Primeira demonstração orBitwise | "precisa de dois valores falsos para dar falso"
//        var value1 = 6;
//        var binary1 = Integer.toBinaryString(value1);
//        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
//        var value2 = 5;
//        var binary2 = Integer.toBinaryString(value2);
//        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
//        var result = value1 | value2;
//        var binaryResult = Integer.toBinaryString(result);
//        System.out.printf("%s | %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);
//
//         O que o código executa:
//        0 = false
//        1 = true
//        110 primeiro valor em binário
//        101 segundo valor em binário
//        111 resultado dos dois em binário (analisou se os dois valores comparados eram falsos e retornou true)

//        2. Segunda demonstração andBitwise & "Precisa apenas de um valor falso para dar falso"
//        var value1 = 6;
//        var binary1 = Integer.toBinaryString(value1);
//        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
//        var value2 = 2;
//        var binary2 = Integer.toBinaryString(value2);
//        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
//        var result = value1 & value2;
//        var binaryResult = Integer.toBinaryString(result);
//        System.out.printf("%s & %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);
//
//        /* O que o código executa:
//        0 = false
//        1 = true
//        110 Primeiro valor em binário
//        101 Segundo valor em binário
//        100 Resultado dos dois em binário (analisou qual valor tinha pelo menos um falso e retornou como falso)
//        */

//        3. Terceira demonstração shoreBitwise ^ "se dois números for igual, ele retorna 0. Se os números forem diferentes, ele coloca 1."
//        var value1 = 6;
//        var binary1 = Integer.toBinaryString(value1);
//        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
//        var value2 = 5;
//        var binary2 = Integer.toBinaryString(value2);
//        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
//        var result = value1 ^ value2;
//        var binaryResult = Integer.toBinaryString(result);
//        System.out.printf("%s ^ %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);
//
//        /* O que o código executa:
//        0 = false
//        1 = true
//        110 Primeiro valor em binário
//        101 Segundo valor em binário
//         11 Resultado dos dois em binário (comparou se eram diferentes e retornou 1 apenas para os diferentes)
//        */

//        4. Quarta demonstração complementBitwse ~ "ele nega o número, Exe.: 6 = 110 ele nega o 0 e se torna 1, o 1 se torna 0 e por adiante." Ele inverte.
//        var value1 = 6;
//        var binary1 = Integer.toBinaryString(value1);
//        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
//        var result = ~value1;
//        var binaryResult = Integer.toBinaryString(result);
//        System.out.printf("~%s = %s (representação binária %s)\n", value1, result, binaryResult);
//
//        /* O que o código executa:
//        0 = false
//        1 = true
//        00000000000000000000000000000110 < o que 6 significa
//        11111111111111111111111111111001 < o que o complement fez (inverteu)
//        */

//        5. Quinta demonstração shiftOperators << "Desloca o valor para esquerda dependendo do valor da quantidade"
//        var value1 = 9;
//        var binary1 = Integer.toBinaryString(value1);
//        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
//        var value2 = 2; // quantidade a ser deslocada
//        System.out.printf("Segundo número da operação %s\n", value2);
//        var result = value1 << value2;
//        var binaryResult = Integer.toBinaryString(result);
//        System.out.printf("%s << %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);
//
//        /* O que o código executa:
//         0 = false
//         1 = true
//         1001 < 9 representado em binário
//       100100 < o valor foi empurrado duas casas para o lado esquerdo, mas como tem que existir um valor nessas duas casas, elas são completadas com o 0
//        */

//        6. Sexta demonstração signedRightShift >> "Um pouco semelhante ao shiftOperator, mas ele desloca para direita"
//        var value1 = 8;
//        var binary1 = Integer.toBinaryString(value1);
//        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
//        var value2 = 2; // quantidade a ser deslocada
//        System.out.printf("Segundo número da operação %s\n", value2);
//        var result = value1 >> value2;
//        var binaryResult = Integer.toBinaryString(result);
//        System.out.printf("%s >> %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);
//
//       /*
//       O que o código executa:
//       0 = false
//       1 = true
//       1000 < valor do 8 em binário
//       0010 < signedRightShift desloca duas casas para a direita,
//              preenchendo as posições à esquerda com o bit de sinal.
//              Se o número for positivo, preenche com 0.
//              Se o número for negativo, preenche com 1.
//       10 < imprime apenas o 10 porque os zeros à esquerda
//            não alteram o valor do número.
//*/

     // 7. Sétima demonstração unsignedRightShift >>> "Desloca o valor para direita dependendo do valor da quantidade"
        var value1 = 12;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 2; // quantidade a ser deslocada
        System.out.printf("Segundo número da operação %s\n", value2);
        var result = value1 >>> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s >>> %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

        /* O que o código executa:
        0 = false
        1 = true
        1100 < representação do 12 em binário
        0011 < unsigendRightShift deslocando duas casas a direita (complementando essas duas casas com 0)
          11 < imprime apenas o 11 porque 0 a esquerda não representa nada
        */
```

## Exercícios

```java
import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá, 'fulano" você tem 'X' anos"
        int anoAtual = OffsetDateTime.now().getYear();
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o ano que você nasceu: ");
        int anoNascimento = sc.nextInt();
        sc.nextLine();
        int idade = anoAtual - anoNascimento;
        System.out.printf("Olá, %s! Você tem %s anos.\n", nome, idade);

        // 2. Escreva um código que receba o tamanho do lado de um quadrado, calcule a sua área e exiba na tela.
        System.out.print("Digite o tamanho do lado do quadrado: ");
        int lado1 = sc.nextInt();
        sc.nextLine();
        int area = lado1 * lado1;
        System.out.printf("Área do quadrado: %s\n", area);

        // 3. Escreva um código que receba a base e altura de um retângulo. Calcule a sua área e exiba na tela.
        System.out.print("Digite a base do retângulo: ");
        int base = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a altura do retângulo: ");
        int altura = sc.nextInt();
        sc.nextLine();
        int areaRetangulo = base * altura;
        System.out.printf("Área do retângulo: %s\n", areaRetangulo);

        // 4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
        System.out.print("Digite o primeiro nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o segundo nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade2 = sc.nextInt();
        int diferencaIdade = idade1 - idade2;
        System.out.printf("""
                %s tem %s anos de idade
                %s tem %s anos de idade
                A diferença de idade entre os dois é de %s
                """, nome1, idade1, nome2, idade2, diferencaIdade);
    }
}
```

Nesses tipos de estrutura, usar sc.nextLine(); após uma leitura de nextInt é essencial para limpar o "buffer". O que acontece é que quando você digita o número e aperta enter, o programa consome o valor, mas não o quebra-linha "\n" E isso acarreta em mais pra frente no código, quando aparece um nextLine(); ele consome esse "\n" do nextInt(); e não lhe permite inserir o dado pedido. 

# Estruturas de Controle em Java
