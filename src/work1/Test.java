package work1;

public class Test {
    public static void main(String[] args) {
        int a[]={19,56,25,3,45,78,100,1,0,9};
        for (int i = 0; i <a.length ; i++) {
                //升序
                for (int j = 0; j < a.length - i - 1; j++) {
                    if(i<5){
                    if (a[j] < a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                } else  {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                    }
            }
        }
        for (int i = 0; i <10 ; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
