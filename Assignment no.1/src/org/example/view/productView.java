package org.example.view;
import org.eample.model.*;

public class productView {
	
	pubilc static void main(String[] args) {
		
		   Product p=new Product(10,"Sunsilk",50);
		   ProcuctService psObj=new ProductService();
		   psObj.increasePrice(p);
		   
	}
 
}
