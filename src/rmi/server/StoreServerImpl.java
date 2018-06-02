package rmi.server;

import java.rmi.RemoteException;
import java.util.HashMap;

import rmi.server.input.Order;
import rmi.server.output.Bill;
import rmi.server.output.NotEnoughItemsException;

public class StoreServerImpl implements StoreServer {
    private HashMap<String, Integer> aktualnaIlo��Towaru = new HashMap<>();
	
	public StoreServerImpl() {
		aktualnaIlo��Towaru.put("telewizor", 8);
		aktualnaIlo��Towaru.put("pralka", 3);
		aktualnaIlo��Towaru.put("lod�wka", 12);
	}

	@Override
	public synchronized Bill orderItems(Order order) throws RemoteException, NotEnoughItemsException {
		if (aktualnaIlo��Towaru.get(order.getNazwaTowaru()) >= order.getIlo��Towaru()) {
			aktualnaIlo��Towaru.put(order.getNazwaTowaru(), aktualnaIlo��Towaru.get(order.getNazwaTowaru()) - order.getIlo��Towaru());
			
			return new Bill(order.getIdentyfikatorKlienta(), order.getNazwaTowaru(), order.getIlo��Towaru(), 
					order.getNumerRachunkuBankowegoKlienta(), "11222233334444555566667777");
		} else {
			throw new NotEnoughItemsException("Brak wystarczaj�cej ilo�ci towaru: " + order.getNazwaTowaru());
		}
	}
}
