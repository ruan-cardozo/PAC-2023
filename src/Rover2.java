import java.util.ArrayList;
import java.util.Scanner;

public class Rover2 {

	public static int getPosition(ArrayList<String> commands, int matrixSize) {
		int position = 0;
		int row = 0;
		int col = 0;

		for (String command : commands) {
			switch (command) {
				case "CIMA":
					if (row > 0) {
						row--;
					}
					break;
				case "BAIXO":
					if (row < matrixSize - 1) {
						row++;
					}
					break;
				case "ESQUERDA":
					if (col > 0) {
						col--;
					}
					break;
				case "DIREITA":
					if (col < matrixSize - 1) {
						col++;
					}
					break;
				default:
					System.out.println("Comando inválido: " + command);
			}
		}

		position = (row * matrixSize) + col;
		return position;
	}

	public static void main(String[] args) {
		ArrayList<String> commands = new ArrayList<>();
		int matrixSize = 0;

		Scanner scanner = new Scanner(System.in);

		// solicita tamanho da matriz
		System.out.print("Informe o tamanho da matriz quadrada: ");
		matrixSize = scanner.nextInt();

		// solicita comandos
		System.out.println("Informe os comandos (CIMA, BAIXO, ESQUERDA, DIREITA) separados por espaço:");
		scanner.nextLine(); // consome o \n deixado pelo nextInt
		String inputCommands = scanner.nextLine();
		String[] inputCommandsArray = inputCommands.split(" ");
		for (String command : inputCommandsArray) {
			commands.add(command);
		}

		int finalPosition = getPosition(commands, matrixSize);
		System.out.println("Posição final do rover: " + finalPosition);
	}
}

