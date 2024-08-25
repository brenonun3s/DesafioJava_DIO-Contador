import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, forneça dois números inteiros:");

        int parametro1 = scanner.nextInt();
		System.out.println("Agora forneça o segundo número:");
        int parametro2 = scanner.nextInt();

        try {
            validarParametros(parametro1, parametro2);

            for (int i = parametro1; i <= parametro2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarParametros(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior ou igual ao primeiro.");
        }
    }
}
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
