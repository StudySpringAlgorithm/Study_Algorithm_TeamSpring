package Day6;

public class plusNull {

    public static void main(String[] args) {

    }

    public static int solution(int[] numbers) {
//         int answer = 0;
// 		List<Integer> myNum = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
// 		for (int i = 0; i < numbers.length; i++) {
// 			if(myNum.contains(numbers[i]) == true) {
// 				int index = myNum.indexOf(numbers[i]);
// 				System.out.println(index);
// 				myNum.remove(index);
// 			}
// 		}

// 		for (int i = 0; i < myNum.size(); i++) {
// 			answer = answer + myNum.get(i);
// 		}

// 		System.out.println(answer);
//         return answer;
        int answer = 45;
        for (int num : numbers) {
            answer -= num;
        }
        return answer;
    }
}
