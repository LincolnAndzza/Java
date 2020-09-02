public class Hospital
{
   private Medico[] medicos = new Medico[15]; 
   private Paciente[] pacientes = new Paciente[10]; 
   private String endereco;
   private int leitos;
   
   public void addMedico(Medico medico){
       for(int i =0; i < medicos.length; i++){
           if(medicos[i] == null){
               medicos[i] = medico;
           }
       }
   }
   
   public void addPaciente(Paciente paciente){
       for(int i =0; i < pacientes.length; i++){
           if(pacientes[i] == null){
               pacientes[i] = paciente;
           }
       }
   }
   
   public double taxaOcupacao(){
       //lo - leitos ocupados
       //tl - total de leitos
       int lo = 0;
       for(int i=0; i < pacientes.length; i++){
           if(pacientes[i] != null){
               lo = lo + 1;
           }
       }
       return 100 * lo/this.leitos;
   }
   
   public Medico[] retornaMedicos(){
       return this.medicos;
   }

   public Paciente[] retornaPacientes(){
       return this.pacientes;
   }
}  


