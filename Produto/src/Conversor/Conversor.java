/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author Administrador
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String st, st2;
       float real, real2;
       int int1, int2;
       
        /*
       Gustavo Demetrius dos Santos RGM:11211102302
       Lucas dos Santos Reis RGM:11211100722
       */
       
       // String para real
       st = "12";
       real = (float) (new Float(st).floatValue());
       System.out.println("String para real" + real);
       
       // real para String
       real2 = 10;
       st2 = new Float(real2).toString();
       System.out.println("Real para String" + st2);
       
       // String para inteiro
       st2 = "13";
       int1 = Integer.parseInt(st2);
       System.out.println("String para inteiro" + Produto.int1);
       
       // String para real
       int2 = 5;
       st2 = Integer.toString(Produto.int2);
       System.out.println("Inteiro para String" + st2);
       
    }
    
}
