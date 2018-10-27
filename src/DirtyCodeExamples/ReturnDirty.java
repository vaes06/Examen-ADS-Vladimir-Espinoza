package DirtyCodeExamples;

public class ReturnDirty {

	public boolean ReturnDirty() {
		Person person = new Person();
		if (person.age > 18) {
			//Do something long
		}
		if (person.isInGoodHealth) {
			//Do more
		}
		if (person.status.contains("married")) {
			//Do even more
		}
		else {
			return false;
		}
		return true;
		

}
