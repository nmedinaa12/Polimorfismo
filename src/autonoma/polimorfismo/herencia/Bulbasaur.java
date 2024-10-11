/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polimorfismo.herencia;

import autonoma.polimorfismo.interfaces.PokemonPlanta;
import autonoma.polimorfismo.models.Pokemon;

/**
 *
 * @author nmedi
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    public Bulbasaur() {
        super(1, "Bulbasaur", 6.9, "Primera Temporada");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy " + nombre + " y estoy atacando con Paralizar.");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy " + nombre + " y estoy atacando con Drenaje.");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy " + nombre + " y estoy atacando con Hoja Afilada.");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy " + nombre + " y estoy atacando con Látigo Cepa.");
    }
}
