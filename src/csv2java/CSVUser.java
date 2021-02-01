package csv2java;

import com.opencsv.bean.CsvBindByName;

//this type of class isi called pojo or bean class nothing but the class which consists of properties and list of getters and setters
public class CSVUser {
	@CsvBindByName
	String name;
	
	@CsvBindByName
	String email;
	
	@CsvBindByName
	String mobile;
	
	@CsvBindByName
	String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
