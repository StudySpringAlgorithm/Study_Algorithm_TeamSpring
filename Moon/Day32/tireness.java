package Day32;

import java.sql.Struct;
import java.util.Map;

public class tireness {
    private static int amswer = 0;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(solution(k, dungeons));
    }
    public static int solution(int k, int[][] dungeons) {
        int[] visited = new int[dungeons.length];
        dfs(dungeons, visited, k, 0);

        return amswer;
    }

    private int max = 0;

    private static void dfs(int[][] dungeons, int[] visited, int k, int count){
        for(int i = 0; i < dungeons.length; i++){
            if(visited[i] == 0 && k >= dungeons[i][0]){
                visited[i] = 1;
                dfs(dungeons, visited, k - dungeons[i][1], count + 1);
                visited[i] = 0;
            }
        }

        if(amswer < count){
            amswer = count;
        }
    }

}
