import java.util.Scanner;


public class Circulo extends Figura{

    @Override
    double CalcularArea() {
        double area = Math.PI* Math.pow(calcularRadio(0,1),2);
        return area;
    }

    @Override
    double CalcularPerimetro() {
        double perimetro = 2* Math.PI*calcularRadio(0,1);
        return perimetro;
    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<2; i++ ){
            System.out.println("Coordenada x"+i+": ");
            double x = sc.nextDouble();
            System.out.println("Coordenada y"+i+": ");
            double y = sc.nextDouble();
            System.out.println("Coordenada z"+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));

        }
    }

    @Override
    double CalcularVolumen() {
        return 0;
    }


}