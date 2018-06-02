package rmi.server.input;

import java.io.Serializable;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	private int identyfikatorKlienta;
	private String nazwaTowaru;
	private int iloœæTowaru;
	private int numerRachunkuBankowegoKlienta;
	
	public Order(int identyfikatorKlienta, String nazwaTowaru, int iloœæTowaru, int numerRachunkuBankowegoKlienta) {
		this.identyfikatorKlienta = identyfikatorKlienta;
		this.nazwaTowaru = nazwaTowaru;
		this.iloœæTowaru = iloœæTowaru;
		this.numerRachunkuBankowegoKlienta = numerRachunkuBankowegoKlienta;
	}
	
	public int getIdentyfikatorKlienta() {
		return identyfikatorKlienta;
	}
	
	public void setIdentyfikatorKlienta(int identyfikatorKlienta) {
		this.identyfikatorKlienta = identyfikatorKlienta;
	}
	
	public String getNazwaTowaru() {
		return nazwaTowaru;
	}

	public void setNazwaTowaru(String nazwaTowaru) {
		this.nazwaTowaru = nazwaTowaru;
	}

	public int getIloœæTowaru() {
		return iloœæTowaru;
	}

	public void setIloœæTowaru(int iloœæTowaru) {
		this.iloœæTowaru = iloœæTowaru;
	}

	public int getNumerRachunkuBankowegoKlienta() {
		return numerRachunkuBankowegoKlienta;
	}

	public void setNumerRachunkuBankowegoKlienta(int numerRachunkuBankowegoKlienta) {
		this.numerRachunkuBankowegoKlienta = numerRachunkuBankowegoKlienta;
	}
}