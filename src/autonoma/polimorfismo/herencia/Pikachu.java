/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polimorfismo.herencia;

import autonoma.polimorfismo.interfaces.PokemonElectrico;
import autonoma.polimorfismo.models.Pokemon;


/**
 *
 * @author nmedi
 */
public class Pikachu extends Pokemon implements PokemonElectrico {
    public Pikachu() {
        super(25, "Pikachu", 6.0, "Primera Temporada");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy " + nombre + " y estoy atacando con Impactrueno.");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy " + nombre + " y estoy atacando con Puño Trueno.");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy " + nombre + " y estoy atacando con Rayo.");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy " + nombre + " y estoy atacando con Rayo Carga.");
    }
}
