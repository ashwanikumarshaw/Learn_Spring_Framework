package learn.Spring.SpringBoot.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import learn.Spring.SpringBoot.sort.SortAlgo;

@Component
public class SearchIndex {
	
	@Autowired
	private SortAlgo sortAlgo;
	
	// can use Constructor
//	public SearchIndex(SortAlgo sortAlgo) {
//		super();
//		this.sortAlgo = sortAlgo;
//	}
	
	//OR Can use Setter
//	public void setSortAlgo(SortAlgo sortAlgo) {
//		this.sortAlgo = sortAlgo;
//	}
	//OR use nothing Spring will generate Setter 
	public int binSearch(int[] n,int num) {
		//Binary Search Algorithm
		
		// Step 1 Sort
		// Step 2 Search
		// Therefore binSearch is tightly coupling with Sort 
		//how make it loosely coupled 
		//:: write sort algorithm write out side the binSearch and use the result
		
		int[] sortNum=sortAlgo.sortArr(n);
		System.out.println(sortAlgo);
		
		for(int i=0;i<sortNum.length;i++)
			if(sortNum[i]==num)
				return i+1;
		return 0;
		
	}



}
