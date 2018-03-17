import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.Modals.Product;

public class Main {

	public static void main(String[] args) {
		Product door = new Product("Wooden door", 35);
		Product floorPanel = new Product("Floor Panelr", 20);
		Product window = new Product("Glass window", 45);
		
		Collection<Product> products = new ArrayList<>();
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		
		System.out.println(products);
		
		/*
		for (Product product : products) {
			System.out.println(product);
		}*/
		
		//OR Iterator
		Iterator<Product> productIterator = products.iterator();
		while (productIterator.hasNext()) {
			Product product = productIterator.next();
			System.out.println(product);
			
		}
		
	}

}
