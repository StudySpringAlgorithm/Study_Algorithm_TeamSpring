package Chang.day12;

import java.util.Arrays;

public class square {

    public int solution(int[][] sizes) {
        int max_w=0;
        int max_h=0;

        for (int i=0; i<sizes. length; i++) {
            Arrays.sort (sizes [i]);
        }

        for (int i=0; i<sizes. length; i++) {

            max_w = Math.max(max_w, sizes [i][0]);
            max_h = Math.max(max_h, sizes [i][1]);
        }

        return max_w * max_h;

    }

}
