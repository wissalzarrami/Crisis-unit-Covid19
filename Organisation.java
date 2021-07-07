import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Organisation {
	  protected static String nom;
	  protected String adresse_org;
	  protected int numero_tel;
      protected boolean disponibilit�;
      protected String adresse_personne;
      static int nbr_organisation ;
      
      public Organisation() {
    	  nbr_organisation++;	
	      try{
	    	   File f=new File("C://Users/lenovo/eclipse-workspace/Projet de programmation/src/Organisation.txt");
	    	   FileWriter writer=new FileWriter(f,true);
	           BufferedWriter bw=new BufferedWriter(writer);
	           bw.write("Organisation N�"+nbr_organisation+"\t");
	           Scanner sc = new Scanner(System.in);
	           System.out.println("Veuillez saisir la disponibilit� de l'organisation � cet instant :");
	           String disp = sc.next();
	           bw.write(disp+"\t\t\t");
	           if(disp=="disponible")
	               this.disponibilit�=true;
	           else 
	        	   this.disponibilit�=false;
	           System.out.println("Veuillez saisir le num�ro de l'organisation :");
	           int num = sc.nextInt();
	           bw.write(num+"\t\t\t");
	           this.numero_tel=num;
	           System.out.println("Veuillez saisir l'adresse de la personne :");
	           String adr = sc.next();
	           bw.write(adr+"\n");
	           this.adresse_personne=adr;
	           bw.close();
	           writer.close();
	         }
	       catch (IOException e){e.printStackTrace();}}
   
      
       public Organisation(String nom,int numero_tel, boolean disponibilit�, String adresse_personne) {
		this.nom=nom;
    	this.numero_tel = numero_tel;
		this.disponibilit� = disponibilit�;
		this.adresse_personne = adresse_personne;
		nbr_organisation++;
	
	}
       
       //les Getters et  les Setters//
      public static String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
    public String getadresse_org() {
		return adresse_org;
	}
	public void setadresse_org(String adresse_org) {
		this.adresse_org = adresse_org;
	}
	
	
	
	public int getNumero_tel() {
		return numero_tel;
	}
	public void setNumero_tel(int numero_tel) {
		this.numero_tel = numero_tel;
	}
	
	public int getNumero_Tel() {
		return numero_tel;
	}

	public void setNumero_Tel(int numero) {
		this.numero_tel = numero;
	}

	public boolean getDisponibilit�() {
		return disponibilit�;
	}

	public void setDisponibilit�(boolean disponibilit�) {
		this.disponibilit� = disponibilit�;
	}

	public String getAdresse_personne() {
		return adresse_personne;
	}

	public void setAdresse_personne(String adresse_personne) {
		this.adresse_personne = adresse_personne;
	}
	public static int getNbr_organisation() {
		return nbr_organisation;
	}
	public static void setNbr_ambulance(int nbr_organisation) {
		Organisation.nbr_organisation = nbr_organisation;
	}

}