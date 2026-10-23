import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
//      1. Primeira demonstração
//      for (;;) {
//          System.out.print("Digite um nome: ");
//          var name = scanner.next();
//
//          if (name.equalsIgnoreCase("exit")) break;
//
//          System.out.println(name);
//      }

//      2. Segunda demonstração
//      for (var i = 1; i <= 100; i++) { // forma comum de utilizar for | Também pode ser manipulado de muitas formas "i >= 0" ou "i += 2" ou "i--"
//          if (i % 2 == 0) {
//              continue; // "break" interrompe, "continue" continua o código.
//          }
//      }
//
//            System.out.println(i);
///
//      3. Terceira demonstração
//      for (var i = 0; i <= args.length; i++) {
//           System.out.println(args[i]);
//      }
//
//      4. Quarta demonstração
//      for (var arg : args) {
//          System.out.println(arg);
//      }

        for (var i = 0; i < args.length; i++) {
            System.out.println(i + " - " + args[i]);
        }

    }
}
