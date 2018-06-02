package rmi.server;

import java.rmi.RemoteException;
import java.util.HashMap;

import rmi.server.input.Order;
import rmi.server.output.Bill;

public class StoreServerImpl implements StoreServer {
    private HashMap<String, Integer> aktualnaIloœæTowaru = new HashMap<>();
	
	public StoreServerImpl() {
		aktualnaIloœæTowaru.put("telewizor", 8);
		aktualnaIloœæTowaru.put("pralka", 3);
		aktualnaIloœæTowaru.put("lodówka", 12);
	}

	@Override
	public synchronized Bill orderItems(Order order) throws RemoteException {
		if (aktualnaIloœæTowaru.get(order.getNazwaTowaru()) >= order.getIloœæTowaru()) {
			aktualnaIloœæTowaru.put(order.getNazwaTowaru(), aktualnaIloœæTowaru.get(order.getNazwaTowaru()) - order.getIloœæTowaru());
			
			return new Bill(order.getIdentyfikatorKlienta(), order.getNazwaTowaru(), order.getIloœæTowaru(), 
					order.getNumerRachunkuBankowegoKlienta(), "11222233334444555566667777");
		} else {
			return null;
		}
	}
}
