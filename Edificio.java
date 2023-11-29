public class Edificio {
    public static void main(String[] args) {
        final String VENTANA_CERRADA_APAGADA = "[|]";
        final String VENTANA_CERRADA_PRENDIDA = "[|]";
        final String VENTANA_ABIERTA_APAGADA = "[º]";
        final String VENTANA_ABIERTA_PRENDIDA = "[*]";

        double probabilidadVentanaAbierta = 0.7;
        double probabilidadLuzEncendida = 0.6;

        boolean ventanaAbierta = Math.random() < probabilidadVentanaAbierta;

        boolean luzEncendida = Math.random() < probabilidadLuzEncendida;

        String estadoVentana;
        String estadoLuz;

        if (ventanaAbierta) {
            estadoVentana = luzEncendida ? VENTANA_ABIERTA_PRENDIDA : VENTANA_ABIERTA_APAGADA;
        } else {
            estadoVentana = luzEncendida ? VENTANA_CERRADA_PRENDIDA : VENTANA_CERRADA_APAGADA;
        }

        System.out.println("Estado del edificio:");
        System.out.println("Ventana: " + estadoVentana);
        System.out.println("Luz: " + (luzEncendida ? "Encendida" : "Apagada"));
    }
}


    