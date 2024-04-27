import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<String> names = new ArrayList<String>();
 names.add("Arun");
 names.add("Ram");
 names.add("Alekhya");
 names.add("Gunna");
  Long c =names.stream().filter(s->s.startsWith("A")).count();
 System.out.println(c);
 
//names.stream().forEach(s->System.out.println(s));
//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

 //names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));;
List<String> ls= names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
 System.out.println(ls.get(0));
 //names.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
 
 

 
	}

}
