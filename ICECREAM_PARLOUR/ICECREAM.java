package ICECREAM_PARLOUR;

import java.util.Scanner;

public class ICECREAM {
    private int PRICE;
    private Boolean VEGAN;
    private int VEGANORNOT;
    
    private int CHOCOCHIPS = 100;
    private int CHOCOSYRUP = 150;
    private int VANILLA = 100;
    private int CHOCOLATE = 200;
    private int MANGO = 150;
    private int ORANGE = 150;
    
    private String FLAVOUR ;
    private Boolean ISADDCHOCOCHIPS = false;
    private Boolean ISADDCHOCOSYRUP = false;
    
    
    public void CHOICE(Boolean VEGAN) {
    	this.VEGAN = VEGAN;
    	if(this.VEGAN) {
    		this.PRICE = 200;
    	} else {
    		this.PRICE = 100;
    	}
    	VEGANORNOT= this.PRICE;
    }
    
    public void FLAVOUR() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHOOSE A FLAVOUR:");
        System.out.println("1. VANILLA [100]");
        System.out.println("2. CHOCOLATE [200]");
        System.out.println("3. MANGO [150]");
        System.out.println("4. ORANGE [150]");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("VANILLA FLAVOUR SELECTED.");
                this.PRICE += VANILLA;
                FLAVOUR = "VANILLA";
                break;
            case 2:
                System.out.println("CHOCOLATE FLAVOUR SELECTED.");
                this.PRICE += CHOCOLATE;
                FLAVOUR = "CHOCOLATE";
                
                break;
            case 3:
                System.out.println("MANGO FLAVOUR SELECTED.");
                this.PRICE += MANGO;
                FLAVOUR = "MANGO";
                
                break;
            case 4:
                System.out.println("ORANGE FLAVOUR SELECTED.");
                this.PRICE += ORANGE;
                FLAVOUR = "ORANGE";
                
                break;    
            default:
                System.out.println("INVALID CHOICE. DEFAULTING TO VANILLA FLAVOUR");
                this.PRICE += VANILLA;
                FLAVOUR = "VANILLA";
                break;
        }
    }
    
    public void ADDCHOCOCHIPS() {
    	ISADDCHOCOCHIPS = true;
    	this.PRICE += CHOCOCHIPS;
    }
    
    public void ADDCHOCOSYRUP() {
    	ISADDCHOCOSYRUP = true;
       	this.PRICE += CHOCOSYRUP;
    }
    
    public void GETBILL() {
    	String BILL = "";
    	System.out.println("CHOICE MADE FOR VEGAN[200]/NONVEGAN[100] : " + VEGANORNOT);
    	System.out.println("YOUR CHOSEN FLAVOUR WAS :"+ FLAVOUR);
    	if(ISADDCHOCOCHIPS) {
    		BILL += "CHOCOCHIPS ADDED : " +CHOCOCHIPS+ "\n";
    	}
    	if(ISADDCHOCOSYRUP) {
    		BILL += "CHOCOSYRUP ADDED : " +CHOCOSYRUP+ "\n";
    	}
    	
    	BILL += "BILL : "+this.PRICE+ "\n";
    	System.out.println(BILL);
    }
    }

