import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class StackQueue {

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
        Queue<Character> fila = new LinkedList<>();


        for (int i = 0; i < formatacao.length(); i++) {
            char c = formatacao.charAt(i);
            pilha.push(c);
            fila.add(c);
        }


        while (!pilha.isEmpty()) {
            if (!pilha.pop().equals(fila.remove())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   DESAFIO COM PILHA E FILA");
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