/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public interface  Poligono {
    
     public static void areaTriangulo()
    {
        
    double base=5;
    double altura=3;
    double Area=(base*altura)/2;
    System.out.println(Area);
        
    }
    public static void perimetroTriangulo()
    {
    double base=2;
    double altura=3;
    double hipotenusa=2;
    double Perimetro=(base+altura+hipotenusa);
        System.out.println(Perimetro);
    }
     public static void areaCuadrilatero()
    {
    double base=3;
    double altura=3;
    double Area=(base*altura);
        System.out.println(Area);
    }
    public static void perimetroCuadrilatero()
    {
    double base=3;
    double altura=3;
    double Perimetro=(2*base+2*altura);
        System.out.println(Perimetro);
    }
    public static void areaPentagono()
    {
    double lado=3;
    double numerolados=5;
    double apotema=4;
    double Area=(lado*numerolados*apotema)/2;
       System.out.println(Area);
    }
    public static void perimetroPentagono()
    {
    double lado=3;
    double numerolados=5;
    double Perimetro=(lado*numerolados);
        System.out.println(Perimetro);
    }
    public static void areaHexagono()
    {
    double lado=3;
    double numerolados=6;
    double apotema=4;
    double Area=(lado*numerolados*apotema)/2;
        System.out.println(Area);
    }
    public static void perimetroHexagono()
    {
    double lado=3;
    double numerolados=6;
    double Perimetro=(lado*numerolados);
        System.out.println(Perimetro);
    }
    public static void areaOctagono()
    {
    double lado=3;
    double numerolados=8;
    double apotema=4;
    double Area=(lado*numerolados*apotema)/2;
        System.out.println(Area);
    }
    public static void perimetroOctagono()
    {
    double lado=3;
    double numerolados=8;
    double Perimetro=(lado*numerolados);
        System.out.println(Perimetro);
    }
    
    
}
