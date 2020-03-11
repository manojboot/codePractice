package com.practice.dec13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionListSynchronized {
	
		public static void main(String args[]) {
			
			List<String> list = Collections.synchronizedList(new ArrayList<String>());
			list.add("luck ali");
			list.add("sonu nigam");
			list.add("kailash kher");
			list.add("udit naryana");
			list.add("mohit chauhan");
			System.out.println(list);
			synchronized(list) {
				list.add("k.k");

				Iterator<String> itr = list.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			}
		}

}
