package a;

public class Liste {
	
	
	private Maillon debut = null;
	private Maillon fin = null;
	
	public Liste() {
		
	}
	
	public boolean est_vide()
	{
		
		return debut == null;
	}
	
	public Maillon get_debut()
	{
		return debut;
	}
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
	
	public void inserer_debut(String data)
	{
		if(debut ==null){
			debut = new Maillon(data);
			fin = debut;
		}else
		{
			Maillon maillon_inserer = new Maillon(data, debut);
			debut = maillon_inserer;
		}
	}
	
	public void inserer_fin(String data)
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
	
	
	public void supprimer_debut()
	{
		if(debut != null)
		{
			if(debut.getMaillonSuivant() == null)
			{
				debut = null;
				fin = null;
			}else
			{
				debut = debut.getMaillonSuivant();
			}
		}
	} 
	

}
