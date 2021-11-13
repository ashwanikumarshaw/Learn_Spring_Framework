package learn.Spring.SpringBoot.sort;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component// spring will not start due to multiple component
@Primary //making one of them primary will resolve
public class QuickSort implements SortAlgo {

	@Override
	public int[] sortArr(int[] num) {

		return num;
	}

}
