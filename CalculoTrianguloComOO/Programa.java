package CalculoTrianguloComOO;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Triangulo trianguloX = new Triangulo();
        Triangulo trianguloY = new Triangulo();

        System.out.println("Digite as medidas do 1o. Triangulo : ");
        trianguloX.a = scanner.nextDouble();            // passando o valor diretamente para o atributo / Geters e Seters
        trianguloX.b = scanner.nextDouble();
        trianguloX.c = scanner.nextDouble();

        System.out.println("Digite as medidas do 2o. Triangulo : ");
        trianguloY.a = scanner.nextDouble();            
        trianguloY.b = scanner.nextDouble();
        trianguloY.c = scanner.nextDouble();

        double areaX = trianguloX.area();               //metodo de impressao deveria estar na classe triangulo
        System.out.printf("Area X : %.4f %n", areaX);
        double areaY = trianguloY.area();
        System.out.printf("Area Y : %.4f %n", areaY);

        if(areaX > areaY){
            System.out.println("Maior area: X");
        }else{
            System.out.println("Maior area: Y");
        }

        scanner.close();
    }

}
