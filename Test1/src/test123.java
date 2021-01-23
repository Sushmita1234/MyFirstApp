import java.lang.reflect.Constructor;

public class test123 {

	
	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("test123");
			test123 t1 = (test123) cls.newInstance();
			cls.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	
}
