package java_2;
import java.util.*;
 class hashmap
{
	 public static void main(String arg[])
	 {
		 HashMap hm=new HashMap();
		 hm.put("OOP", "object oriented programming");
		 hm.put("object","has state and behaviour");
		 hm.put("class","defines state and behaviour shared by obj");
		 System.out.println(hm);
		 Set s=hm.entrySet();
		 System.out.println();
		 System.out.println("\n hashmap current size: "+hm.size());
		 System.out.println("Elements of hashmap");
		 System.out.println();
		 Iterator itr=s.iterator();
		 while(itr.hasNext())
		 {
			 Object ob=itr.next();
			 System.out.println(" "+ob);
		 }
		 TreeMap tm=new TreeMap();
		 tm.put("xava is", "oop");
		 tm.put("java is", "simple");
		 tm.put("zava is","robust");
		 tm.put("rama is", "temporary");
		 System.out.println();
		 System.out.println(tm);
		 System.out.println("\n elements of treemap by iteration");
		 System.out.println();

		 Set s1=tm.entrySt();
		 Iterator itr1=s1.iterator();
		 while(itr1.hasNext())
		 {
			 Map.Entry me=(Map.Entry)itr1.hasNext();
			 Object ob1=itr1.next();
			 //both key/value
			 System.out.println(" "+ob1);
			 //only for keys
			 System.out.println(me.getKey());
			 //only for values
			 System.out.println(me.getValue());
		 }
		 System.out.println("\n Treemap current size: "+tm.size());
		 tm.putAll(hm);
		 System.out.println("\n putting a map into invoke map result will sort");
		 System.out.println("\n"+tm);
		 System.out.println(tm.remove("ram is")+":i am removed value");
		 System.out.println("\n Treemap current size: "+tm.size());
		 System.out.println("\n checking specific key/value status :"+tm.containsKey("java is")+" "+tm.containsValue("temporary"));
		 System.out.println("retrieve value by key : "+hm.get("oop"));
		 Collection c=tm.values();
		 System.out.println("\n values of my treemap: "+c);
		 System.out.println("\nkeys of treemap :"+tm.keySet());
	 }
}