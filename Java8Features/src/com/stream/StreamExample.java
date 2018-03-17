package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) 
	{
		List<Product> productsList = new ArrayList<Product>();    
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        //stream filter operation
        List<Float> priceList = productsList.stream()
        			.filter(x->x.price >= 30000) //filtering list
        			.map(x->x.price)			 // fetching price  
        			.collect(Collectors.toList()); //finally converting into list
        
        for (Float price : priceList) {
        	System.out.println(price);
		}
        
        System.out.println("*****************");
        productsList.stream().filter(x->x.price >= 30000)
        			.forEach(x -> System.out.println(x.price));
        
        
       //to print numbers from 1 to 10 
        System.out.println("*****************");
       Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println);
        
       
       //Sorting product list based on price
       System.out.println("******* Default Sorting by name **********");
       List<Product> sortedProductList = productsList.stream()
    		   	.sorted(Comparator.comparing(Product :: getName))
    		   	.collect(Collectors.toList());
       
       for (Product p : sortedProductList) {
       		System.out.println(p.name+" "+p.price);
       }
       
       
       //summing of all the prices
       double totalPrice = productsList.stream()
    		   				.collect(Collectors.summingDouble(p->p.price));
       System.out.println("Sum of price : "+totalPrice);
       
       
       //count example
       long total1 = productsList.stream().count();
       long total2 = productsList.stream()  
               .filter(p->p.price<30000)  
               .count();
       
       System.out.println("Total1 : "+total1+",  Total2 : "+total2);
       
       
       //Mapping list into map
       Map<Integer, String> idNameMap = productsList.stream()
    		   			.collect(Collectors.toMap(p->p.id, p->p.name));
       System.out.println(idNameMap);
       
	}

}
