package Chp7;

class MyStack<T> implements IStack<T> {
    int top;
    Object[] stack;
    public MyStack() {
        top = 0;
        stack = new Object[10];
    }

    @Override
    public T pop() {
        if (top == 0) return null;
        top--;
        return (T)stack[top];
    }

    @Override
    public boolean push(T t) {
        if (top == stack.length) return false;
        stack[top++] = t;
        return true;
    }
}

public class Ex09 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<>();
        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (true) {
            Integer n = stack.pop();
            if(n == null) break;
            System.out.print(n + " ");
        }
    }
}
