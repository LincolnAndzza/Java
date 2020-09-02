public class SistemaCovid{
    
    public static void main(String[] args){
        Hospital hospital = new Hospital();
        
        Paciente p = new Paciente();
        p.colocarNome("Kain do recos");
        hospital.addPaciente(p);
    }
}


