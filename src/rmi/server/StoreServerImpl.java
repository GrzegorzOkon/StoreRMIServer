package rmi.server;

import java.rmi.RemoteException;

public class StoreServerImpl implements StoreServer {
    
	@Override
	public String orderItems(String order) throws RemoteException {

		return "Zamówione";
	}
}
