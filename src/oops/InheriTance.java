package oops;
interface poms{
	public void pramod();
	
} 
interface pramo{
	void hello();
}
class patil implements poms,pramo
{

	@Override
	public void pramod() {
		// TODO Auto-generated method stub
		System.out.println("pramod");
		
	}
	public static void coep()
	{
		
		System.out.println("is a student of COEP");
	}
	@Override
	public void hello() {
		System.out.print("Hello"+" ");
		
	}
	
}
public class InheriTance extends patil{
	void impl(){
		hello();
		pramod();
	}

	public static void main(String[] args) {

		InheriTance i=new InheriTance();
		
		i.impl();
		coep();
		

	}

}
