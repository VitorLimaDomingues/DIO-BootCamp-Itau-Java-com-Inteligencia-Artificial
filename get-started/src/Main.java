

public class Main {

    public static void main(String[] args) {
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

//        5. Quinta demonstração shiftOperators << "Desloca o valor para esquerda dependendo do valor"
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

        // 7. Sétima demonstração unsignedRightShift >>>
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
    }
}