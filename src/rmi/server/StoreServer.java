package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import rmi.server.input.Order;

public interface StoreServer extends Remote {
    public String orderItems(Order order) throws RemoteException;
}
