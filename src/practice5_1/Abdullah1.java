package practice5_1;

import java.util.Scanner;

public class Abdullah1 {
	
	public static void main(String[] args) {
		
		Scanner aryan= new Scanner(System.in);
		
		
	System.out.println("Enter your store name");
	String storename= aryan.nextLine();
	System.out.println("Store name:" +storename);
	
	System.out.println("Carrot Qty");
	int vegitable1= aryan.nextInt();
	System.out.println("Carrot: "+vegitable1);
		
	System.out.println("Carrot price");
	double carrotPrice=aryan.nextDouble();
	double carrotsPrice=carrotPrice*vegitable1;
	System.out.println("totalPrice: "+carrotsPrice);
	
	System.out.println("TowelPaper Qty");	
	int homeStuff=aryan.nextInt();
	System.out.println("TowelPaper: "+homeStuff);
	
	System.out.println("Towel paper price");	
	double towelPaperPrice= aryan.nextDouble();	
	double towelPapersPrice=towelPaperPrice*homeStuff;
	System.out.println("totalPrice: "+towelPaperPrice);
		
	System.out.println("Potato Qty");
	int vegitable2=aryan.nextInt();
	System.out.println("Potato: "+vegitable2);
	
	System.out.println("Potato Price");
	double potatoesPrice=aryan.nextDouble();
	double potatoePrice=potatoesPrice*vegitable2;
	System.out.println("totalPrice: "+potatoePrice);
	
	System.out.println("Strawberry Qty");
	int fruit1=aryan.nextInt();
	System.out.println("Strawberry: "+fruit1);
	
	System.out.println("Strawberry Price");
	double strawberriesPrice=aryan.nextDouble();
	double strawberryPrice=strawberriesPrice*fruit1;
	System.out.println("totalPrice: "+strawberriesPrice);
	
	System.out.println("Chicken Qty");
	int chickenA=aryan.nextInt();
	System.out.println("Chicken: "+chickenA);
	
	System.out.println("Chicken Total");
	double chikenesPrice=aryan.nextDouble();
	double  chikenePrice=chikenesPrice*chickenA;
	System.out.println("totalPrice: "+chikenesPrice);
	
	System.out.println("Bread Qty");
	int breadB=aryan.nextInt();
	System.out.println("Bread: "+breadB);
	
	System.out.println("Bread Price");
	double breadPrice=aryan.nextDouble();
	double breadesPrice=breadPrice*breadB;
	System.out.println("totalPrice: "+breadesPrice);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
