import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.menu();
        System.out.println("El numero decimal es: " + main.binarioADecimal(101));
        main.parOImpar(5 );
        main.multiploDe10(20);
        main.numeroPrimo(1);
    }
/*
    public void menu() {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1. División Exacta");
            System.out.println("2. Binario a Decimal");
            System.out.println("3. Par o Impar");
            System.out.println("4. Múltiplo de 10");
            System.out.println("5. Número Primo");
            System.out.println("6. Factorial");
            System.out.println("7. Mostrar N números");
            System.out.println("8. Invertir Frase");
            System.out.println("9. Serie numérica");
            System.out.println("10. Capicúa");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    divisionExacta();
                    break;
                case 2:
                    binarioADecimal();
                    break;
                case 3:
                    parOImpar();
                    break;
                case 4:
                    multiploDe10();
                    break;
                case 5:
                    numeroPrimo();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mostrarNumeros();
                    break;
                case 8:
                    invertirFrase();
                    break;
                case 9:
                    serieNumerica();
                    break;
                case 10:
                    capicua();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }*/

    public void divisionExacta(double a, double b) {
        double division = a / b;
        if (division == (int) division){
            System.out.println("La division es exacta.");
        }else {
            System.out.println("La division no es exacta");
        }
    }

    public int binarioADecimal(int a) {
         String numeroStr = Integer.toString(a);
         int cantDigitos = numeroStr.length();
         char digito;
         int numDecimal = 0;
        for (int i = 0; i < cantDigitos ; i++) {
            digito = numeroStr.charAt(i);
            if (digito == '1'){
                numDecimal += (int) Math.pow(2,i);
            } else if (digito == '0') {
                numDecimal += 0;
            }else {
                System.out.println("El numero no es binario");
                break;
            }
        }
        return numDecimal;
    }

    public void parOImpar(int num) {
        if (num % 2 == 0){
            System.out.println(num + " es un numero par");
        }else {
            System.out.println(num + " es un numero impar");
        }
    }

    public void multiploDe10(int a) {
        if (a % 10 == 0){
            System.out.println(a + " es multiplo de 10");
        } else {
            System.out.println(a + " no es multiplo de 10");
        }
    }

    public void numeroPrimo(int a) {
        int contador = 0;

        for (int i = 1; i <= a; i++) {
            if((a % i) == 0)
            {
                contador++;
            }
        }
        if (a > 0) {
            if (contador <= 2) {
                System.out.println("El numero " + a + " es primo");
            } else {
                System.out.println("El numero " + a + " no es primo");
            }
        }else {
            System.out.println("El numero " + a + " no es primo");
        }
    }


    public void factorial() {
        // Agrega la lógica para "Factorial" aquí
    }

    public void mostrarNumeros() {
        // Agrega la lógica para "Mostrar N números" aquí
    }

    public void invertirFrase() {
        // Agrega la lógica para "Invertir Frase" aquí
    }

    public void serieNumerica() {
        // Agrega la lógica para "Serie numérica" aquí
    }

    public void capicua() {
        // Agrega la lógica para "Capicúa" aquí
    }
}

