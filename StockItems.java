import java.util.*;

public class StockItems
{  
 UUID idNum;  
 String name;  
 String desc;
 String price;  
 

  
 StockItems(String name, String desc, String price)
 {  
 this.idNum=UUID.randomUUID();  
 this.name=name;  
 this.desc=desc; 
 this.price=price;  

 }  
   
 public String toString()
 {
  return idNum+" "+name+" "+desc+" "+price;  
 }
 
 public static void main(String args[]){  
     List stockItems = new ArrayList();
	 StockItems s1=new StockItems("name","Description","some price");    
	 StockItems s2=new StockItems("name","Description", "some price");
	 
	 stockItems.add(s1);
	 stockItems.add(s2);
     
    System.out.println(s1);  
    System.out.println(s2); 
    System.out.println(stockItems);
    System.out.println("quantity: " + stockItems.size());
 }  
}
