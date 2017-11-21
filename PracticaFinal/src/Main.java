/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
     
      
        
        System.out.println("-----------------------------------");
        System.out.println("Problema 2");
        Triangulo triangle=new Triangulo();
        Cuadrilatero cuadrilatero=new Cuadrilatero();
        Pentagono pentagono=new Pentagono();
        Hexagono hexagono=new Hexagono();
        Octagono octagono=new Octagono();
       
        System.out.println("area triangulo:");
        triangle.mostrarArea();
        System.out.println("area cuadrilatero:");
        cuadrilatero.mostrarArea();
        System.out.println("area pentagono:");
        pentagono.mostrarArea();
        System.out.println("area hexagono:");
        hexagono.mostrarArea();
        System.out.println("area octagono:");
        octagono.mostrarArea();
        
      
    
    
    }
}
