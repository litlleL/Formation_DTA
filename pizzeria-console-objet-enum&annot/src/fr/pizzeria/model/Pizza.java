package fr.pizzeria.model;

import fr.pizzeria.enumeration.CategoriePizza;

public class Pizza {
	
	private int id;
	private String code;
	private String nom;
	private double prix;
	private static int nbPizzas;
	private CategoriePizza categoriePizza;
	
	public CategoriePizza getCategoriePizza() {
		return categoriePizza;
	}

	public void setCategoriePizza(CategoriePizza categoriePizza) {
		this.categoriePizza = categoriePizza;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public static int getNbPizzas() {
		return nbPizzas;
	}

	public static void setNbPizzas(int nbPizzas) {
		Pizza.nbPizzas = nbPizzas;
	}

	public Pizza(int id, String code, String nom, double prix, CategoriePizza categoriePizza){
		super();
		this.id = nbPizzas;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.categoriePizza=categoriePizza;
	}
	
	public Pizza(String code, String nom, double prix, CategoriePizza categoriePizza){
		super();
		this.id = nbPizzas;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.categoriePizza=categoriePizza;
		nbPizzas+=1;
	}
	
	public Pizza() {
		super();
	}
	
	@Override
	public String toString() {
		return "Pizza [id=" + (id + 1) + ", code=" + code + ", nom=" + nom + ", prix=" + prix + "]";
	}
	
}
