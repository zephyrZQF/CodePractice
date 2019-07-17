package dajiao.session1;
/*
1、如果没顾客，那就不卖

2、来了N个顾客，要按顺序卖，不卖的客户也要告诉他不卖（卖0）。

3、单个卖的逻辑在 sell0 实现。

4、如果超过50个，只卖50个。

5、如果需求小于0个，sell0 抛出异常，在 sell 捕获异常并登记为不卖（卖0）。

5、在控制台打印出最终这批卖出去多少个。术语：xxx总共卖出去N个。

6、实现自己的打印数组函数。格式: [1,2,3,4,5];
*/


import java.util.ArrayList;
import java.util.Scanner;

public class SessionWatermelon {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<Integer> buyList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("收摊请输入Q");
        while (true) {
            String input = in.next();

            if(input.equals("Q")){
                Integer[] arr = new Integer[buyList.size()];
                arr = (Integer[]) buyList.toArray(arr);
                print(arr);
                System.out.println("共卖出："+count);
                break;
            }
            int buyNum = 0;
            try{
                buyNum = sell0(Integer.valueOf(input));
            }catch (Exception e){
                System.out.println(e);
            }

            count += buyNum;
            buyList.add(buyNum);

        }
    }

    private static int sell0(int buyNum){
        if(buyNum < 0){
            throw new IllegalArgumentException("buyNum must not be negative: " + buyNum);
        }
        if(buyNum > 50){
            return 50;
        }
        return buyNum;
    }

    private static void print(Integer[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(Integer i : arr){
            sb.append(i);
            sb.append(',');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        System.out.println(sb.toString());
    }
}
