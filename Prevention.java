

public class Prevention {
	Personne p;
	
	//préciser l'état de la personne//
	Etat_en_question e;
	
	public Prevention () {}
	public Prevention (Personne p,Etat_en_question e)
	{
		this.e=e;
		this.p=p;
	}
	
	//fournir des conseils//
	public String  conseils () 
	{ java.lang.String text = "*Ne toussez pas et n’éternuez pas dans vos mains\r\n" + 
			"Couvrez votre bouche et votre nez avec votre coude ou un mouchoir en papier lorsque vous toussez ou éternuez. Jetez immédiatement le mouchoir."
			+ "**Conservez une distance d’au moins un mètre (trois pieds) avec les personnes qui toussent ou éternuent."
			+ "***Lavez-vous les mains, encore et encore"
			+ "****Respectez les instructions figurant sur le produit de nettoyage pour une utilisation sûre et efficace, notamment les précautions à prendre lorsque vous appliquez le produit, par exemple, porter des gants ou veiller à une bonne ventilation."
			+ "*****Ne vous touchez pas le visage\r\n" + 
			"Évitez de vous toucher les yeux, le nez et la bouche.";
				return (text);
		
	}
	//fournir l'accès pour contacter un psy//
	public void demande_psy (Personne p)
	{   
		Medecin m=new Medecin();
		if (p.getAdresse()== m.getAdresse())
			m.afficher(); }
		
	}
	
