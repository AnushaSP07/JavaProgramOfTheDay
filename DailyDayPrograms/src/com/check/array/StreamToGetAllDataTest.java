package com.check.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    
}
public class StreamToGetAllDataTest {

	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();
		prod.add(new Product(1, "one", 30));
		prod.add(new Product(2, "two", 25));
		prod.add(new Product(3, "three", 40));
		prod.add(new Product(4, "four", 35));
		prod.add(new Product(5, "five", 45));
		
		Collections.synchronizedList(prod);
		
		List<String> prodName = prod.stream().filter(val -> val.name.startsWith("t"))
				.map(val->val.name).collect(Collectors.toList());
		
		System.out.println(prodName);
		
		List<Float> prodVal = prod.stream().filter(val -> val.price>35)
				.map(val ->val.price).collect(Collectors.toList());
		System.out.println(prodVal);
		
		prod.stream().filter(val ->val.price>=30)
		.forEach(val -> System.out.println(val.name));
		
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 11);
		map.put(2, 22);
		map.put(3, 33);
		map.put(4, 24);
		map.put(5, 55);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) map.entrySet();
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
