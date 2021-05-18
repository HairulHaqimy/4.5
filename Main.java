public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Fruit Shop.");
		System.out.println();
		
		Apple obj1 = new Apple("Apple", 3.99);
		System.out.println(obj1);
		System.out.println();
		
		RedApple obj2 = new RedApple("Red Apple", 3.50, "Bright red", "Sweet");
		System.out.println(obj2);
		System.out.println();
		
		GreenApple obj3 = new GreenApple("Green Apple",  4.99, "Bright green", "Sour");
		System.out.println(obj3);
		System.out.println();
		
		Mango obj4 = new Mango("Mango", 200, 0.0657, 0.15);
		System.out.println(obj4);
		System.out.println();
		
		Durian obj5 = new Durian("Durian", 250, 2.35, 0.22);
		System.out.println(obj5);
		System.out.println();
	}

}