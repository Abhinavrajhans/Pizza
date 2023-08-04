package pizza;

public class Mushroom extends ToppingDecorator{
	
	BasePizza basepizza;
	
	public Mushroom(BasePizza basepizza)
	{
		this.basepizza=basepizza;
	}
	public int cost()
	{
		return this.basepizza.cost()+50;
	}
}
