
import java.util.ArrayList;

public class ArrayListDemoClass {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1,"sai");
		
        System.out.println(al.size());
        System.out.println(al.get(4));
        System.out.println(al);
        
	}

}
