package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StoreServer extends Remote {
    public String orderItems(String order) throws RemoteException;
}
