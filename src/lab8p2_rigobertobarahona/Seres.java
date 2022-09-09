package lab8p2_rigobertobarahona;

import java.util.ArrayList;

public class Seres {
    String nombre;
    int ID;
    int Poder;
    int edad;
    String universe;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public Seres(String nombre, int ID, int Poder, int edad, String universe) {
        this.nombre = nombre;
        this.ID = ID;
        this.Poder = Poder;
        this.edad = edad;
        this.universe = universe;
    }

    @Override
    public String toString() {
        return "Seres{" + "nombre=" + nombre + ", ID=" + ID + ", Poder=" + Poder + ", edad=" + edad + ", universe=" + universe + '}';
    }
    
}
