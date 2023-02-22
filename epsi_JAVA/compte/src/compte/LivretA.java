package compte;

public class LivretA extends Compte{
    private float tauxinteret = 0.75f;
    
    
    
    public LivretA(){
        super();
    }
    
    public String toString(){
        String texte;
        texte= super.toString()+"\n"+this.tauxinteret+"\n";
   
        return texte;
    }
    
}
