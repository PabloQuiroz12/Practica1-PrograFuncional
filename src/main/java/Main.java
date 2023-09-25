import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
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
                    double a, b;
                    System.out.print("Ingresa el valor de a: ");
                    a = scanner.nextDouble();
                    System.out.print("Ingresa el valor de b: ");
                    b = scanner.nextDouble();
                    divisionExacta(a, b);
                    break;
                case 2:
                    int binario;
                    System.out.print("Ingresa un número binario: ");
                    binario = scanner.nextInt();
                    System.out.println("El número decimal es: " + binarioADecimal(binario));
                    break;
                case 3:
                    int num;
                    System.out.print("Ingresa un número: ");
                    num = scanner.nextInt();
                    parOImpar(num);
                    break;
                case 4:
                    int multiplo;
                    System.out.print("Ingresa un número: ");
                    multiplo = scanner.nextInt();
                    multiploDe10(multiplo);
                    break;
                case 5:
                    int primo;
                    System.out.print("Ingresa un número: ");
                    primo = scanner.nextInt();
                    numeroPrimo(primo);
                    break;
                case 6:
                    int factorialNum;
                    System.out.print("Ingresa un número para calcular su factorial: ");
                    factorialNum = scanner.nextInt();
                    int resultadoFactorial = factorial(factorialNum);
                    System.out.println("El factorial de " + factorialNum + " es: " + resultadoFactorial);
                    break;
                case 7:
                    mostrarNumeros();
                    break;
                case 8:
                    scanner.nextLine(); // Limpiar el buffer
                    String frase;
                    System.out.print("Ingresa una frase: ");
                    frase = scanner.nextLine();
                    String fraseInvertida = invertirFrase(frase);
                    System.out.println("Frase invertida: " + fraseInvertida);
                    break;
                case 9:
                    int n;
                    System.out.print("Ingresa el valor de N: ");
                    n = scanner.nextInt();
                    serieNumerica(n);
                    break;
                case 10:
                    int capicuaNum;
                    System.out.print("Ingresa un número: ");
                    capicuaNum = scanner.nextInt();
                    if (esCapicua(capicuaNum)) {
                        System.out.println("El número " + capicuaNum + " es capicúa.");
                    } else {
                        System.out.println("El número " + capicuaNum + " no es capicúa.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public void divisionExacta(double a, double b) {
        double division = a / b;
        if (division == (int) division) {
            System.out.println("La división es exacta.");
        } else {
            System.out.println("La división no es exacta");
        }
    }

    public int binarioADecimal(int a) {
        String numeroStr = Integer.toString(a);
        int cantDigitos = numeroStr.length();
        char digito;
        int numDecimal = 0;
        for (int i = 0; i < cantDigitos; i++) {
            digito = numeroStr.charAt(i);
            if (digito == '1') {
                numDecimal += (int) Math.pow(2, i);
            } else if (digito == '0') {
                numDecimal += 0;
            } else {
                System.out.println("El número no es binario");
                break;
            }
        }
        return numDecimal;
    }

    public void parOImpar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " es un número par");
        } else {
            System.out.println(num + " es un número impar");
        }
    }

    public void multiploDe10(int a) {
        if (a % 10 == 0) {
            System.out.println(a + " es múltiplo de 10");
        } else {
            System.out.println(a + " no es múltiplo de 10");
        }
    }

    public void numeroPrimo(int a) {
        int contador = 0;

        for (int i = 1; i <= a; i++) {
            if ((a % i) == 0) {
                contador++;
            }
        }
        if (a > 0) {
            if (contador <= 2) {
                System.out.println("El número " + a + " es primo");
            } else {
                System.out.println("El número " + a + " no es primo");
            }
        } else {
            System.out.println("El número " + a + " no es primo");
        }
    }

    public int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }

    public void mostrarNumeros() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números que deseas mostrar: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public String invertirFrase(String frase) {
        String[] palabras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]);
            if (i > 0) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }

    public void serieNumerica(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");
            if (i % 2 == 0) {
                start += 4;
            } else {
                start -= 2;
            }
        }
    }

    public boolean esCapicua(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digito = num % 10;
            reversedNum = reversedNum * 10 + digito;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}


