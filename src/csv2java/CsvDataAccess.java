package csv2java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CsvDataAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader fr = new BufferedReader(new FileReader("./customer.csv"));
			
			CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder<CSVUser>(fr)
													.withType(CSVUser.class)
													.withIgnoreLeadingWhiteSpace(true)
													.build();
			
			
			List<CSVUser> users = csvToBean.parse(); //list of csvuserobjs
			
			for(CSVUser user:users) {
				System.out.println(user.getName());
				System.out.println(user.getEmail());
				System.out.println(user.getCountry());
				System.out.println(user.getMobile());
				System.out.println("---------------------------------------------");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
