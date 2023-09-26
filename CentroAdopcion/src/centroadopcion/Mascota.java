/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroadopcion;

/**
 *
 * @author Juan Diego
 */
public class Mascota {
    int edad,peso,id;
    String nombre,raza,comida,tipo;
    boolean vacunado;
    
    public Mascota(){
        
    }

    public Mascota(int edad, int peso, int id, String nombre, String raza, String comida, String tipo, boolean vacunado) {
        this.edad = edad;
        this.peso = peso;
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.comida = comida;
        this.tipo = tipo;
        this.vacunado = vacunado;
    }
    
    
        
        public int getEdad(){
            return edad;
        }
        
        public int getPeso(){
            return peso;
        }
        
        public int getId(){
            return id;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public String getRaza(){
            return raza;
        }
        
        public String getComida(){
            return comida;
        }
        
        public String getTipo(){
            return tipo;
        }
        
        public boolean getVacunado(){
            return vacunado;
        }
    
}
