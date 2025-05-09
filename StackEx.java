/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class StackEx {
    int maxSize = 5;
    int[] stack = new int[maxSize];
    int top = -1;

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full (Overflow)");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty (Underflow)");
        } else {
            System.out.println(stack[top] + " popped from stack.");
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackEx s = new StackEx();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
   
