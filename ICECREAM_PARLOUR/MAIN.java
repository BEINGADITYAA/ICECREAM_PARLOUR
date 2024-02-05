package ICECREAM_PARLOUR;
import java.util.Scanner;
public class MAIN {

	public static void main(String[] args) {
		int C1,C2,C3;
		Scanner A = new Scanner(System.in);
		String NAME="";
		System.out.println("***************ICECREAM PARLOUR***************"+"\n");
		System.out.println("ENTER YOUR NAME : "+"\n");
		NAME = A.next();
		
		System.out.println("WELCOME," +NAME+ "\n");
		System.out.println("CHOOSE FOR VEGAN [1] /NON-VEGAN [2] : " + "\n" + "ENTER 1 OR 2 : ");
		C1 = A.nextInt();
		ICECREAM obj = new ICECREAM();
		if(C1==1) {
			obj.CHOICE(true);	
		}
		else  {
			obj.CHOICE(false);
		}
		obj.FLAVOUR();
		System.out.println("YOU WANT CHOCOCHIPS AS AN ADD-ON FOR [100/-] "+"\n"+"PRESS 1 FOR [YES]/2 FOR [NO]"+"\n");
		C2=A.nextInt();
		if(C2==1) {
			obj.ADDCHOCOCHIPS();	
		}
		System.out.println("YOU WANT CHOCOSYRUP AS AN ADD-ON FOR [150/-] "+"\n"+"PRESS 1 FOR [YES]/2 FOR [NO]"+"\n");
		C3=A.nextInt();
		if(C3==1) {
			obj.ADDCHOCOSYRUP();	
		}
		
		System.out.println("THANKS,"+NAME+" YOUR BILL IS :"+"\n");
		obj.GETBILL();
	}

}
