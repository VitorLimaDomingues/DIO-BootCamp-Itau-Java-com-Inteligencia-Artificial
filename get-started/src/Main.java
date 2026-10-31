import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número.
        System.out.print("Insira um valor para demonstrar a tabuada do mesmo: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        for (int i = 1; i < 11; i++) {
            int tabuada = numero * i;
            System.out.printf("%s x %s = %s\n", numero, i, tabuada);
        }

        // 2. Escreva um código onde o usuário entra com a sua altura e peso, seja feito o cálculo do seu IMC(IMC= peso/(altura * altura)) e seja exibida a mensagem de acordo com resultado
        System.out.print("Insira a sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer
        System.out.print("Insira o seu peso: ");
        double peso = sc.nextDouble();

        double calculoImc = peso / (altura * altura);

        System.out.println(calculoImc);

        if (calculoImc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (calculoImc < 25) {
            System.out.println("Peso ideal");
        } else if (calculoImc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (calculoImc < 35) {
            System.out.println("Obesidade Grau |");
        } else if (calculoImc < 40) {
            System.out.println("Obesidade Grau || (Severa)");
        } else {
            System.out.println("Obesidade ||| (Mórbida)");
        }

//         3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção
//            par e impar, com isso o código deve informar todos os números pares ou impares (conforme a seleção inicial) no intervalo de
//            números informados, incluindo os números informados e em ordem decrescente;

        while (true) {
            int numero1;
            int numero2;

            while (true) {
                System.out.print("Insira o primeiro número: ");
                numero1 = sc.nextInt();
                sc.nextLine(); // Limpeza de buffer
                System.out.print("Insira o segundo número (precisa ser maior que o segundo): ");
                numero2 = sc.nextInt();
                sc.nextLine(); // Limpeza de buffer

                if (numero2 <= numero1) {
                    System.out.println("O segundo número precisa ser maior que o primeiro!");
                } else {
                    break;
                }
            }

            String opcao;
            while(true) {
                System.out.print("Escolha entre par ou ímpar: ");
                opcao = sc.nextLine();

                if (opcao.equalsIgnoreCase("par")) {
                    break;
                } else if (opcao.equalsIgnoreCase("impar")) {
                    break;
                } else {
                    System.out.println("Apenas par ou impar!");
                }
            }

            if (opcao.equalsIgnoreCase("par")) {
                for (int i = numero2; i >= numero1; i--) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } else if (opcao.equalsIgnoreCase("impar")) {
                for (int i = numero2; i >= numero1; i--) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }

            break;
        }

        // 4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar
        // até que o número informado dividido pelo primeiro número tenha o resto diferente de 0 na divisão, números menores que o primeiro número devem
        // ser ignorados.

        int numeroInicial;

        while(true) {
            System.out.print("Informe o número inicial: ");
            numeroInicial = sc.nextInt();
            sc.nextLine(); // Limpeza de buffer

            if (numeroInicial <= 1) {
                System.out.println("0 e números negativos não contam. (1 também por causa que fica infinito o loop)");
            } else {
                break;
            }
        }

        while(true) {
            int numeroFornecido;
            System.out.print("Informe o segundo número: ");
            numeroFornecido = sc.nextInt();
            sc.nextLine(); // Limpeza de buffer

            if (numeroFornecido < numeroInicial) {
                System.out.println();
            } else if (numeroFornecido % numeroInicial == 0) {
                System.out.println("Continua!");
            } else {
                System.out.println("Encerra!");
                break;
            }
        }
    }
}