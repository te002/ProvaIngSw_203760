package ingsw.provaIntermedia.ProvaIngSw_203760;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListUtil {

	public List<Integer> list;
	public MyListUtil() {
		list= new ArrayList<Integer>();
	}
	
	public List<Integer>sort(int typeOrder){
		if(typeOrder==1) {
			Collections.sort(list);
			return list;
		}
		else if(typeOrder==0) {
			Collections.sort(list);
			Collections.reverse(list);
			return list;
		}
		else {
			throw new IllegalArgumentException("Tipo ordine non contemplato");
		}
	}
}
