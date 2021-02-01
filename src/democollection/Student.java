package democollection;

public class Student {
	String name = "";
	String regdno = "";
	String branch = "";
	//to access these we create getter ans setter
	//right click in any empty space source -> getters and seters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegdno() {
		return regdno;
	}
	public void setRegdno(String regdno) {
		this.regdno = regdno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
