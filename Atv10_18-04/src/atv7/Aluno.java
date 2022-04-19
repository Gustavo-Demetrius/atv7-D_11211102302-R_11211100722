/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv7;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String m1, m2;
       float n1, n2, media;
      
       /*
       Gustavo Demetrius dos Santos RGM:11211102302
       Lucas dos Santos Reis RGM:11211100722
       */
       
       System.out.println("Insira a nota da M1");
       Scanner nota1 = new Scanner(System.in);
       m1 = nota1.nextLine();
       n1 = (new Float(m1).floatValue());
      
       System.out.println("Insira a nota da M2");
       Scanner nota2 = new Scanner(System.in);
       m2 = nota2.nextLine();
       n2 = (new Float(m2).floatValue());
       
       System.out.println("A média do aluno foi de:");
       System.out.println( (n1 + n2)/2 );
    }
    
}
