/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polimorfismo.herencia;

import autonoma.polimorfismo.interfaces.PokemonFuego;
import autonoma.polimorfismo.models.Pokemon;




/**
 *
 * @author nmedi
 */
public class Charmander extends Pokemon implements PokemonFuego {
    public Charmander() {
        super(4, "Charmander", 8.5, "Primera Temporada");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy " + nombre + " y estoy atacando con Puño Fuego.");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy " + nombre + " y estoy atacando con Ascuas.");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy " + nombre + " y estoy atacando con Lanzallamas.");
    }
}
