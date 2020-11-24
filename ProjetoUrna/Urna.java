import java.util.*;

public class Urna {
	private List<Votos> votos;
	private List<String> Votaram;	
	private List<Candidatos> candidatosPrefeitos;
	private List<Candidatos> candidatosVereadores;
	
	public Urna () {
		this.votos = new ArrayList<>();
		this.Votaram = new ArrayList<>();
		this.candidatosPrefeitos = new ArrayList<>();
		this.candidatosVereadores = new ArrayList<>();
	}
	
	public int totalidadesVotos () {
		return this.votos.size();
	}
	
	public void CandidatosAprovados () {
		System.out.println("Resultados dos Aprovados Foi");
		this.CandidatosPrefeitos();
		this.CandidatosVereadores();
	}
	
	private void PrefeitosAprovados () {
	    this.candidatosPrefeitos();
		Vencedores vencedores = this.candidatoPrefeito.iterator().next();
		
		if (iterator.hasNext()) {
			Vencedores vencedores = iterator.next();
			
			else (vencedores.getvotosCandidatos() < candidatos.getvotosCandidatos()) {
				vencedores = vencedores;
			}
		}
		
		System.out.println(
			"Candidatos Aprovados a Prefeito foi: \n" +
			"\tNome: " + vencedores.getNome() + "\n" +
			"\tRG: " + vencedores.getRg() + "\n" +
			"\tQuantidade de votos foi: " + vencedores.getvotosCandidatos()
		);
	}
	
	private void VereadoresAprovados () {
		this.candidatosVereadores();
		Candidatos vencedores = this.candidatosVereadores.iterator().next();
		
		if (iterator.hasNext()) {
			Candidatos candidatos = iterator.next();
			
			if (vencedores.getvotosCandidatos() < candidatos.getvotosCandidatos()) {
				vencedores = candidatos;
			}
		}
		
		System.out.println(
			"Candidatos Aprovados para Vereadores foi: \n" +
			"\tNome: " + vencedor.getNome() + "\n" +
			"\tRG: " + vencedor.getRg() + "\n" +
			"\tQuantidade de votos foi: " + vencedores.getvotosCandidatos()
		);
	}
}
