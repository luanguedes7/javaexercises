package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 =  new Post(spf.parse("08/02/2024 15:09:15"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 =  new Post(spf.parse("08/02/2024 15:24:15"), 
				"Good night guys", 
				"See you tomorrow",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
	}

}
