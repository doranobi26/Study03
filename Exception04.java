public class Exception04 {
    public static void main(String[] args) {
        try {
            Exception04.x(250, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException例外が発生");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException例外が発生");
            throw e;
        }
        System.out.println("プログラム終了");
    }

    public static void x(int y, int z) {
        System.out.println(y + " ÷ " + z + " は？");
        if (z == 0) {
            throw new ArithmeticException("引数が不正です");
        }
        int result = y / z;
        System.out.println("計算結果" + result);
    }
}