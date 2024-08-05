 package sistemas;

 import java.util.Scanner;
 
 public class App {
 
     // Diseñe un algoritmo para saludar al usuario: Hola usuario. El nombre del usuario es ingresado por teclado
    public static String saludarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        String saludo = "Hola, " + nombre;

        return saludo;
    }

    // Diseñe un algoritmo que lea por teclado una velocidad en Km/seg y la convierta a metros/seg y a metros/hora
    // retorne el valor en formato string (metrosPorSeg + "|" + metrosPorHora)
    public static String convertirVelocidad() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la velocidad en Km/seg: ");
        double kmPorSeg = scanner.nextDouble();

        double metrosPorSeg = kmPorSeg * 1000;
        double metrosPorHora = metrosPorSeg * 3600;

        return metrosPorSeg + "|" + metrosPorHora;
    }

    // Solicitar al usuario ingresar una cantidad expresada en cc (centímetros cúbicos) y devolver su cantidad en litros
    public static int convertirCcALitros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en cc: ");
        double cc = scanner.nextDouble();

        double litros = cc / 1000;
        return (int) litros;
    }

    // Solicitar al usuario ingresar una cantidad en dólares y convertirla a pesos según la TRM del día
    public static int convertirDolaresAPesos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        System.out.print("Ingrese la TRM del día: ");
        double trm = scanner.nextDouble();

        double pesos = dolares * trm;
        return (int) pesos;
    }

    // Solicitar al usuario ingresar la temperatura en grados centígrados y convertirla en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5)
    public static int convertirCelsiusAFahrenheit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados centígrados: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);
        return (int) fahrenheit;
    }

    // Solicitar al usuario ingresar Nro de Días nro de horas nro de minutos y nro segundos y convertir todo a segundos.
    public static int convertirATotalSegundos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de días: ");
        int dias = scanner.nextInt();

        System.out.print("Ingrese el número de horas: ");
        int horas = scanner.nextInt();

        System.out.print("Ingrese el número de minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese el número de segundos: ");
        int segundos = scanner.nextInt();

        int totalSegundos = (dias * 86400) + (horas * 3600) + (minutos * 60) + segundos;
        return totalSegundos;
    }

    // Un usuario tiene un sistema de báscula para pesar camiones, dado el peso de un camión debe sacar el peso neto de la carga en kilos y toneladas
    // retorne el valor en formato string (pesoEnKg + "|" + pesoEnToneladas)
    public static String calcularPesoNeto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del camión: ");
        double peso = scanner.nextDouble();

        double pesoEnKg = peso;
        double pesoEnToneladas = peso / 1000;

        return pesoEnKg + "|" + pesoEnToneladas;
    }

    // Diseñe un algoritmo que calcule el tiempo necesario para alcanzar un destino dado por el usuario quien además ingresará la velocidad promedio en kilómetros/hora y la distancia en kilómetros
    public static int calcularTiempoViaje() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese la velocidad promedio en kilómetros/hora: ");
        double velocidadKilometros = scanner.nextDouble();

        double tiempo = distancia / velocidadKilometros;
        return (int) tiempo;
    }

    // Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. El piloto desea un algoritmo que ingresando 4 rutas y el kilometraje de cada ruta obtenga la cantidad de combustible que debe tanquear en el avión.
    public static int calcularCombustible() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el kilometraje de la ruta 1: ");
        double ruta1 = scanner.nextDouble();

        System.out.print("Ingrese el kilometraje de la ruta 2: ");
        double ruta2 = scanner.nextDouble();

        System.out.print("Ingrese el kilometraje de la ruta 3: ");
        double ruta3 = scanner.nextDouble();

        System.out.print("Ingrese el kilometraje de la ruta 4: ");
        double ruta4 = scanner.nextDouble();

        double totalKm = ruta1 + ruta2 + ruta3 + ruta4;
        double combustible = (totalKm / 60.8) * 0.2 + 1.2 + 0.4;
        return (int) combustible;
    }

    // Diseñar un algoritmo que calcule el peso neto en la luna de un peso terrestre ingresado por teclado. La gravedad de la Luna es de alrededor del 17% más que la de la tierra
    public static int calcularPesoLunar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso terrestre: ");
        double pesoTierra = scanner.nextDouble();

        double pesoLunar = pesoTierra * 0.17;
        return (int) pesoLunar;
    }

    // Diseñar un algoritmo que calcule el saldo que debe haber en una taquilla de un banco. El cajero deberá ingresar la base el total de recaudos y el total de retiros
    public static int calcularSaldoTaquilla() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el total de recaudos: ");
        double ingresos = scanner.nextDouble();

        System.out.print("Ingrese el total de retiros: ");
        double retiros = scanner.nextDouble();

        double saldo = base + ingresos - retiros;
        return (int) saldo;
    }

    // Diseñe un algoritmo para calcular la propina en un restaurante(10%) el impuesto al consumo (8%) y el valor final que deberá pagar ingresando el valor de la comida.
    // retorne el valor en formato string (propina + "|" + impuesto + "|" + total)
    public static String calcularCuentaRestaurante() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la comida: ");
        double costoComida = scanner.nextDouble();

        double propina = costoComida * 0.10;
        double impuesto = costoComida * 0.08;
        double total = costoComida + propina + impuesto;

        return propina + "|" + impuesto + "|" + total;
    }
    
    // Diseñar un algoritmo que obtenga los puntos finales de un equipo de fútbol (puntuación según lineamientos de Fifa) a partir de los datos ingresados por teclado: Número de partidos ganados número de partidos perdidos número de partidos empatados.
    public static int calcularPuntosFutbol() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de partidos ganados: ");
        int ganados = scanner.nextInt();

        System.out.print("Ingrese el número de partidos perdidos: ");
        int perdidos = scanner.nextInt();

        System.out.print("Ingrese el número de partidos empatados: ");
        int empatados = scanner.nextInt();

        int puntos = ganados * 3 + empatados;
        return puntos;
    }

    // Elaborar un algoritmo que dadas todas las 5 notas y los 5 porcentajes para una materia calcule la nota final.
    public static int calcularNotaFinal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Ingrese la nota 4: ");
        double nota4 = scanner.nextDouble();

        System.out.print("Ingrese la nota 5: ");
        double nota5 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 1: ");
        double porcentaje1 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 2: ");
        double porcentaje2 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 3: ");
        double porcentaje3 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 4: ");
        double porcentaje4 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 5: ");
        double porcentaje5 = scanner.nextDouble();

        double notaFinal = (nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4 + nota5 * porcentaje5) / 100;
        return (int) notaFinal;
    }

    // Elaborar un algoritmo que dados los 5 porcentajes de una materia y las 4 primeras notas calcule cuánto tiene que sacar para ganar si el puntaje mínimo es 3.
    public static int calcularNotaNecesaria() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el porcentaje 1: ");
        double porcentaje1 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 2: ");
        double porcentaje2 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 3: ");
        double porcentaje3 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 4: ");
        double porcentaje4 = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje 5: ");
        double porcentaje5 = scanner.nextDouble();

        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Ingrese la nota 4: ");
        double nota4 = scanner.nextDouble();

        double notaTotal = nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4;
        double notaNecesaria = (3 * 100 - notaTotal) / porcentaje5;
        return (int) notaNecesaria;
    }

     // Se requiere un algoritmo para calcular el salario a pagar a un trabajador con los siguientes datos ingresados por teclado: cantidad de horas normales laboradas cantidad de horas extras diurnas laboradas cantidad de horas extras nocturnas laboradas valor de la hora normal. El valor de las horas extras diurnas tienen un recargo adicional del 15% sobre la hora normal. El valor de las horas extras nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     public static int calcularSalario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas normales laboradas: ");
        int horasNormales = scanner.nextInt();

        System.out.print("Ingrese la cantidad de horas extras diurnas laboradas: ");
        int horasExtrasDiurnas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de horas extras nocturnas laboradas: ");
        int horasExtrasNocturnas = scanner.nextInt();

        System.out.print("Ingrese el valor de la hora normal: ");
        double valorHoraNormal = scanner.nextDouble();

        double valorHorasExtrasDiurnas = valorHoraNormal * 1.15;
        double valorHorasExtrasNocturnas = valorHoraNormal * 1.35;

        double salario = horasNormales * valorHoraNormal + horasExtrasDiurnas * valorHorasExtrasDiurnas + horasExtrasNocturnas * valorHorasExtrasNocturnas;
        return (int) salario;
    }

    public static double calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
    
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
    
        double area = (base * altura) / 2;
        return area;
    }

    public static double calcularPerimetroCuadrado() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
    
        double perimetro = 4 * lado;
        return perimetro;
    }

    // Un algoritmo que calcule el volumen de un cilindro
public static double calcularVolumenCilindro() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el radio del cilindro: ");
    double radio = scanner.nextDouble();

    System.out.print("Ingrese la altura del cilindro: ");
    double altura = scanner.nextDouble();

    double volumen = Math.PI * Math.pow(radio, 2) * altura;
    return volumen;
}

// Un algoritmo que calcule el área del círculo
public static double calcularAreaCirculo() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el radio del círculo: ");
    double radio = scanner.nextDouble();

    double area = Math.PI * Math.pow(radio, 2);
    return area;
}


    public static void main(String[] args) {
        
    }
}

