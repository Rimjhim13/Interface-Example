//create static method in interface 
interface Inter1{
	abstract void show();
	static void show2(){
		System.out.println("show2");
}
}
public class Prog34 implements Inter1{
	//define body
	public void show(){
		System.out.println("show");
	}
	public static void main(String ar[]){
		Prog34 p=new Prog34();

	 p.show();
   	Inter1.show2();

		
}
}