import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Move implements Comparable<Move>{

	
	
	private double rating;
	
	private String name;
	private int year;
	
	//use to sort the movie by year
	@Override
	public int compareTo(Move o) {
		return this.year-o.year;
	}
	
  
	public Move(String name, double rating, int year) {
		this.name=name;
		this.rating=rating;
		this.year=year;
	}
	
	public double getRating() {
		return rating;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
}
	// class to compare movies by rating 
	class RatingCompare implements Comparator<Move>{

		@Override
		public int compare(Move o1, Move o2) {
			if(o1.getRating()<o2.getRating())
				return -1;
			if(o1.getRating()>o2.getRating())
				return 1;
			else 
				return 0;
			// TODO Auto-generated method stub
			
		}
		
	}
	// class to compare movies by rating 
	class NameCompare implements Comparator<Move>{

		@Override
		public int compare(Move o1, Move o2) {
			return o1.getName().compareTo(o2.getName());
		}
			
	}
	

public class Movie {
	
	public static void main(String [] args){
		ArrayList<Move> list=new ArrayList<Move>();
		list.add(new Move("Force",8.3, 1995));
		list.add(new Move("krish",7.3, 1994));
		list.add(new Move("Jadu",6.3,  1993));
		list.add(new Move("pagalapur",5.3, 1990));
		list.add(new Move("Jailor",4.3, 2001));
		list.add(new Move("RRR",2.3, 2002));
		
		//sort them by rating
		RatingCompare ratingcompare =new RatingCompare();
		Collections.sort(list,ratingcompare);
		
		for(Move move:list) 
				System.out.println(move.getName()+ move.getRating() + move.getYear());
		System.out.println("BY Compare");
		//sort by name
		NameCompare namecmp=new NameCompare();
		Collections.sort(list,namecmp);
		for(Move move:list) 
			System.out.println(move.getName()+ move.getRating() + move.getYear());
		System.out.println("NameCompare");
		
		//sort by year
		Collections.sort(list);
		for(Move move:list) 
			System.out.println(move.getName()+ move.getRating() + move.getYear());
		
		
		
			
		
		
		
	}

}
