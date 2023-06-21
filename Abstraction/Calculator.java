package Abstraction;

public class Calculator implements Operations {
    @Override
    public void add(int a, int b) {
        int add = a+b;
    }

    @Override
    public void sum(int a, int b) {
          int sum = a-b;
    }

    @Override
    public void mul(int a, int b) {
        int mul = a*b;
    }

    @Override
    public void div(int a, int b) {
     int div = a/b;
    }
}
