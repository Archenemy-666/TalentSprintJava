package playingWithExceptions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import userDefinedExceptions.InvalidProductException;

public class ProductInfo {
	public static void main(String args[]) throws InvalidProductException{
		
		Product p1 = new Product(1 , 121 , 12 );
		Product p2 = new Product(2 , 221 , 12 );
		Product p3 = new Product(3 , 21 , 12 );
		Product p4 = new Product(4 , 1121 , 12 );
		Product p5 = new Product(5 , 121 , 12 );
		Product p6 = new Product(6 , 1221 , 12 );
		Product p7 = new Product(7 , 121 , 12 );
		Product p8 = new Product(8 , 1321 , 12 );
		Product p9 = new Product(9 , 121 , 12 );
		
		Map<Integer , Product> productMap = new HashMap<Integer , Product>();
		productMap.put(p1.getId(), p1);
		productMap.put(p2.getId(), p2);
		productMap.put(p3.getId(), p3);
		productMap.put(p4.getId(), p4);
		productMap.put(p5.getId(), p5);
		productMap.put(p6.getId(), p6);
		productMap.put(p7.getId(), p7);
		productMap.put(p8.getId(), p8);
		productMap.put(p9.getId(), p9);
		
		
		
		List<Entry<Integer , Product>> productList = new LinkedList<Entry<Integer , Product>>();
		
		for(Entry<Integer , Product> e : productMap.entrySet()) {
			productList.add(e);
		}
		
		Iterator<Entry<Integer , Product>> i = productList.iterator();
		while (i.hasNext()) {
			Entry<Integer,Product> e = i.next();
			float weight = (float) e.getValue().getWeight();
			if(weight < 200) {
				try {
					throw new InvalidProductException("product under weight : ");
				}catch(InvalidProductException x){
					//e.printStackTrace();
					i.remove();
					
				}
			}
			
			}
		for(Entry<Integer , Product> entry : productList) {
			System.out.println(entry);
		}
		
		/*
		for(Entry<Integer,Product> info : productMap.entrySet()) {
			Product temp = info.getValue() ;

			
			
			if(temp.getWeight() < 200 ) {
				try {
					throw new InvalidProductException("product under weight : ");
				}catch(InvalidProductException e){
					e.printStackTrace();
					
				}
			}
			else {
				tempMap.put(info.getKey(), info.getValue());
			}
		
		}
		
		for(Entry<Integer,Product> info2 : tempMap.entrySet()) {
			System.out.println(info2);
		}
		*/
		
		
		
		
	}

}
