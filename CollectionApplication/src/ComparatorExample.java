import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.Modals.Product;

public class ComparatorExample implements Comparator {

	//Sorting based on weight
	@Override
	public int compare(Object o1, Object o2) {
	
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		
		if(p1.getWeight() == p2.getWeight())
			return 0;
		else if(p1.getWeight()>p2.getWeight())
			return 1;
		else
			return -1;
		
	}

	public static void main(String args[]) {

		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product("Vijay", 23));
		al.add(new Product("Ajay", 27));
		al.add(new Product("Jai", 21));

		Collections.sort(al, new ComparatorExample());
		
		System.out.println("Sorted by Weight");
		Iterator<Product> iterator = al.iterator();
		
		while (iterator.hasNext()) {
			Product product = iterator.next();
			System.out.println(product.getName()+" , "+product.getWeight());
		}
		
	}

}
