package TableClass;

public class Password {

	private String Root;
	private String Pass;
	
	public Password() {

	}
	
	public Password(String Root) {
		this.Root=Root;
	}
	
	public void setRoot(String Root) {
		this.Root=Root;
	}
	
	public void setPass(String Pass) {
		this.Pass=Pass;
	}
	
	
	public String getRoot() {
		return this.Root;
	}
	
	public String getPass() {
		return this.Pass;
	}

	@Override
	public String toString() {
		return this.Root;
	}
	
}

