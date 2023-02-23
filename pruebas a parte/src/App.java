import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
			int numero=entrada.nextInt();
			System.out.println("Digite un numero");
			System.out.println(+numero);
		}
    }
}
