import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBackPack {
	
	@Test
	public void test() {
		//最大容量为10
        int m = 10;
        int n = 3;
        /*
        放入的三个物体重量分别为3， 4， 5；价值分别为4， 5， 6
         */
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        int check[][] = {{0, 0, 4, 4, 4, 4, 4, 4, 4, 4},
        		{0, 0, 4, 5, 5, 5, 9, 9, 9, 9},
        		{0, 0, 4, 5, 6, 6, 9, 10, 11, 11}
        		};
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
            	System.out.println("i: "+i+"\tj: "+j+"\t"+check[i-1][j-1]+" "+ c[i][j]);
                assertEquals(check[i-1][j-1], c[i][j]);
            }
        }
	}
}
