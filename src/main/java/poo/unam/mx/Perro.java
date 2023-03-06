package poo.unam.mx;

import java.awt.Color;
import java.util.Scanner;

public class Perro {

    private String raza;
    private byte edad;
    private String nombre;
    private Color color;
    private float tamanio;

    public Perro() {
         
        
    }

    public Perro(String raza, byte edad, String nombre, Color color, float tamanio) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
    }

   

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", edad=" + edad + ", nombre=" + nombre + ", color=" + color + ", tamanio=" + tamanio + '}';
    }

    public boolean jugar() {
        System.out.println(nombre + " esta jugando");
        boolean resultado = Math.random() > 0.51;

        return resultado;

    }

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    

    public boolean dormir() {
        System.out.println(nombre + " duerme: ");
        boolean resultado = Math.random() > 0.50;
        return resultado;
    }

    public boolean ladrar() {
        System.out.println(nombre + " ¿esta ladrando? ");
        boolean ladrido = Math.random() > 0.50;
        return ladrido;
    }

    public String comer() {
        System.out.println("Ingresa la comida del perro: ");
        Scanner in = new Scanner(System.in);
        String teclado = in.nextLine();
        String alimento = teclado;
        System.out.print(nombre + " come ");
        return alimento;
    }
    public boolean correr(){
        System.out.println(nombre + " ¿esta corriendo?");
        boolean corriendo = Math.random() > 0.50;
        return corriendo;
    }
   
}
