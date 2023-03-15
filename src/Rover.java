import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Rover {

	public static int getPosition(ArrayList<String> commands) {
		int position = 0;
		for (String command : commands) {
			if (command.equals("DIREITA")) {
				position++;
			} else if (command.equals("ESQUERDA")) {
				if (position > 0) {
					position--;
				}
			}
		}
		return position;
	}

	public static void main(String[] args) throws IOException {
		ArrayList<String> commands = new ArrayList<>();

		System.out.println("Digite a sequência de comandos (DIREITA/ESQUERDA):");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();

		for (String command : input.split("\\s+")) {
			if (command.equals("DIREITA") || command.equals("ESQUERDA")) {
				commands.add(command);
			} else {
				System.out.println("Comando inválido: " + command);
			}
		}

		int finalPosition = getPosition(commands);
		System.out.println("Posição final do rover: " + finalPosition);
	}
}

