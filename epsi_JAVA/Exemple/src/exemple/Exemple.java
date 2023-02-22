package exemple;
import java.io.*;
class Exemple {
    //Attributs
    private int x = 100;
    private String s = "POEC Epsi";
//************************************************************************ 
int getX(){
    return this.x;
}
//************************************************************************
String getS(){
    return this.s;
}
//************************************************************************ 
public Exemple (int x) {
    this.x = x;
System.out.println(" constructeur avec parametre entier .............");
}
//************************************************************************
public Exemple (String param ) {
    this.s = param;
System.out.println("constructeur avec parametre String .............");
}
//************************************************************************    
public Exemple () {
System.out.println(" constructeur par défaut .............");
}
//************************************************************************ 
void setX(int x){
    this.x = x;
}
//********************* condtructeur de copie ***************************************************    
public Exemple (Exemple obj) {
    this.x = obj.x;
    this.s = obj.s;
    
System.out.println(" constructeur de copie .............");
}
//*************************  Programme Principal ***************************************
/*public static void main (String arg [ ] ) {
Exemple obj1;
obj1 = new Exemple();
Exemple obj2 = new Exemple(obj1);
System.out.println("x de obj1 : "+obj1.getX());
System.out.println("s obj1 : "+obj1.getS());

System.out.println("x obj2 : "+obj2.getX());
System.out.println("s obj2 : "+obj2.getS());
obj2.setX(500);
System.out.println("x de obj1 : "+obj1.getX());
System.out.println("x obj2 : "+obj2.getX());
obj1.x = 12;
}*/
};