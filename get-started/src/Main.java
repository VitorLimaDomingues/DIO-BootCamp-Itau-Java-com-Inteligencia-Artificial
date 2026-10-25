import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
//        1. Primeira demonstração
//        var name = "";
//        while (!name.equals("exit")) {
//            System.out.print("Informe um nome: ");
//            name = scanner.nextLine();
//            System.out.println(name);
//        }

//        2. Segunda demonstração
//        var name = "";
//        while (true) {
//            System.out.print("Informe um nome: ");
//            name = scanner.nextLine();
//            System.out.println(name);
//
//            if (name.equalsIgnoreCase("exit")) break;
//        }

        var name = "exit";
        do {
            System.out.print("Informe um nome: ");
            name = scanner.nextLine();
            System.out.println(name);

        } while (!name.equalsIgnoreCase("exit"));
    }
}
