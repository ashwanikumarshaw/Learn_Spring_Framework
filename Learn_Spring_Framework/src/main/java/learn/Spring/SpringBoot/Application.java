package learn.Spring.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.Spring.SpringBoot.search.SearchIndex;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		//Dynamic select sortAlgo 
		//need setter or Constructor 
//		SearchIndex binS =new SearchIndex(new QuickSort());
//		int re= binS.binSearch(new int[] {1,2,3}, 3);
//		System.out.println(re);
		
		//Using Spring  
		ApplicationContext appCon =SpringApplication.run(Application.class, args);
		
		SearchIndex search=appCon.getBean(SearchIndex.class);
		int result=search.binSearch(new int[] {1,2,3,4,5}, 2);
		System.out.println(result);
		
	}

}
