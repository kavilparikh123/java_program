//Excellent Example in Java

import static java.lang.System.*;
interface aa
{
	public void a();
		default void aa() 
    { 
      System.out.println("Default Method Executed"); 
    } 
}
interface bb
{
	static public void a()
	{
		class a { 
			void a() { 
				System.out.println("I am the 3rd"); 
			} 
		} 
		a a = new a(); 
		a.a(); 
		out.println("I am the Fourth");
	}
	
}
abstract class cc {
	abstract public void a();
}
class Outer { 
	class a { 
		public void a() { 
			System.out.println("I m 5th"); 
		} 
	} 
}
class a implements aa,bb{
	a()
	{
		out.println("I am the Constructor");
	}
	public void a()
	{
		out.println("I am the Second");
	}
	public Object clone()throws CloneNotSupportedException{  
		out.println("I am Cloned");
		return super.clone();  
	} 
	public static void main(String[] args) {
		cc a = new cc() {
			public void a() {
				out.println("I am the First");
			}
		};
		a.a();
		new a().a();
		bb.a();
		Outer.a in = new Outer().new a(); 
		in.a(); 
		a aa = new a();
		aa.a();
		aa.aa();
		try{
		a bb=(a)aa.clone();
		}catch(CloneNotSupportedException c){} 
	}
}