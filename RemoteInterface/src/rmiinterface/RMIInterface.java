package rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RMIInterface extends Remote {
    public ArrayList<String> obtenerArchivos(String ruta) throws RemoteException;
}