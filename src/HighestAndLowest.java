public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");
        int lowest = Integer.parseInt(nums[0]);
        int highest = lowest;
        for (String c: nums) {
            if(Integer.parseInt(c) > highest)
            {
                highest = Integer.parseInt(c);
            }
            if(Integer.parseInt(c) < lowest)
            {
                lowest = Integer.parseInt(c);
            }
        }
        return highest + " " + lowest;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3"));
        System.out.println(highAndLow("2 -6 1"));
    }
}
