public class Rovere02 {
	public static void main(String[] args) {
		int[][] matriz = new int[8][8];
		int linhaAtual = 2;
		int colunaAtual = 2;
		int linhaFinal = 4;
		int colunaFinal = 4;

		while (linhaAtual != linhaFinal || colunaAtual != colunaFinal) {
			if (colunaAtual < colunaFinal) {
				colunaAtual++;
			} else if (colunaAtual > colunaFinal) {
				colunaAtual--;
			}

			System.out.println("[" + linhaAtual + "][" + colunaAtual + "]");

			if (linhaAtual < linhaFinal) {
				linhaAtual++;
			} else if (linhaAtual > linhaFinal) linhaAtual--;

			System.out.println("[" + linhaAtual + "][" + colunaAtual + "]");
		}

		System.out.println("[" + linhaAtual + "][" + colunaAtual + "]");
	}
}
