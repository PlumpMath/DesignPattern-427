package factory.simple;

public class SimpleFactory {
		public static void main(String[] args) {
			  Factory factory = new Factory();  
		      BMW bmw320 = factory.createBMW(320);  
		      BMW bmw750 = factory.createBMW(523);  
		      bmw320.createCat();
		      bmw750.createCat();
		}
}
