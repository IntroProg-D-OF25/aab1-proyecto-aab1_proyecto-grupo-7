import java.util.Random;
import java.util.Scanner;

public class PROYECTO {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random random = new Random();
        
        String[] nombresEstudiantes = {"Juan", "Pedro", "Luis", "Ana", "María","Amely","Victoria","Emily"};
        String[] nombresMaterias = {"Programación", "Lengua", "Matemáticas", "Cálculo", "Estructuras", "Filosofía","Computacion"};
        double notaACD, notaAPE, notaAA, NotaTotal, notaRecu, PromedioRecu;
        int totalEstudiantes = 0, aprobados = 0, reprobados = 0, Numcedula;
        boolean respuesta;

        do {
            totalEstudiantes++;
            // Seleccionar nombre y materia aleatorios
            String nombreEstudiante = nombresEstudiantes[random.nextInt(nombresEstudiantes.length)];
            String nombreMateria = nombresMaterias[random.nextInt(nombresMaterias.length)];
            // Generar un número de cédula aleatorio
            Numcedula = random.nextInt(1000000000) + 1;  
            // Generar notas aleatorias
            notaACD = Math.random() * 3.5; 
            notaAPE = Math.random() * 3.5; 
            notaAA = Math.random() * 3.0; 
            notaRecu = Math.random() * 3.5;
            NotaTotal = notaACD + notaAPE + notaAA;
            // Evaluar si el estudiante aprueba o reprueba
            if (NotaTotal >= 7) {
                aprobados++;
                System.out.println("Estudiante: " + nombreEstudiante+", Cedula: "+Numcedula);
                System.out.println("Materia: " + nombreMateria); 
                System.out.println ("----Calificaciones----");
                System.out.printf("ACD: %.2f,  APE: %.2f, AA: %.2f",notaACD,notaAPE,notaAA);
                System.out.println(" Promedio: "+NotaTotal);
                System.out.println("------APROBADO/A------");
            } else {
                reprobados++;
                PromedioRecu = (NotaTotal * 0.6) + notaRecu;
                System.out.println("Estudiante: " + nombreEstudiante+", Cedula: "+Numcedula);
                System.out.println("Materia: " + nombreMateria); 
                System.out.println ("----Calificaciones----");
                System.out.printf("ACD: %.2f,  APE: %.2f, AA: %.2f",notaACD,notaAPE,notaAA);
                System.out.println(" Promedio: "+NotaTotal);
                System.out.println("------REPROBADO/A------");
                System.out.println("Deberá rendir un examen de recuperación.");
                
                if (PromedioRecu >= 7) {
                    aprobados++;
                    System.out.println("--Aprobado/a tras recuperación-- " );
                    System.out.println("Nota de recuperacion: "+notaRecu);
                    System.out.println("Promedio total:" +PromedioRecu);
                } else {
                    reprobados++;
                    System.out.println("--Reprobado/a tras recuperación-- " );
                    System.out.println("Nota de recuperacion: "+notaRecu);
                    System.out.println("Promedio total:" +PromedioRecu);                }
            }

            System.out.println("¿Desea ingresar otro estudiante (True/False)?: ");
            respuesta = tcl.nextBoolean();
        } while (respuesta);

        // Cálculo de porcentajes
        double porcentajeAprobados = (double) aprobados / totalEstudiantes * 100;
        double porcentajeReprobados = (double) reprobados / totalEstudiantes * 100;
        System.out.printf("Total Estudiantes: %d\tAprobados: %d\tReprobados: %d\n", totalEstudiantes, aprobados, reprobados);
        System.out.println("-----------------------------------");
        System.out.printf("Porcentaje de aprobados: %.2f%%\n", porcentajeAprobados);
        System.out.println("-----------------------------------");
        System.out.printf("Porcentaje de reprobados: %.2f%%\n", porcentajeReprobados);
    }
}
