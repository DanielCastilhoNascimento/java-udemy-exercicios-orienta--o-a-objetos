import java.util.Scanner;

public class CalculoTrianguloSemOO {
    /*
     * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y 
     * (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois 
     * triângulos e dizer qual dos dois triângulos possui a maior área. 
     * Use a fórmula de Heron para calcular a área de um triângulo a partir das
     * medidas de seus lados a, b e c.
     * 
     * area = raiz de (p( p - a)( p - b)( p - c)), Onde p = (a + b + c)/2
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as medidas do 1o. Triangulo");
        double Xa = scanner.nextDouble();
        double Xb = scanner.nextDouble();
        double Xc = scanner.nextDouble();
        double p = (Xa + Xb + Xc)/2;
        double areaX = Math.sqrt(p * (p - Xa) * ( p - Xb) * ( p - Xc));
        

        System.out.println("Digite as medidas do 2o. Triangulo");
        double Ya = scanner.nextDouble();
        double Yb = scanner.nextDouble();
        double Yc = scanner.nextDouble();
        p = (Ya + Yb + Yc)/2;
        double areaY = Math.sqrt(p * (p - Ya) * ( p - Yb) * ( p - Yc));

        System.out.printf("Area do Triagulo X: %.4f %n ", areaX);
        System.out.printf("Area do Triagulo Y: %.4f %n ", areaY);

        if(areaX > areaY){
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }








        scanner.close();        
     }


}
