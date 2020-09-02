public class ControleRemoto
{
   private Televisao tv; 

    public ControleRemoto(Televisao tv){         
        
        tv = new Televisao();         
        this.tv = tv;     
    }

    public int aumentarVolume(){         

        if(this.tv.getVolume() < 100){             

            this.tv.setVolume(this.tv.getVolume()+1);             

            return this.tv.getVolume();         

        }else{ 

            return 100;             
        }    
    }     

    public int diminuirVolume(){         

        if(this.tv.getVolume() > 0){             

            this.tv.setVolume(this.tv.getVolume() - 1);             

            return this.tv.getVolume();         

        }else{             

            return 0;         
        }     
    }   

    public int aumentarCanal(){         

        if(this.tv.getCanal() > 0){             

            this.tv.setCanal(this.tv.getCanal()+1);             

            return this.tv.getCanal();         
        }        
        return 0;     
    }  

    public int diminuirCanal(){         

        if(this.tv.getCanal() > 0){             

            this.tv.setCanal(this.tv.getCanal()-1);             

            return this.tv.getCanal();         
        }         
        return 0;     
    }   

    public void trocarCanalIndicado(int canal){         

        this.tv.setCanal(canal);     
    } 

    public Televisao consultarCanalEVolume(){         

        return this.tv;     
    }     
    
}
