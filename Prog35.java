//static method do not override and not change there functionality
interface Inter1{
	
	static void show2(){
		System.out.println("show2");
}
}
public class Prog35 implements Inter1{
	//override
	static void show2(){
		System.out.println(" override show2");
	}
	public static void main(String ar[]){
	Inter1.show2();
	show2();
	}
	

		

}