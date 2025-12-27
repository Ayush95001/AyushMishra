import java.util.HashMap;

class Main {

    HashMap<Integer, Integer> totalCount(int[] nums) {

        HashMap<Integer, Integer> answer = new HashMap<>();

        for (int i = 1; i <= 9; i++) {

            int multipleCount = 0;
            for (int num : nums) {

                if (num % i == 0) {
                    multipleCount++;
                }
            }

            answer.put(i, multipleCount);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] nums = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };

        HashMap<Integer, Integer> result = obj.totalCount(nums);

        System.out.println(result);
    }
}
