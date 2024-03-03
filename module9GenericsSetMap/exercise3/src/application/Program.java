package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with file path: ");
		String path = sc.next();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int number = Integer.parseInt(fields[1]);
				
				if (map.containsKey(name)) {
					number += map.get(name);
					map.put(name, number);
				} else {
					map.put(name, number);
				}
				
				line = br.readLine();
			}
			
			for (String key: map.keySet()) {
				System.out.println(key + ":" +map.get(key));
			}
			
		} catch(IOException e) {
			System.out.println("Input erro: " + e.getMessage());
		}
		
		sc.close();

	}

}
