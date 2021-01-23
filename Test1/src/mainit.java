public class mainit { 
  
    static int noOfObjects = 0; 
    // Instead of performing increment in the constructor 
    // instance block is preferred to make this program generic. 
    { 
    	System.out.println("in insta");
        noOfObjects += 1; 
    } 
  
// various types of constructors 
// that can create objects 
public mainit() 
{ 
} 
public mainit(int n) 
{ 
} 
public mainit(String s) 
{ 
} 

public static void main(String args[]) 
{ 
	System.out.println("in insta1");
	mainit t1 = new mainit(); 
	System.out.println("in insta2");
	mainit t2 = new mainit(5); 
	System.out.println("in insta3");
    mainit t3 = new mainit("GFG"); 
    System.out.println("in insta4");

    // We can also write t1.noOfObjects or 
    // t2.noOfObjects or t3.noOfObjects 
    System.out.println(mainit.noOfObjects); 
} 
}
