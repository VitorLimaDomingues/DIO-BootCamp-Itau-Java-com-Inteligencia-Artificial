import java.util.Scanner;

public class Main {
    // Declaração de constantes

    // Constante: uma variável cujo valor não pode ser reatribuído após sua inicialização. Em Java, geralmente é declarada usando final.
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
