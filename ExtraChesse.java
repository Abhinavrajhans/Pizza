package pizza;

public class ExtraChesse extends ToppingDecorator{
	
	BasePizza basepizza;
	
	public ExtraChesse(BasePizza basepizza)
	{
		this.basepizza=basepizza;
	}
	@Override
	public int cost()
	{
		return this.basepizza.cost()+30;
	}
}


