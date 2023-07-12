import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        System.out.println("Cálculos del Área y Perímetro de las figuras");

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Piramide");
            System.out.println("5. Cubo");
            System.out.println("6. Esfera");
            System.out.println("7. Salir");

            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case '1':
                    Triangulo tr = new Triangulo();
                    tr.IngresarPuntos();
                    System.out.println("area:"+tr.CalcularArea());
                    System.out.println("Perimetro:"+tr.CalcularPerimetro());
                    break;
                case '2':
                    Cuadrado cu = new Cuadrado();
                    cu.IngresarPuntos();
                    System.out.println("area:"+cu.CalcularArea());
                    System.out.println("perimetro:"+cu.CalcularPerimetro());
                    break;
                case '3':
                    Circulo ci = new Circulo();
                    ci.IngresarPuntos();
                    System.out.println("area:"+ci.CalcularArea());
                    System.out.println("perimetro:"+ci.CalcularPerimetro());
                    break;
                case '4':
                    Piramide pi  = new Piramide();
                    pi.IngresarPuntos();
                    System.out.println("area:"+pi.CalcularArea());
                    System.out.println("perimetro:"+pi.CalcularPerimetro());
                    System.out.println("volumen:"+pi.CalcularVolumen());
                    break;
                case '5':
                    Cubo cb = new Cubo();
                    cb.IngresarPuntos();
                    System.out.println("area:"+cb.CalcularArea());
                    System.out.println("perimetro:"+cb.CalcularPerimetro());
                    System.out.println("volumen:"+cb.CalcularVolumen());
                    break;
                case '6':
                    Esfera es = new Esfera();
                    es.IngresarPuntos();
                    System.out.println("area:"+es.CalcularArea());
                    System.out.println("perimetro:"+es.CalcularPerimetro());
                    System.out.println("volumen:"+es.CalcularVolumen());
                    break;
                case '7':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != '7');
    }
}