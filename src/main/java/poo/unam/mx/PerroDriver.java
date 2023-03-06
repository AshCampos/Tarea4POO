
package poo.unam.mx;

public class PerroDriver {
    public static void main(String[] args) {
        Perro dog = new Perro ("chihuahua" , "Copito" );
        
        System.out.println(dog.jugar());
        System.out.println(dog.comer());
        System.out.println(dog.dormir());
        System.out.println(dog.ladrar());
        System.out.println(dog.correr());
        System.out.println("color:");
        System.out.println(dog.getColor());
        System.out.println("edad:");
        System.out.println(dog.getEdad());
        System.out.println("tamaño");
        System.out.println(dog.getTamanio());
        System.out.println(dog);
        
        
    }
}
