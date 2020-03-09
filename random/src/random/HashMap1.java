package random;

import java.util.*;  
class HashMap1{  
 public static void main(String args[])
 {  
    HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
       
      System.out.println("After invoking put() method ");  
      for(Map.Entry m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }  
        
      hm.putIfAbsent(103, "Gaurav");  
      System.out.println("After invoking putIfAbsent() method ");  
      for(Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
      HashMap<Integer,String> map=new HashMap<Integer,String>();  
      map.put(102,"Ravi");  
      map.putAll(hm);  
      System.out.println("After invoking putAll() method ");  
      for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
      System.out.println(map);
      
      Iterator i=map.entrySet().iterator();
      while(i.hasNext())
      {
    	  //System.out.println(i.next());
    	  Map.Entry<Integer, String> ob1=(Map.Entry)i.next();
    	  System.out.println(ob1.getKey());
      }
      
      
 }  
}   
