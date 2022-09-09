package lab8p2_rigobertobarahona;

import java.util.ArrayList;

public class Universos {
    private String name;
    private ArrayList<Seres> habitantes;

    public Universos() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Seres> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Seres> habitantes) {
        this.habitantes = habitantes;
    }

    public Universos(String name, ArrayList<Seres> habitantes) {
        this.name = name;
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Universos{" + "name=" + name + ", habitantes=" + habitantes + '}';
    }
    
    
    
}
