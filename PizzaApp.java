package pizzaApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;

public class PizzaApp {
	
	public int[] myNum = {10,20,30,40};
	private String[] pizza = {"Cheese", "Pepperoni","Onions"};
	private String[] drinks = {"Coke","Sprite","Diet Coke","Water", "Iced Tea", "Selzer"};

	ArrayList<String> miniPizza = new ArrayList<String>();
	public static String myOut1;
	public static String thepizza = "";
	public static String theminiPizza = "";
	public static String myFullList = "";
	public static String listLen = "";
	
	public String myAddit (String greet, double cost, double tax) {
		String myGreet = greet;
		double price = cost;
		double sales_tax = tax;
		double myTax = price * sales_tax;
		double sum = price + myTax;
		return myGreet + " : " + sum;
	}
	
	public String arrayDemo() {
		int ilength = pizza.length;
		String mypizzas = "";
		
		for (int i=0; i<ilength; i++) {
			myOut1= pizza[i];
			mypizzas = mypizzas + " " + myOut1;
		}
		return mypizzas;
	}
	
	public String arrayListDemo() {
		
		String myList = "";
		String fullList = "";
		int iCount = 0;
		
		ArrayList<String> thesize = new ArrayList<String>();
		
		thesize.add("small");
		thesize.add("medium");
		thesize.add("large");
		thesize.add("X-Large");
		Iterator<String> itr = thesize.iterator();
		
		while(itr.hasNext()) {
			myList = itr.next();
			fullList += myList + " ";
			iCount ++;
			
		}
	
	if (iCount<5) {
		listLen = "The menu list is short.";
	}
	else if (iCount>5) {
		listLen= "The menu list is long.";
	}
	else {
		listLen = "The menu list is medium length.";
	}
	
	int i2=5;
	do {
		System.out.println("Enjoy drink: " + drinks[i2]);
		i2--;
	}while(i2>1);
	
		int num= 0;
		switch(num+1) {
			case 1:
				System.out.println("\nSpecial drink of Monday is: " + drinks[num]);
			case 2:
				System.out.println("\nSpecial drink of Tuesday is: " + drinks[num+1]);
			case 3:
				System.out.println("\nSpecial drink of Wednesday is: " + drinks[num+2]);
			case 4:
				System.out.println("\nSpecial drink of Thursday is: " + drinks[num+3]);
			case 5:
				System.out.println("\nSpecial drink of Friday is: " + drinks[num+4]);
			case 6:
				System.out.println("\nSpecial drink of any day is: " + drinks[num+5]);
			default:
				System.out.println("Value is: " + drinks[num+3]);
		}
	myFullList = fullList;
	return fullList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		Date baseDt = new Date();
		String totPrice="";
		
		try {
			baseDt = new SimpleDateFormat("yyyyMMdd").parse("20201005");
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Incorrect date format. Make sure the input has numbers");
		}
		System.out.println("Greetings, here are the highlights for today " + dt);
		System.out.println("We will be celebrating our anniversary on: "+ baseDt);
		
		PizzaApp myPizza= new PizzaApp();
		System.out.println(totPrice);
		
		thepizza = myPizza.arrayDemo();
		System.out.println("The pizzas are:" + thepizza);
		theminiPizza = myPizza.arrayListDemo();
		System.out.println("\nThe pizza sizes: " + myFullList + "\n");
		
		System.out.println("small pizza: " + myPizza.myAddit (" total price with one topping", 10, 0.6));
		System.out.println("medium pizza: " + myPizza.myAddit(" total price with one topping", 14, 0.6));
		System.out.println("large pizza: " + myPizza.myAddit(" total price with one topping", 16, 0.6));
		System.out.println("X-Large pizza: " + myPizza.myAddit(" total price with one topping", 18, 0.6));
		
		
		Calzone myCalzoni = new Calzone();
		String calsizes = "";
		String calCheeses = "";
		
		String myitem = myCalzoni.itemName;
		System.out.println("\n" + myitem);
		
		calsizes = myCalzoni.calzoneSize();
		System.out.println("\nCalzone sizes: " + calsizes + "inches.");
		
		calCheeses = myCalzoni.getCalCheeses();
		System.out.println("\nCalzone cheeses: " + calCheeses + "\n");
		
		System.out.println("Calzone prices: ");
		System.out.println("4 inch Calzone: " + myCalzoni.myAddit(" total price: ", 5.50, 0.06));
		System.out.println("6 inch Calzone: " + myCalzoni.myAddit(" total price: ", 8, 0.06));
		System.out.println("10 inch Calzone: " + myCalzoni.myAddit(" total price: ", 10.50, 0.06));
	}

}
