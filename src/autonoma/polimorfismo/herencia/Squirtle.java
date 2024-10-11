/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polimorfismo.herencia;

import autonoma.polimorfismo.interfaces.PokemonAgua;
import autonoma.polimorfismo.models.Pokemon;

/**
 *
 * @author nmedi
 */
public class Squirtle extends Pokemon implements PokemonAgua {
    public Squirtle() {
        super(7, "Squirtle", 9.0, "Primera Temporada");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy " + nombre + " y estoy atacando con Hidrobomba.");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy " + nombre + " y estoy atacando con Pistola Agua.");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy " + nombre + " y estoy atacando con Burbuja.");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy " + nombre + " y estoy atacando con Hidropulso.");
    }
}
