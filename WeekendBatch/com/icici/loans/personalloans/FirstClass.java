
package com.icici.loans.personalloans;


public class FirstClass {
	
	int a=10,b=20,c;
	
	public void add()
	
	{
		c=a+b;
		System.out.println("Addition of a & b is :"+c);
		
	}
public void sub()

{
	c=a-b;
	System.out.println("substraction of a & b is :"+c);
}
	
	public static void main(String[] args)
	
	{
	
System.out.println("hi");
FirstClass obj=new FirstClass();
obj.add();
obj.sub();

	}

}
