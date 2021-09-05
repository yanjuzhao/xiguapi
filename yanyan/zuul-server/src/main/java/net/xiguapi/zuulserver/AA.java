package net.xiguapi.zuulserver;

public class AA {
    public static void main(String[] args) {

        int start = 1;
        int end = 1000;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(start + "到" + end + "的和是：" + sum);

    }
}
