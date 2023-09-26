/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroadopcion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Diego
 */
public class Centro extends Mascota{
    private List<Mascota> animalesDisponibles;
    public Centro() {
        animalesDisponibles= new ArrayList<>();
    }
    public void agregarAnimal(Mascota animal){
        animalesDisponibles.add(animal);
    }
        public void listarAnimal(){
            System.out.println("Animales Disponibles");
            for (Mascota animal : animalesDisponibles);
            System.out.println("El nombre del gato es :"+getNombre() +"la comida es "+ getComida() );
        }
   
    
}

