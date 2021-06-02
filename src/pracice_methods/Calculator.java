package pracice_methods;

public class Calculator {
	
	
	public int getadd(int num1,int num2)
	{
		
		int add=num1+num2;
		return add;
	}
	
	
	public int getsub(int num1,int num2)
	{
		return num1-num2;
	}
	
	public int getmul(int num1,int num2)
	{
		return num1*num2;
	}
	
	public int getdiv(int num1,int num2)
	{
		return num1/num2;
	}
	
 public static void main(String[] args) {
	 
	 Calculator calc=new Calculator();
	 int add=calc.getadd(5, 5);
	 System.out.println("the add value is:\n"+ add);
	 int sub=calc.getsub(5, 2);
	 System.out.println("the sub value is:\n"+ sub);
	 System.out.println(calc.getmul(5,2));
	 
	
}
	
	
}
