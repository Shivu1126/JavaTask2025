package pattern;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle24 {

	public static void main(String[] args) {
		int n = 5;
		List<List<Integer>> outputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                int val = outputList.get(i - 1).get(j - 1) + outputList.get(i - 1).get(j);
                list.add(val);
            }
            if (i > 0)
                list.add(1);
            outputList.add(list);
        }
        int temp = n;
        for(int i=0;i<outputList.size();i++) {
        	for(int k=0;k<temp-1;k++) {
        		System.out.print(" ");
        	}
        	for(int j=0;j<outputList.get(i).size();j++) {
        		System.out.print(outputList.get(i).get(j)+" ");
        	}
        	System.out.println();
        	temp--;
        }
	}
}
