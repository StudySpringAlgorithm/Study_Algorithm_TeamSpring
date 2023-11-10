package Day9;

public class lackMoney {
    public static void main(String[] args) {
        System.out.println(solution(3,20,4));
        System.out.println(solution(3,20,4));
    }

    private static long solution(int price, int money, int count) {
        long fee = 0;

        for (int i = 1; i <= count; i++) {
            fee += price * i;
        }
        long result = fee - money;

        return result > 0 ? result : 0;
    }

    // money가 int라 넘어가는 케이스가 있음
    private static long fail(int price, int money, int count) {

        for (int i = 1; i <= count; i++) {
            money -= price * i;
        }
        if (money < 0) {
//            return Math.abs(money);
            return -money;
        }

        return 0;
    }
}
