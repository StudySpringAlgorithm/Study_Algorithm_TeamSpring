package Day25;

public class parkWalk {

    public static void main(String[] args) {
        String[] park = new String[]{"OSO","OOO","OXO","OOO"};
        ///   0 1 2
        /// 0 S O O
        /// 1 0 X s1
        /// 2 0 O O

        String[] routes = new String[]{"E 2","S 3","W 1"}; // 2 1

        for (int num : solution(park, routes)) {
            System.out.print(num + " ");
        }

    }

    private static int[] solution(String[] park, String[] routes) {
        int[] location = new int[]{0, 0};
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                location[1] = park[i].indexOf("S");
                location[0] = i;
                break;
            }
        }
        for (String route : routes) {
            String direction = route.substring(0, 1);
            int move = Integer.parseInt(route.substring(2, 3));
            int[] moveLocation = location.clone();
            if (direction.equals("N")) {
                moveLocation[0] -= move;
            }
            if (direction.equals("S")) {
                moveLocation[0] += move;
            }
            if (direction.equals("W")) {
                moveLocation[1] -= move;
            }
            if (direction.equals("E")) {
                moveLocation[1] += move;
            }
            if (isValidLocation(park, location, moveLocation, direction)) {
                location = moveLocation;
            }

        }
        return location;
    }

    private static boolean isValidLocation(String[] park, int[] location, int[] moveLocation, String direction) {
        System.out.println(moveLocation[0]);
        int moveX = moveLocation[1];
        int moveY = moveLocation[0];
        if (moveX < 0 || moveX >= park[0].length()) {
            return false;
        }
        if (moveY < 0 || moveY >= park.length) {
            return false;
        }

        if (direction.equals("W") || direction.equals("E")) {
            for (int i = Math.min(location[1], moveX); i <= Math.max(location[1], moveX); i++) {
                if (park[moveY].charAt(i) == 'X') {
                    return false;
                }
            }
        }
        if (direction.equals("N") || direction.equals("S")) {
            for (int i = Math.min(location[0], moveY); i <= Math.max(location[0], moveY); i++) {
                if (park[i].charAt(moveX) == 'X') {
                    return false;
                }
            }
        }
        return true;
    }

//    private static int[] solution(String[] park, String[] routes) {
//        int[] location = new int[]{0, 0};
//        for (String s : park) {
//            if (s.contains("S")) {
//                location[0] = s.indexOf("S");
//                break;
//            }
//            location[1] += 1;
//        }
//        for (String route : routes) {
//            String direction = route.substring(0, 1);
//            int move = Integer.parseInt(route.substring(2, 3));
//
//            // 북쪽으로 이동
//            if (direction.equals("N")) {
//                if (location[1] - move < 0) {
//                    continue;
//                }
//                if (park[location[1] - move].charAt(location[0]) == 'X') {
//                    continue;
//                }
//                location[1] -= move;
//            }
//
//            // 남쪽으로 이동
//            if (direction.equals("S")) {
//                if (location[1] + move > park.length - 1) {
//                    continue;
//                }
//                if (park[location[1] + move].charAt(location[0]) == 'X') {
//                    continue;
//                }
//                location[1] += move;
//            }
//
//            // 동쪽으로 이동
//            if (direction.equals("E")) {
//                if (location[0] + move > park[0].length() - 1) {
//                    continue;
//                }
//                if (park[location[1]].charAt(location[0] + move) == 'X') {
//                    continue;
//                }
//                location[0] += move;
//            }
//
//            // 서쪽으로 이동
//            if (direction.equals("W")) {
//                if (location[0] - move < 0) {
//                    continue;
//                }
//                if (park[location[1]].charAt(location[0] - move) == 'X') {
//                    continue;
//                }
//                location[0] -= move;
//            }
//        }
//        return location;
//    }

}
