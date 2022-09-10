package lab8p2_rigobertobarahona;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
     public void cargarArchivoS() {
        try {            
            seres = new ArrayList();
            Seres temp;
            if (archivoS.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivoS);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Seres) objeto.readObject()) != null) {
                        seres.add(temp);
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

    public void escribirArchivoS() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivoS);
            bw = new ObjectOutputStream(fw);
            for (Seres i : seres) {
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
