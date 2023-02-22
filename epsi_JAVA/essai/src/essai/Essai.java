/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essai;


import java.util.ArrayList;

/**
 *
 * @author cyril
 */
public class Essai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		Article a1=new Article(1000,"sh50","Steack haché",500,1);
		Article a2=new Article(2000,"pas70","Casserole",2000,0);
        	    ArrayList<Article> article = new ArrayList<Article>();
	    article.add(a1);
	    article.add(a2);
            System.out.println(article);
    }

}
