package Mypack;


// Without using Generic

//public class Generic {
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		IntegerClass obj = new IntegerClass(5);
//		DoubleClass obj1 = new DoubleClass(5.5);
////		System.out.println(obj.print()); // Integer val print
//		System.out.println(obj1.print1());//Double val print
//	}
//	
//}
//
//	class IntegerClass {
//		
//		private Integer i ;
//		
//		public IntegerClass(Integer i) {
//			this.i = i;
//		}
//		
//		public Integer print() {
//			return i;
//		}
//		}
	

//using Generic --
public class Generic{
	public static void main(String[] args) {
		AnyDataType obj = new AnyDataType(22); // any datatype can be used
		AnyDataType obj1 = new AnyDataType(22.22);
//		System.out.println(obj.print());
		obj.print();
		obj1.print();
	}
}

// Generic class - Create one class that can be used with any datatypes
class AnyDataType <T>{
	private T var1;
	
	//constructor of AnyDataType class 
	public AnyDataType(T var1) {
		this.var1 = var1;
	}
	
	//Generic Method without return type
	public  <T> void print(){
		System.out.println(var1);
	}
	
	//Generic method with return
//	public  T print(){
//		return var1;
//	}
	
}


	
