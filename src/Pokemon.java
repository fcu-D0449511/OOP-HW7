
public class Pokemon {

	private String name ;
	private PokemonType pokemontype ;
	private int cp ;
	
	public Pokemon(String a ,PokemonType c, int b )
	{
		this.name=a;
		this.cp=b;
		this.pokemontype=c;
	}
	public String getName()
	{
		return name ;
	}
	public PokemonType getPokemonType()
	{
		return pokemontype ;
	}
	public int getCp()
	{
		return cp ; 
	}
	public void setCp(int cp)
	{
		this.cp = cp ;
	}
	public abstract class Attack
	{
		public abstract void attack();
	}
	
	
	
	
	
	
	
	
	
}
