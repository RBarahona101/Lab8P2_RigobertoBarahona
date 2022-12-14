package lab8p2_rigobertobarahona;

import java.util.ArrayList;
import java.io.Serializable;

public class Universos implements Serializable {
    private String name;
    private ArrayList<Seres> habitantes;
    
    private static final long SerialVersionUID=819;
    
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

    public Universos(String name) {
        this.name = name;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
