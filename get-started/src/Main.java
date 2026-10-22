import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
//        1. Primeira demonstração de switch case
//        System.out.print("Informe um número de 1 até 7: ");
//        var option = scanner.nextInt();
//        scanner.nextLine();
//        switch (option) {
//            case 1:
//            case 7:
//                System.out.println("Fim de semana uhull \\o/");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            default:
//                System.out.println("Opção inválida!");
//       }
//        2. Segunda demonstração
//        System.out.print("Informe um número de 1 até 7: ");
//        var option = scanner.nextInt();
//        switch (option) {
//            case 1 -> System.out.println("Domingo");
//            case 2 -> System.out.println("Segunda");
//            case 3 -> System.out.println("Terça");
//            case 4 -> System.out.println("Quarta");
//            case 5 -> System.out.println("Quinta");
//            case 6 -> System.out.println("Sexta");
//            case 7 -> System.out.println("Sábado");
//            default -> System.out.println("Opção inválida!");
//        }
//      3. Terceira demonstração
        System.out.print("Informe um número de 1 até 7: ");
        var option = scanner.nextInt();
        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana uhuull \\o/", day);
            }
            case 2 -> ("Segunda");
            case 3 -> ("Terça");
            case 4 -> ("Quarta");
            case 5 -> ("Quinta");
            case 6 -> ("Sexta");
            default -> ("Opção inválida!");
        };
        System.out.println(message);
    }
}
