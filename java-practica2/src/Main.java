import logica.VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practica de java 2");

        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();

        VideoJuego juego1 = new VideoJuego(101,"Baldur's gate", "PC", 4, "Rol");
        VideoJuego juego2 = new VideoJuego(200,"Counter strike", "PC", 20, "Shooter");
        VideoJuego juego3 = new VideoJuego(234,"Spiderman", "PS4", 2, "Aventura");
        VideoJuego juego4 = new VideoJuego(167,"Grounded", "XBOXONE", 4, "Supervivencia");
        VideoJuego juego5 = new VideoJuego(356,"Resident Evil 7", "PC", 1, "Survival Horror");

        listaVideojuegos.add(juego1);
        listaVideojuegos.add(juego2);
        listaVideojuegos.add(juego3);
        listaVideojuegos.add(juego4);
        listaVideojuegos.add(juego5);

        //forEach
        //Por cada videojuego de la lista de videojuegos ->>
        for (VideoJuego juego : listaVideojuegos){
            System.out.println("Titulo: " + juego.getTitulo() +
                    " de la consola " + juego.getConsola() +
                    " soporta hasta " + juego.getCantJugadores() + " jugadores");
        }

        juego2.setTitulo("Counter Strike Source");
        juego2.setCantJugadores(32);

        juego3.setTitulo("Spiderman-2");
        juego3.setCantJugadores(1);

        System.out.println("Los juegos de PC son:");
        for (VideoJuego juego : listaVideojuegos){
            if(juego.getConsola().equals("PC")){
                System.out.println(juego.toString());
            }
        }
    }
}