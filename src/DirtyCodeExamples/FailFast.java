package DirtyCodeExamples;

public class FailFast {

	public FailFast() {
		boolean good = false ;
		int age = 34;
		String status = "married";
		
		if (good = true) {
			//Do something
			if (age > 18) {
				System.out.println("Age is good");
				
			}
			try {
			 
			if (status.contains("married")) {
				System.out.println("No good");
			}
			
			}
			catch (Exception a) {
				System.out.println("Try a good input");
			}
				
			}
			
		
		
	}

}
