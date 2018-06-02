package rmi.server;

import java.rmi.RemoteException;

import rmi.server.input.Order;

public class StoreServerImpl implements StoreServer {
    
	@Override
	public String orderItems(Order order) throws RemoteException {

		return "Dane zam�wienia to " + order.getIdentyfikatorKlienta() + ", " + order.getNazwaTowaru() + ", " 
				+ order.getIlo��Towaru() + ", " + order.getNumerRachunkuBankowegoKlienta();
	}
}
