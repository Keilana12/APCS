import java.util.Arrays;
import java.util.ArrayList;
public class AlgorithmsBasic {

    public static int[] swap(int[] input) {
        if (input.length != 2) {
            throw new RuntimeException("input has to have length of 2");
        }
        int a = input[0];
        int b = input[1];

        // TODO: implement the swap algorithm
        return new int[] {a, b};
    }

    public static int[] copy(int[] input) {
        // TODO: implement the copy algorithm
        return input;
    }

    public static ArrayList<Integer> copy(ArrayList<Integer> input) {
        // TODO: implement the copy algorithm
        return input;
    }

    public static int search(int target, int[] list) {
        // TODO: implement the search algorithm (return -1 if not found)
        return -1;
    }

    public static int sum(int[] list) {
        // TODO: implement the aggregate algorithm
        return 0;
    }

     public static int highest(int[] list) {
        // TODO: implement the find highest algorithm (return -1 if list is empty)
        return 0;
    }

    public static void testSwap() {
        System.out.println("starting testSwap");
        System.out.println(Arrays.equals(swap(new int[] {3, 4}), new int[] {4, 3}));
        System.out.println(Arrays.equals(swap(new int[] {1, -4000}), new int[] {-4000, 1}));
        System.out.println(Arrays.equals(swap(new int[] {0, 0}), new int[] {0, 0}));
    }

    public static boolean isArrayCopy(int[] original, int[] copy) {
        return original != copy && Arrays.equals(original, copy);
    }

    public static boolean isListCopy(ArrayList<Integer> original, ArrayList<Integer> copy) {
        return original != copy && original.equals(copy);
    }

    public static ArrayList<Integer> createList(int[] input) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int each : input) result.add(each);
        return result;
    }

    public static void testCopyArray() {
        System.out.println("starting testCopyArray");
        int[] original = new int[] {1, 2, 3};
        System.out.println(isArrayCopy(original, copy(original)));
        original = new int[] {1};
        System.out.println(isArrayCopy(original, copy(original)));
        original = new int[] {};
        System.out.println(isArrayCopy(original, copy(original)));
    }

    public static void testCopyList() {
        System.out.println("starting testCopyList");
        ArrayList<Integer> original = createList(new int[] {1, 2, 3});
        System.out.println(isListCopy(original, copy(original)));
        original = createList(new int[] {1});
        System.out.println(isListCopy(original, copy(original)));
        original = createList(new int[] {});
        System.out.println(isListCopy(original, copy(original)));
    }

    public static void testSearch() {
        System.out.println("starting testSearch");
        System.out.println(search(3, new int[] {1,2,3,4}) == 2);
        System.out.println(search(3, new int[] {3,2,3,4}) == 0);
        System.out.println(search(3, new int[] {1,2,4,4}) == -1);
    }

    public static void testSum() {
        System.out.println("starting testSum");
        System.out.println(sum(new int[] {1,2,3,4}) == 10);
        System.out.println(sum(new int[] {4}) == 4);
        System.out.println(sum(new int[] {}) == 0);
    }

    public static void testHighest() {
        System.out.println("starting testHighest");
        System.out.println(sum(new int[] {1,2,3,4}) == 4);
        System.out.println(sum(new int[] {2,4,2,3}) == 4);
        System.out.println(sum(new int[] {}) == -1);
        System.out.println(sum(new int[] {3}) == 3);
        System.out.println(sum(new int[] {-19,-3,0}) == 0);
    }

	public static void main(String[] args) {
        testSwap();
        testCopyArray();
        testCopyList();
        testSearch();
        testSum();
        testHighest();
	}
}

