package a;

public class Maillon {

	private String data;
	private Maillon suivant;
	
	public Maillon()
	{
		
	}
	
	public Maillon(String data_inserer) {
		this.data = data_inserer;
		this.suivant = null;
	}
	
	public Maillon(String data_inserer, Maillon maillon_suivant) {
		this.data = data_inserer;
		this.suivant = maillon_suivant;
	}
	
	
	/*setter et getter*/
	
	public void setMaillonSuivant(Maillon m_suivant)
	{
		this.suivant = m_suivant;
	}
	public void setNombre(String data_a_placer)
	{
		this.data = data_a_placer;
	}
	
	
	public Maillon getMaillonSuivant()
	{
		return suivant;
	}
	
	public String getData()
	{
		return data;
	}
	
	
}
