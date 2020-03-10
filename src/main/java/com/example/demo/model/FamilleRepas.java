package com.example.demo.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Table_Famille_Repas")
public class FamilleRepas {
	@Id
	@GeneratedValue
	private int id_famille_repas;
	private LibelleFamilleRepas libelle;
	private boolean actif;

	@OneToMany(mappedBy = "familleRepas")
	private Collection<Produit> produit;
	
	@ManyToMany(mappedBy = "familleRepas")
	private Collection<Repas> repas; 

	

	public FamilleRepas() {

	}

	public int getId_famille_repas() {
		return id_famille_repas;
	}

	public void setId_famille_repas(int id_famille_repas) {
		this.id_famille_repas = id_famille_repas;
	}

	public LibelleFamilleRepas getLibelle() {
		return libelle;
	}

	public void setLibelle(LibelleFamilleRepas libelle) {
		this.libelle = libelle;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public Collection<Produit> getProduit() {
		return produit;
	}

	public void setProduit(Collection<Produit> produit) {
		this.produit = produit;
	}

	public Collection<Repas> getRepas() {
		return repas;
	}

	public void setRepas(Collection<Repas> repas) {
		this.repas = repas;
	}
	
	

}
