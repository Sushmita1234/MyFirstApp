import java.util.StringJoiner;


interface Sayable{
	void say(int a);
}
public class MethodReference {
	
	
	@NonNull  String flag = getFlag();
	public  void saySomething(int a) {
		System.out.println("say something" + a);
	}
	private String getFlag() {
		return null;
	}
	public static void main(String[] args) {
		Sayable say = new MethodReference()::saySomething;
		say.say(7);
		
		
		StringJoiner joinNames = new StringJoiner("|", "[", "}");   // passing comma(,) and square-brackets as delimiter   
        
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);  
        
        
	}
}
