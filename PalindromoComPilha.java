import java.util.Scanner;
import java.util.Stack;

public class PalindromoComPilha {

    private static String limpar(String texto) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));


            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public static boolean ehPalindromo(String texto) {
        String formatacao = limpar(texto);
        Stack<Character> pilha = new Stack<>();

        int tamanhostring = formatacao.length();


        for (int i = 0; i < tamanhostring / 2; i++) {
            pilha.push(formatacao.charAt(i));
        }


        int inicio = (tamanhostring % 2 == 0) ? (tamanhostring / 2) : (tamanhostring / 2 + 1);


        for (int i = inicio; i < tamanhostring; i++) {
            char topo = pilha.pop();
            if (formatacao.charAt(i) != topo) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   DESAFIO COM PILHA(STACK)");
        System.out.println("   Verificador de Palíndromo");
        System.out.println("   Digite um texto");

        while (true) {
            System.out.print("\nTexto: ");
            String texto = scanner.nextLine();

            if (texto.equalsIgnoreCase("sair")) {
                System.out.println("Saindo...");
                break;
            }

            boolean resultado = ehPalindromo(texto);

            if (resultado) {
                System.out.println(" É palíndromo");
            } else {
                System.out.println(" NÃO é palíndromo ");
            }
        }

        scanner.close();
    }
}
