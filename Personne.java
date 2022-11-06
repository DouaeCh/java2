package net.TP3.java;

public class Personne {
	
	 String nom;
	 String prenom;
	 byte    age;
	 static short  nbPersonne=0;
	 static final String nomDev="Douae"; //on peut l'inistialiser avec un bloc static
	/* 
	 static{
	 nbPersonne=0;
	 nomDev="Douae";
	 }
	 */
	
	public Personne(String nom, String ptrnom, byte age) {
		
		this.nom = nom;
		this.prenom = ptrnom;
		this.age = age;
		nbPersonne++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public static short getNbPersonne() {
		return nbPersonne;
	}

	public static String getNomDev() {
		return nomDev;
	}
	
	public void getpersonne() {
		
	
		System.out.println( nom + prenom);
		     
	}