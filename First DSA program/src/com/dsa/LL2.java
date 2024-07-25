package com.dsa;
import java.util.*;
public class LL2 {
     
	
	public static void main(String[] args) {
     
LinkedList<String> list=new LinkedList<String>();
list.addFirst("is");
list.addFirst("This");
System.out.println(list);

list.addLast("a");
list.addLast("list");
System.out.println(list);
System.out.println(list.size());

for(int i=0;i<list.size();i++)
{
	System.out.print(list.get(i)+ " ");
}
System.out.println();
list.removeFirst();
System.out.println(list);
}
	

}
