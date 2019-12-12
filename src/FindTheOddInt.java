public class FindTheOddInt {
    public static int findIt(int[] a) {
        String checkedValues = "";
        for (int i = 0; i < a.length; i++) {
            if (checkedValues.contains(String.valueOf(a[i]))) {
                continue;
            }
            checkedValues += String.valueOf(a[i]);
            int number = a[i];
            int occurrences = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == number) {
                    occurrences++;
                }
            }
            if (occurrences % 2 == 1) {
                return number;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{3, 1, 3}));
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(findIt(new int[]{5, 5, 5, 1, 5}));
        System.out.println(findIt(new int[]{1, 3, 1, 3, 1, 3, 3}));
    }
}
