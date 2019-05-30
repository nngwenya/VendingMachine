package za.co.vendingMachine.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
	
	public String[] readfile()throws Exception {
		
		File file = new File("D:\\Practice\\myProjects\\stock.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String str;
		String[] array = null;
		int i = 1;
		
		while ((str = br.readLine()) != null) {
			array = str.split(",");
			System.out.println(i + ". " + array[0] + " R" + array[1]);
			i++;
		}
		return array;
	}
	

}
