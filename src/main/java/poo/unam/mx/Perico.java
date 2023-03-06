package poo.unam.mx;

import java.awt.Color;
//import static java.lang.System.in;
import java.util.Scanner;

public class Perico {

    private Color color;
    private String especie;
    private String nombre;
    private byte edad;
    private float tamanio;

    public Perico() {
    }

    public Perico(Color color, String especie, String nombre, byte edad, float tamanio) {
        this.color = color;
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public Perico(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perico{" + "color=" + color + ", especie=" + especie + ", nombre=" + nombre + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }

    public String comer() {
        System.out.println("Ingresa la comida del perico: ");
        Scanner in = new Scanner(System.in);
        String teclado = in.nextLine();
        String comida = teclado;
        System.out.print(nombre + " come ");
        return comida;
    }
    public boolean hablar(){
        System.out.println(nombre + " ¿habla? ");
        boolean palabra = Math.random() > 0.50;
        return palabra;
    }
    public boolean volar(){
        System.out.println(nombre + " ¿vuela?");
        
        boolean alas = (Math.random()*10+1) < 7;
                return alas;
    }
    public boolean cantar(){
        System.out.println(nombre + " ¿canta?");
        boolean canto = (Math.random()*10+1) < 7;
        return canto;
    
    }
        
}


        