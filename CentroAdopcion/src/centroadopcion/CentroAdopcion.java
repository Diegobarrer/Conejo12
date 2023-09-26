
package centroadopcion;

/**
 *
 * @author Juan Diego
 */
public class CentroAdopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gato gato1= new Gato();
    gato1.edad= 7;
    gato1.peso = 40;
    gato1.id = 1342;
    gato1.nombre= ("Michi");
    gato1.raza= ("Persa");
    gato1.comida= ("MaxCat");
    gato1.tipo= ("Terrestre");
    gato1.vacunado= true;
    
        System.out.println("La edad del gato es: "+gato1.edad+"\n"+ "el peso del gato es: "+gato1.peso+"\n"+ "el id es: "+gato1.id+"\n"+ "el nombre del gato es: "+gato1.nombre+"\n"+ "la raza del gato es: "+gato1.raza+"\n"+ "el tipo de comida para el gato es: "+gato1.comida+"\n"+ "el gato es de tipo "+gato1.tipo+"\n"+ "el gato esta vacunado? "+gato1.vacunado+ "\n");
        
        Conejo conejo1= new Conejo();
        conejo1.edad= 2;
        conejo1.peso= 22;
        conejo1.id=1234;
        conejo1.nombre= ("Bunny");
        conejo1.raza= ("Californiano");
        conejo1.comida= ("Verduras");
        conejo1.tipo= ("Terrestre");
        conejo1.vacunado= true;
        
        System.out.println("La edad del conejo es: "+conejo1.edad+"\n"+ "el peso del conejo es: "+conejo1.peso+"\n"+ "el id es: "+conejo1.id+"\n"+ "el nombre del conejo es: "+conejo1.nombre+"\n"+ "la raza del conejo es: "+conejo1.raza+"\n"+ "el tipo de comida para el conejo es: "+conejo1.comida+"\n"+ "el conejo es de tipo "+conejo1.tipo+"\n"+ "el loro esta vacunado? "+conejo1.vacunado+ "\n");
        
        Loro loro1= new Loro();
        loro1.edad=5;
        loro1.peso=4;
        loro1.id=1345;
        loro1.nombre= ("Lorenzo");
        loro1.raza= ("Barranquero");
        loro1.comida= ("Cemillas");
        loro1.tipo= ("Aereo");
        loro1.vacunado= true;
        
        System.out.println("La edad del loro es: "+loro1.edad+"\n"+ "el peso del loro es: "+loro1.peso+"\n"+ "el id es: "+loro1.id+"\n"+ "el nombre del loro es: "+loro1.nombre+"\n"+ "la raza del loro es: "+loro1.raza+"\n"+ "el tipo de comida para el loro es: "+loro1.comida+"\n"+ "el loro es de tipo "+loro1.tipo+"\n"+ "el loro esta vacunado? "+loro1.vacunado+ "\n");
        
        
    }
    
    
}
