import java.util.*;

public class Urna {
    
    private List<Votos> votos;
    private List<String> Votaram;	
    private List<Candidato> candidatoPrefeito;
    private List<Candidatos> candidatosVereadores;
	
    public Urna () {
        
	this.votos = new ArrayList<>();
	this.votarao = new ArrayList<>();
	this.candidatoPrefeito = new ArrayList<>();
	this.candidatosVereadores = new ArrayList<>();
    }
	
    public int totalidadesVotos () {
        
	return this.votos.size();
    }
	
    public void CandidatosAprovado () {
        
	System.out.println("Resultados dos Aprovados");
	
	this.AprovadoPrefeito();
	this.AprovadoVereador();
    }
	
    private void PrefeitoAprovado () {
        
	this.candidatoPrefeito();
	Vencedor vencedor = this.candidatoPrefeito.iterator().next();
		
	if (iterator.hasNext()) {
	    
	    Vencedor vencedor = iterator.next();
			
	    else (vencedor.getvotosCandidato() < candidato.getvotosCandidato()) {
		 vencedor = vencedor;
	}
     }
		
	System.out.println(
	
	"Candidato Aprovado a Prefeito foi: \n" +
	"\tNome: " + vencedor.getNome() + "\n" +
	"\tRG: " + vencedor.getRg() + "\n" +
	"\tQuantidade de votos: " + vencedores.getvotosCandidatos()
	
	);
    }
	
    private void VereadorAprovado () {
        
	this.candidatoVereador();
	Candidatos vencedores = this.candidatosVereadores.iterator().next();
		
	if (iterator.hasNext()) {
	    Candidatos candidatos = iterator.next();
			
           else (vencedor.getvotosCandidatos() < candidatos.getvotosCandidatos()) {
		vencedores = candidatos;
	   }
	}
		
	System.out.println(
	
	 "Candidatos Aprovados para Vereadores foi: \n" +
	 "\tNome: " + vencedores.getNome() + "\n" +
	 "\tRG: " + vencedores.getRg() + "\n" +
	 "\tQuantidade de votos: " + vencedores.getvotosCandidatos()
	);
    }
}
