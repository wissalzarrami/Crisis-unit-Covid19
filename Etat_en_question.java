
public class Etat_en_question {
	private boolean etat_normal;
	private boolean etat_de_panique;

	public Etat_en_question () {}

	public Etat_en_question ( boolean etat_normal, boolean etat_de_panique)
	{
		this.etat_normal=etat_normal;
		this.etat_de_panique=etat_de_panique;
	}

	public boolean getetat_normal() {
		return etat_normal;}
	public void setetat_normal(boolean etat_normal) {
		this.etat_normal = etat_normal;}


	public boolean getetat_de_panique() {
		return etat_de_panique;}
	public void setetat_de_panique(boolean etat_de_panique) {
		this.etat_de_panique = etat_de_panique;}


}

