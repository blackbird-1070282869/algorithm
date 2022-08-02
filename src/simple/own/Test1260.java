package simple.own;

import java.util.ArrayList;
import java.util.List;

public class Test1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        for (int i = 0; i < m; i++) {
            ArrayList ll= new ArrayList<>();
            for (int j = 0; j < n; j++) {
                ll.add(0);
            }
            list.add(ll);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int now=grid[i][j];
                int l=j+k;
                int z=l%n;
                int total=(l/n+i)%m;
                list.get(total).set(z,now);
            }
        }
        return list;
    }
}
