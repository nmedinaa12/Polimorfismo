/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polimorfismo.main;

import autonoma.polimorfismo.herencia.Squirtle;
import autonoma.polimorfismo.herencia.Bulbasaur;
import autonoma.polimorfismo.herencia.Charmander;
import autonoma.polimorfismo.herencia.Pikachu;

/**
 *
 * @author nmedi
 */
public class main {
    
    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();

        // Ataques de Charmander
        charmander.atacarAscuas();
        charmander.atacarPunioFuego();
        charmander.atacarLanzallamas();

        // Ataques de Bulbasaur
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarLatigoCepa();

        // Ataques de Squirtle
        squirtle.atacarHidrobomba();
        squirtle.atacarPistolaAgua();
        squirtle.atacarBurbuja();
        squirtle.atacarHidropulso();

        // Ataques de Pikachu
        pikachu.atacarImpactrueno();
        pikachu.atacarPunioTrueno();
        pikachu.atacarRayo();
        pikachu.atacarRayoCarga();

        // Ataques comunes
        charmander.atacarPlacaje();
        bulbasaur.atacarPlacaje();
        squirtle.atacarPlacaje();
        pikachu.atacarPlacaje();
    }
    
}
