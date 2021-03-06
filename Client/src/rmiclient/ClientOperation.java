package rmiclient;

import java.io.File;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import com.itextpdf.text.DocumentException;
import rmiinterface.RMIInterface;

public class ClientOperation {

    private static RMIInterface look_up;

    public static void main(String[] args)
            throws IOException, NotBoundException, DocumentException {

        look_up = (RMIInterface) Naming.lookup("//85.187.158.121:1099/MyServer");
        String ruta = JOptionPane.showInputDialog("Que ruta mostrar");

        // Crear objeto de GeneratePDF
        GeneratePDF pdf = new GeneratePDF();

        //String response = look_up.helloTo(txt);
        ArrayList<String> response = look_up.obtenerArchivos(ruta);
        pdf.crearPDF(new File("reporte.pdf"), response, ruta);
        Iterator<String> Iterator = response.iterator();

        while(Iterator.hasNext()){
            String elemento = Iterator.next();
            System.out.println(elemento);
        }
    }
}
