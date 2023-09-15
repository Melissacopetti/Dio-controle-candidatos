package candidaturas;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		analisarCandidato(2400);
		imprimirSelecionados();
		selecaoCandidatos();

	}

	public static void imprimirSelecionados() {
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
		System.out.println("Imprimindo a lista de candidatos e informando o indice do elemento.");
		for (int indice = 0; indice < candidatos.length; indice++)
			System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);

		System.out.println("Forma abreviada: For each");

		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}

	public static void selecaoCandidatos() {
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
				"DANIELA", "JORGE" };
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " Solicitou este valor de salario:" + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}

	public static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	public static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA");
		} else {
			System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}

}
