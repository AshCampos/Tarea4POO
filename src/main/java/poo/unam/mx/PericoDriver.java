
package poo.unam.mx;


public class PericoDriver {
    public static void main(String[] args) {
        Perico parakeet = new Perico ("australiano", "Randal");
        System.out.println(parakeet.cantar());
        System.out.println(parakeet.comer());
        System.out.println("edad");
        System.out.println(parakeet.getEdad());
        System.out.println(parakeet.hablar());
        System.out.println(parakeet.volar());
        System.out.println("color");
        System.out.println(parakeet.getColor());
        System.out.println("tamaño");
        System.out.println(parakeet.getTamanio());
        System.out.println(parakeet);
        
    }
}
