package work2;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //打印第一个三角形前面的空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //打印上面三角形
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            //打印下面三角形前面的空格
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //打印下面的星星
            for (int j = 1; j <= 9 - 2 * i; j++) {
                if (j==1||j== 9 - 2 * i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            //下面三角形换行
            System.out.println();
        }
    }
}
