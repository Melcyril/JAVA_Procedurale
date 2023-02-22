/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu421;

/**
 *
 * @author cyril
 */
public class Lancer {
    protected int Valeur1;
    protected int Valeur2;
    protected int Valeur3;
    
    public Lancer(){
           
        
    }
    //Tri décroissant
    public void Trier(){
        int stock=0;
        if(this.Valeur1<this.Valeur2){
            stock=this.Valeur2;
            this.Valeur2=this.Valeur1;
            this.Valeur1=stock;
            
        }
        if(this.Valeur2<this.Valeur3){
            stock=this.Valeur3;
            this.Valeur3=this.Valeur2;
            this.Valeur2=stock;         
        }
        if(this.Valeur1<this.Valeur2){
            stock=this.Valeur2;
            this.Valeur2=this.Valeur1;
            this.Valeur1=stock;
            
        }
    }
    public void Enregistrer(int val1,int val2,int val3){
        this.Valeur1=val1;
        this.Valeur2=val2;
        this.Valeur3=val3;
        Trier();
    }
    
    public int ValeurDecimal(){
        
        return (this.Valeur1*100)+(this.Valeur2*10)+this.Valeur3;
    }
    
    
    public boolean EtQuatre21(){
        /*
        if(this.Valeur1==4 && this.Valeur2==2 && this.Valeur3==1){
            return true;
        }else{
            return false;
        } 
     */
        return this.Valeur1==4 && this.Valeur2==2 && this.Valeur3==1;
    }
    public boolean EtBreland(){
        return this.Valeur1==this.Valeur2 && this.Valeur1==this.Valeur3;
    }
    
    public boolean EtBrelandDas(){

        return this.Valeur1==1 && this.Valeur2==this.Valeur1 && this.Valeur3==this.Valeur1;
    }
    //public boolean deuxAs(){}
    
    public boolean DeuxAsEt(int Valeur){
        return Valeur+2==this.Valeur1+this.Valeur2+this.Valeur3;
    }
    public int DeuxAsEtRetour(int Valeur){
        if(this.Valeur1+this.Valeur2==2){
            return this.Valeur3;
        }else if(this.Valeur1+this.Valeur3==2){
            return this.Valeur2;
        }else{
            return this.Valeur1;
        }
    }
    public boolean EtSuite(){
        return this.Valeur1==this.Valeur2+1 && this.Valeur1==this.Valeur3+2;
    }
    public int GetValeur1(){
        return this.Valeur1;
    }
    public int GetValeur2(){
        return this.Valeur2;
    }
    public int GetValeur3(){
        return this.Valeur3;
    }
    
}
