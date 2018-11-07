/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeiterativas;


import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Metodos {
    
    int nota;
    public int pedirNota(){
        int res;
        Scanner sc= new Scanner(System.in);
        do{
        System.out.println("teclea nota");
       res= sc.nextInt();
        }while(res<1||res>10);
       return res;
       
    }
    public void bucleWhile(){
        nota= pedirNota();
        while(nota>=5){
            System.out.println("aprobado");
        }
        System.out.println("Saimos do While");
    }
    public void bucleDoWhile(){
        do{
        nota= pedirNota();
        if(nota>=5)
        System.out.println("**esta aprbado");
        }while(nota>=5);
        System.out.println("salimos de do...while");
    }
    public void bucleFor(){
        int cont;
        for(cont=0; cont<5 ; cont++){
            nota=pedirNota();
            if(nota>=5)
            System.out.println("aprobado");
        }
        System.out.println("Salimos bucle for");
    }
   
}
