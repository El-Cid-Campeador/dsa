package a;

public class File {
	private Maillon debut = null;
	private Maillon fin = null;
	
	public boolean est_vide()
	{
		
		return debut == null;
	}
	
	
	public File(){}
	
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
	
	
	/*inserer fin est equivaut � empiler*/
	
	public void enfiler(String data)
	{
		if(fin ==null){
			fin = new Maillon(data);
			debut = fin;
		}else
		{
			fin.setMaillonSuivant(new Maillon(data));
			fin = fin.getMaillonSuivant();
		}
	}
	
	
	/*depiler est equivaut � supprimer debut */
	
	public String defiler()
	{
		String resultat =null;
		
		if(debut != null)
		{
			if(debut.getMaillonSuivant() == null)
			{
				resultat = debut.getData();
				debut = null;
				fin = null;

			}else
			{
				 resultat = debut.getData();
				debut = debut.getMaillonSuivant();
				return resultat;
			}
		}
		return resultat;
	} 
}
