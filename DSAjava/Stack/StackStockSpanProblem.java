package DSAjava.Stack;

import java.util.Stack;

public class StackStockSpanProblem {

    public static int[] calculateSpan(int price[], int n) {
        price[0] = 1;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<n;i++)
        {
            while (!stack.isEmpty()&&price[stack.peek()]<=price[i]) {
                stack.pop();
            }
            price[i]=((stack.isEmpty()) ? (i+1):(i+stack.peek()));
            stack.push(i);
        }
        return price;

    }

    public static void main(String args[]) {
        int price[] = { 100, 80, 60, 70, 60, 75, 85 };
        int n = price.length;
        int span[] = calculateSpan(price, n);
        for (int a : span) {
            System.out.println(a);
        }

    }
}

// System.out.println("A -> "+!stack.isEmpty());
// System.out.println("B -> "+(price[stack.peek()] <= price[i]));
// System.out.println("Pop -> "+stack.peek()); // Pop hone se pehle value print
// karo
// System.out.println("Loop Run -> "+(j++));
// System.out.println(price[i] + " ");