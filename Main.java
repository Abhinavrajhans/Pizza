package pizza;

public class Main {
	public static void main(String[] args) {
		
		BasePizza pizza=new ExtraChesse(new VegDelight());
		
		System.out.println(pizza.cost());
		
		BasePizza pizza2=new Mushroom(new ExtraChesse(new Margherita()));
		
		System.out.println(pizza2.cost());
	}

}
