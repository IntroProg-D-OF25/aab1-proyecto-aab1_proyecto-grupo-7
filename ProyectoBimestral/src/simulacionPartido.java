import java.util.Random;

public class simulacionPartido {

    public static void main(String[] args) {

        // Variables

        Random random = new Random();
        int numeroJugadores = 11;
        int i = 1;
        String equipoA = "";
        String equipoB = "";
        String nombre, posicionJugador;
        int edad, goles;
        int golesEquipoA = 0;
        int golesEquipoAPenales = 0;
        int golesEquipoB = 0;
        int golesEquipoBPenales = 0;
        int numeroRandom, numeroRandomPenales;
        
        // Equipo A listado

        while (i <= numeroJugadores) { 
            
            numeroRandom = random.nextInt(30) + 1;

            switch (numeroRandom) {
                case 1:  nombre = "Juan      "; break;
                case 2:  nombre = "Pedro     "; break;
                case 3:  nombre = "Luis      "; break;
                case 4:  nombre = "Carlos    "; break;
                case 5:  nombre = "Jorge     "; break;
                case 6:  nombre = "Diego     "; break;
                case 7:  nombre = "Ricardo   "; break;
                case 8:  nombre = "Alberto   "; break;
                case 9:  nombre = "Fernando  "; break;
                case 10: nombre = "Francisco "; break;
                case 11: nombre = "Pablo     "; break;
                case 12: nombre = "Sebastián "; break;
                case 13: nombre = "Manuel    "; break;
                case 14: nombre = "Antonio   "; break;
                case 15: nombre = "Alejandro "; break;
                case 16: nombre = "Raúl      "; break;
                case 17: nombre = "David     "; break;
                case 18: nombre = "Gabriel   "; break;
                case 19: nombre = "Adrián    "; break;
                case 20: nombre = "José      "; break;
                case 21: nombre = "Víctor    "; break;
                case 22: nombre = "Mario     "; break;
                case 23: nombre = "Eduardo   "; break;
                case 24: nombre = "Ricardo   "; break;
                case 25: nombre = "Emilio    "; break;
                case 26: nombre = "Felipe    "; break;
                case 27: nombre = "Iván      "; break;
                case 28: nombre = "Álvaro    "; break;
                case 29: nombre = "Oscar     "; break;
                case 30: nombre = "Héctor    "; break;
                default: throw new AssertionError("Número fuera de rango: " + numeroRandom);
            }
            
            switch (i) {
                case 1:  posicionJugador = "Portero (Arquero)                             "; break;
                case 2:  posicionJugador = "Lateral Derecho (Defensa Derecho)             "; break;
                case 3:  posicionJugador = "Central Derecho (Defensa Central Derecho)     "; break;
                case 4:  posicionJugador = "Central Izquierdo (Defensa Central Izquierdo) "; break;
                case 5:  posicionJugador = "Lateral Izquierdo (Defensa Izquierdo)         "; break;
                case 6:  posicionJugador = "Centrocampista Derecho                        "; break;
                case 7:  posicionJugador = "Centrocampista Central (Mediocampista)        "; break;
                case 8:  posicionJugador = "Centrocampista Izquierdo                      "; break;
                case 9:  posicionJugador = "Extremo Derecho (Delantero Derecho)           "; break;
                case 10: posicionJugador = "Extremo Izquierdo (Delantero Izquierdo)       "; break;
                case 11: posicionJugador = "Delantero Centro (Punta)                      "; break;
                default: posicionJugador = "Posición no válida                            "; break;
            }            

            edad = random.nextInt(13) + 18;
            goles = random.nextInt(2);
            golesEquipoA += goles;

            if(i<=9) {
                equipoA += "|   Jugador " + i + ": " + nombre + "   |   Posición " + posicionJugador + "  |   " + edad + "   |   " + goles + "   |";
            } else {
                equipoA += "|   Jugador " + i + ": " + nombre + "  |   Posición " + posicionJugador + "  |   " + edad + "   |   " + goles + "   |";
            }

            equipoA += "\n";

            i++;

        }

        i = 1;

        // Equipo B Listado

        while (i <= numeroJugadores) { 
            
            numeroRandom = random.nextInt(30) + 1;

            switch (numeroRandom) {
                case 1:  nombre = "Juan      "; break;
                case 2:  nombre = "Pedro     "; break;
                case 3:  nombre = "Luis      "; break;
                case 4:  nombre = "Carlos    "; break;
                case 5:  nombre = "Jorge     "; break;
                case 6:  nombre = "Diego     "; break;
                case 7:  nombre = "Ricardo   "; break;
                case 8:  nombre = "Alberto   "; break;
                case 9:  nombre = "Fernando  "; break;
                case 10: nombre = "Francisco "; break;
                case 11: nombre = "Pablo     "; break;
                case 12: nombre = "Sebastián "; break;
                case 13: nombre = "Manuel    "; break;
                case 14: nombre = "Antonio   "; break;
                case 15: nombre = "Alejandro "; break;
                case 16: nombre = "Raúl      "; break;
                case 17: nombre = "David     "; break;
                case 18: nombre = "Gabriel   "; break;
                case 19: nombre = "Adrián    "; break;
                case 20: nombre = "José      "; break;
                case 21: nombre = "Víctor    "; break;
                case 22: nombre = "Mario     "; break;
                case 23: nombre = "Eduardo   "; break;
                case 24: nombre = "Ricardo   "; break;
                case 25: nombre = "Emilio    "; break;
                case 26: nombre = "Felipe    "; break;
                case 27: nombre = "Iván      "; break;
                case 28: nombre = "Álvaro    "; break;
                case 29: nombre = "Oscar     "; break;
                case 30: nombre = "Héctor    "; break;
                default: throw new AssertionError("Número fuera de rango: " + numeroRandom);
            }
            
            switch (i) {
                case 1:  posicionJugador = "Portero (Arquero)                             "; break;
                case 2:  posicionJugador = "Lateral Derecho (Defensa Derecho)             "; break;
                case 3:  posicionJugador = "Central Derecho (Defensa Central Derecho)     "; break;
                case 4:  posicionJugador = "Central Izquierdo (Defensa Central Izquierdo) "; break;
                case 5:  posicionJugador = "Lateral Izquierdo (Defensa Izquierdo)         "; break;
                case 6:  posicionJugador = "Centrocampista Derecho                        "; break;
                case 7:  posicionJugador = "Centrocampista Central (Mediocampista)        "; break;
                case 8:  posicionJugador = "Centrocampista Izquierdo                      "; break;
                case 9:  posicionJugador = "Extremo Derecho (Delantero Derecho)           "; break;
                case 10: posicionJugador = "Extremo Izquierdo (Delantero Izquierdo)       "; break;
                case 11: posicionJugador = "Delantero Centro (Punta)                      "; break;
                default: posicionJugador = "Posición no válida                            "; break;
            }  

            edad = random.nextInt(13) + 18;
            goles = random.nextInt(2);
            golesEquipoB += goles;

            if(i<=9) {
                equipoB += "|   Jugador " + i + ": " + nombre + "   |   Posición " + posicionJugador + "  |   " + edad + "   |   " + goles + "   |";
            } else {
                equipoB += "|   Jugador " + i + ": " + nombre + "  |   Posición " + posicionJugador + "  |   " + edad + "   |   " + goles + "   |";
            }

            equipoB += "\n";

            i++;

        }

        System.out.println("LISTADO DE JUGADORES POR EQUIPO:");

        System.out.println();
        System.out.println("EQUIPO A");
        System.out.println();
        System.out.println(" ---------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("|   Nombre                  |   Posición                                                 |  Edad  | Goles |");
        System.out.println("|---------------------------|------------------------------------------------------------|--------|-------|");
        System.out.println(equipoA);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("EQUIPO B");
        System.out.println();
        System.out.println(" ---------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("|   Nombre                  |   Posición                                                 |  Edad  | Goles |");
        System.out.println("|---------------------------|------------------------------------------------------------|--------|-------|");
        System.out.println(equipoB);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("ESTADÍSTICA DEL PARTIDO:");
        System.out.println("Goles Equipo A: " + golesEquipoA);
        System.out.println("Goles Equipo B: " + golesEquipoB);

        if(golesEquipoA == golesEquipoB) {

            System.out.println("=========================================");
            System.out.println("           ¡EMPATE EN EL PARTIDO!        ");
            System.out.println("=========================================");
            System.out.println("                   PENALES               ");
            System.out.println("=========================================");
            
            i = 1;

            // Penales equipo A
            while (i <= 5) {

                numeroRandomPenales = random.nextInt(2);
                golesEquipoAPenales += numeroRandomPenales;
                i++;

            }

            i = 1;

            // Penales equipo B
            while (i <= 5) {

                numeroRandomPenales = random.nextInt(2);
                golesEquipoBPenales += numeroRandomPenales;
                i++;

            }

            System.out.println("ESTADÍSTICA DEL PENALES:");
            System.out.println("Goles Equipo A: " + golesEquipoAPenales);
            System.out.println("Goles Equipo B: " + golesEquipoBPenales);

            if (golesEquipoAPenales == golesEquipoBPenales) {
                System.out.println("=========================================");
                System.out.println("           ¡EMPATE EN EL PARTIDO!        ");
                System.out.println("=========================================");
            } else if (golesEquipoAPenales > golesEquipoBPenales) {
                System.out.println("Equipo ganador: Equipo A");
            } else {
                System.out.println("Equipo ganador: Equipo B");
            }


        } else if( golesEquipoA > golesEquipoB) {
            System.out.println("Equipo ganador: Equipo A");
        } else {
            System.out.println("Equipo ganador: Equipo B");
        }

        System.out.println();

    }
}