package Day20;

public class wallPaper {

    public static void main(String[] args) {
        String[] case1 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] case2 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] case3 = {"..", "#."};

        int[] arr1 = solution(case1);
        for (int num : arr1) {
            System.out.println(num);
        }
        System.out.println();
        int[] arr2 = useMath(case1);
        for (int num : arr2) {
            System.out.println(num);
        }
    }

    private static int[] solution(String[] wallpaper) {
        int minLeft = wallpaper[0].length();
        int maxRigth = 0;
        int top = 0;
        int bottom = wallpaper.length;
        for (String grid : wallpaper) {
            int minLeftPoint = grid.indexOf("#");
            if (minLeftPoint != -1 && minLeftPoint < minLeft) {
                minLeft = minLeftPoint;
            }
            int maxRightPoint = grid.lastIndexOf("#") + 1;
            if (maxRightPoint > maxRigth) {
                maxRigth = maxRightPoint;
            }
        }

        for (String grid : wallpaper) {
            if (!grid.contains("#")) {
                top++;
            } else {
                break;
            }
        }

        for (int i = wallpaper.length - 1; i > 0; i--) {
            if (!wallpaper[i].contains("#")) {
                bottom--;
            } else {
                break;
            }
        }


        return new int[]{top, minLeft, bottom, maxRigth};
    }

    private static int[] useMath(String[] wallpaper) {
        int left = wallpaper.length;
        int rigth = -1;
        int top = wallpaper.length;
        int bottom = -1;
        for(int i=0; i< wallpaper.length;i++ ){
            for(int j=0; j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    top = Math.min(top,i);
                    left = Math.min(left,j);
                    bottom = Math.max(bottom,i);
                    rigth = Math.max(rigth,j);
                }
            }
        }
        return new int[]{top, left, bottom + 1, rigth + 1};
    }
}
