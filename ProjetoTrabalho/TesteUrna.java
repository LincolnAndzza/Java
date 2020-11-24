import java.util.*;

class TesteUrna {
    public static void TesteUrna (String[] args) {
        
        ArrayList<Candidato> Candidatos = new ArrayList<Candidato>();
        Candidato a = new Candidato();
        
        int op;
        
        do {
            System.out.println("Cadastrar 1 ");
            System.out.println("Consultar 2");
            System.out.println("Votar     3");
            System.out.println("Finalizar 4");
            
            op = a.nextInt();
            
        if (op == 1) {
            System.out.println("digite o numero");
            String numero = a.next();
            
            System.out.println("digite o nome ");
            String nome = a.next();
            
            System.out.println("digite o partido");
            String partido = a.next();
            
            Candidato.add(new Candidato(numero,nome,partido));           
                
        } else if (op == 2) {
            System.out.println("Digite um numero");
            String n = a.next();
                
            for (int i = 0; i < Candidatos.size(); i++) {
                 if (Candidatos.get(i).getNumero().equals(n)) {
                     System.out.println(Candidatos.get(i).getNome() + ", " + Candidatos.get(i).getPartido() + ", " + Candidatos.get(i).getVotos());
                 }
            }
                
            } else if (op == 3) {
                System.out.println("Digite um numero para votar");
                String n = a.next();
                
                int i = 0;
                
                for (; i < Candidatos.size(); i++) {
                    if (Candidatos.get(i).getNumero().equals(n)) {
                        break;
                    }
                }
                if (i != Candidatos.size()) Candidatos.get(i).Votar();
            }
        } while (op !=4 );
    }
}

