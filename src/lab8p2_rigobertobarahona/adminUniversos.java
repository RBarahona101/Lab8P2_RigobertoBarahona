package lab8p2_rigobertobarahona;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminUniversos {
    ArrayList<Universos> universos = new ArrayList();
    private File archivoU = null;

    public adminUniversos(String path) {
        archivoU = new File(path);
    }
    public adminUniversos(){
        
    }
    public ArrayList<Universos> getUniversos() {
        return universos;
    }

    public void setUniversos(ArrayList<Universos> universos) {
        this.universos = universos;
    }

    public File getArchivoU() {
        return archivoU;
    }

    public void setArchivoU(File archivoU) {
        this.archivoU = archivoU;
    }
    public void cargarArchivoU() {
        try {            
            universos = new ArrayList();
            Universos temp;
            if (archivoU.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivoU);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Universos) objeto.readObject()) != null) {
                        universos.add(temp);
                    }
                } catch (EOFException e) {
                   
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivoU() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivoU);
            bw = new ObjectOutputStream(fw);
            for (Universos i : universos) {
                bw.writeObject(i);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
