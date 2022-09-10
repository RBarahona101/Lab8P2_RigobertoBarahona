package lab8p2_rigobertobarahona;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminSeres {
    ArrayList<Seres> seres = new ArrayList();
    private File archivoS = null;

    public adminSeres() {
    }
    
    
    
    public adminSeres(String path) {
        archivoS = new File(path);
    }

    public ArrayList<Seres> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<Seres> seres) {
        this.seres = seres;
    }

    public File getArchivoS() {
        return archivoS;
    }

    public void setArchivoS(File archivoS) {
        this.archivoS = archivoS;
    }

    
}
