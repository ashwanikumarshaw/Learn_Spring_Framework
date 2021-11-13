package learn.Spring.SpringBoot.sort;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BubbleSort implements SortAlgo{
	@Override
	public int[] sortArr(int[] num)   {
		
		return num;
	}

}
