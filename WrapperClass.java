//Wrapper Class -> Converting primtive datatype to non-prem data type(objects)

package Mypack;

public class WrapperClass {
	
	public static void main(String[] args) {
		
	

	int num1 = 8;
	//Integer num2 = new Integer(num1); //boxing
	
	Integer num2 = num1 ;//auto-boxing
	
	
	
	//int num3 = num2.intValue(); //unboxing
//	System.out.println(num3);
	
	int num3 = num2; //auto-unboxing
	System.out.println(num3);
	
	}
}
