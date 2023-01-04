import java.util.*;

public class Solution {
    public static Scanner sc = null;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }
        sc = new Scanner(System.in);
        System.out.println("First Question : ");
        System.out.println("Enter row = ");
        int row = sc.nextInt();
        System.out.println("Enter Col = ");
        int col = sc.nextInt();
        // Function 2d Matrix
        int[][] arr2 = firstSolution(row, col, list);
        for (int[] rows : arr2) {
            for (int x : rows) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        twoSolution(arr2);
    }

    private static int[][] firstSolution(int row, int col, ArrayList<Integer> list) {
        Solution obj = new Solution();
        int[][] arr2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = obj.randomElement(list);
            }
        }
        return arr2;
    }

    public int randomElement(List<Integer> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public static void twoSolution(int[][] arr2) {
        System.out.println("type col index for 2nd Question : ");
        int col = sc.nextInt();
        Arrays.sort(arr2, new Comparator<int[]>() {
            public int compare(int[] first, int[] second) {
                if (first[col] > second[col]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (int[] rows : arr2) {
            for (int x : rows) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}