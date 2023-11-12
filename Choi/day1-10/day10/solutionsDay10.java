//public class solutionsDay10 {
//
//	//행렬의 덧셈
//	//1113
//	public int[][] solution34(int[][] arr1, int[][] arr2) {
//		int[][] answer = arr1;
//
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				answer[i][j] = arr1[i][j] + arr2[i][j];
//			}
//		}
//
//		return answer;
//	}
//
//	// 직사각형 별 찍기
//	//1113
////	public static void main(String[] args) {
////		Scanner sc = new Scanner(System.in);
////		int a = sc.nextInt();
////		int b = sc.nextInt();
////
////		for (int i = 0; i < b; i++) {
////			for (int j = 0; j < a; j++)
////				System.out.print('*');
////			if (i != b-1)
////				System.out.println();
////		}
////	}
//
//	// 최대 공약수와 최소 공배수
//	//1113
//	public int[] solution35(int n, int m) {
//		int gcd = euclidean35(n, m);
//		int lcm = n * m / gcd;
//
//		return new int[]{gcd, lcm};
//	}
//
//	public int euclidean35 (int n, int m) {
//		int j = 1;
//
//		while ( j > 0 ) {
//			j = n % m;
//			n = m;
//			m = j;
//		}
//
//		return n;
//	}
//
//	//3진법 뒤집기 ////
//	//1113
//	public static int solution36(int n) {
//		int answer = 0;
//
//		List<Integer> ternary = new ArrayList<>();
//
//		while (n > 0) {
//			ternary.add(n % 3);
//			n /= 3;
//		}
//
//		int[] arrayTernary = ternary.stream().mapToInt(i -> i).toArray();
//
//		int base = 0;
//		for (int i = arrayTernary.length  - 1; i >= 0; i--)
//			answer += arrayTernary[i] * (int)Math.pow(3, base++);
//
//		return answer;
//	}
//
//	//3진법 뒤집기
//	//1113
//	public static int solution36_1(int n) {
//		int answer = 0;
//
//		List<Integer> ternary = new ArrayList<>();
//
//		while (n > 0) {
//			ternary.add(n % 3);
//			n /= 3;
//		}
//
//		int base = 0;
//		for (int i = ternary.size() - 1; i >= 0; i--)
//			answer += ternary.get(i) * (int)(Math.pow(3, base++));
//
//		return answer;
//	}
//
//}