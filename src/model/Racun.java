package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Racun {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRacun;
	@OneToOne
	private User user;
	@OneToMany
	private List<Destinacija> listaDestinacija = new ArrayList<Destinacija>();
	@OneToOne
	private Transport transport;
	private double cenaTransporta;
	private double cenaSmestaja;
	private double total;
	
	
	public Integer getIdRacun() {
		return idRacun;
	}
	public void setIdRacun(Integer idRacun) {
		this.idRacun = idRacun;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Destinacija> getListaDestinacija() {
		return listaDestinacija;
	}
	public void setListaDestinacija(List<Destinacija> listaDestinacija) {
		this.listaDestinacija = listaDestinacija;
	}
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	public double getCenaTransporta() {
		return cenaTransporta;
	}
	public void setCenaTransporta(double cenaTransporta) {
		this.cenaTransporta = cenaTransporta;
	}
	public double getCenaSmestaja() {
		return cenaSmestaja;
	}
	public void setCenaSmestaja(double cenaSmestaja) {
		this.cenaSmestaja = cenaSmestaja;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
