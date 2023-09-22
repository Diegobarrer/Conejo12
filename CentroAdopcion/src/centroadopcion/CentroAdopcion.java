
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
    
        System.out.println("La edad del gato es: "+gato1.edad);
        System.out.println("el peso del gato es: "+gato1.peso);
        System.out.println("el id del gato es: "+ gato1.id);
        System.out.println("El nombre del gato es: "+gato1.nombre+"\n");
        
        Conejo conejo1= new Conejo();
        conejo1.edad= 2;
        conejo1.peso= 22;
        conejo1.id=1234;
        conejo1.nombre= ("Bunny");
        
         System.out.println("La edad del conejo es: "+conejo1.edad);
        System.out.println("el peso del conejo es: "+conejo1.peso);
        System.out.println("el id del conejo es: "+ conejo1.id);
        System.out.println("El nombre del conejo es: "+conejo1.nombre+"\n");
        
        Loro loro1= new Loro();
        loro1.edad=5;
        loro1.peso=4;
        loro1.id=1345;
        loro1.nombre= ("Lorenzo");
        
        System.out.println("La edad del conejo es: "+loro1.edad);
        System.out.println("el peso del conejo es: "+loro1.peso);
        System.out.println("el id del conejo es: "+ loro1.id);
        System.out.println("El nombre del conejo es: "+loro1.nombre+"\n");
    }
    
    
}
