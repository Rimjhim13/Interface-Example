//interface- interface is blue print of class.in interface abstract method is define and their body define in the class  
interface Inter1{
	abstract public void run();
	abstract public void walk();
	abstract public void legs();
		
	}
	class Animal implements Inter1{
		public void run(){
			System.out.println("Animal can run");
		}
		public void walk(){
			System.out.println("Animal can walk");
		}
		public void legs(){
			System.out.println("Animal have 4legs");
		}
		
		
	}

class Prog6{
public static void main(String ar[]){
	Animal a=new Animal();
	a.run();
	a.walk();
	a.legs();

}

}