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