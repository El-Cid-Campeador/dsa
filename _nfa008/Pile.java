package a;

public class Pile {
	private Maillon debut = null;
//	private Maillon fin = null;
	
	
	public boolean est_vide()
	{
		
		return debut == null;
	}
	
	
	public Pile(){}
	
	public void affiche()
	{
		Maillon m = debut;
		while(m != null)
		{
			System.out.print(m.getData()+"->");
			m = m.getMaillonSuivant();
		}
		System.out.println();
	}
	
	
	/*inserer debut est equivaut � empiler*/
	
	public void empiler(String data)
	{
		if(debut ==null){
			debut = new Maillon(data);
	//		fin = debut;
		}else
		{
			Maillon maillon_inserer = new Maillon(data, debut);
			debut = maillon_inserer;
		}
	}
	
	
	/*depiler est equivaut � supprimer debut */
	
	public String depiler()
	{
		String resultat =null;
		
		if(debut != null)
		{
			if(debut.getMaillonSuivant() == null)
			{
				resultat = debut.getData();
				debut = null;
		//		fin = null;

			}else
			{
				 resultat = debut.getData();
				debut = debut.getMaillonSuivant();
			
			}
		}
		return resultat;
	} 
	
	public String tete_pile()
	{
		if(debut != null)
			return debut.getData();
		else return null;
	}
}
