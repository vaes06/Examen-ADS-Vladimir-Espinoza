package cleanCodeExamples;

public class FailFast  {

	boolean good;
	int age;
	String status;
	

	public FailFast() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean failfast() throws Exception{
		if (good){	} else {throw new Exception();}
		if (status.contains("married")) {} else {throw new Exception();}
		return true;
	}
}