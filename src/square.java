public class square {
    public static void main(String[] args) {
        int result = square(12);
        System.out.println(result);
    }

    public static int square(int num) {
        num *= num;
        return num;
    }
}
