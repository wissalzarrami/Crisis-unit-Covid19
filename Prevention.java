

public class Prevention {
	Personne p;
	
	//pr�ciser l'�tat de la personne//
	Etat_en_question e;
	
	public Prevention () {}
	public Prevention (Personne p,Etat_en_question e)
	{
		this.e=e;
		this.p=p;
	}
	
	//fournir des conseils//
	public String  conseils () 
	{ java.lang.String text = "*Ne toussez pas et n��ternuez pas dans vos mains\r\n" + 
			"Couvrez votre bouche et votre nez avec votre coude ou un mouchoir en papier lorsque vous toussez ou �ternuez. Jetez imm�diatement le mouchoir."
			+ "**Conservez une distance d�au moins un m�tre (trois pieds) avec les personnes qui toussent ou �ternuent."
			+ "***Lavez-vous les mains, encore et encore"
			+ "****Respectez les instructions figurant sur le produit de nettoyage pour une utilisation s�re et efficace, notamment les pr�cautions � prendre lorsque vous appliquez le produit, par exemple, porter des gants ou veiller � une bonne ventilation."
			+ "*****Ne vous touchez pas le visage\r\n" + 
			"�vitez de vous toucher les yeux, le nez et la bouche.";
				return (text);
		
	}
	//fournir l'acc�s pour contacter un psy//
	public void demande_psy (Personne p)
	{   
		Medecin m=new Medecin();
		if (p.getAdresse()== m.getAdresse())
			m.afficher(); }
		
	}
	
