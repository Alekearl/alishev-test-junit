public class Testing {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {-10, -50, -150},
                {10, 50, 100},
                {5, 25, 125, 1025}
        };
        ClassTest classTest = new ClassTest();
        int highest = classTest.highestInt(matrix);
    }
}
