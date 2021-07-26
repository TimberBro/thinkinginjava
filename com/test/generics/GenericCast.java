package com.test.generics;

class FixedSizeStack<T> {
  private int index = 0;
  private Object[] storage;

  public FixedSizeStack(int size) {
    storage = new Object[size];
  }

  public void push(T item) {
    storage[index++] = item;
  }

  @SuppressWarnings("unchecked")
  public T pop() {
    return (T) storage[--index];
  }
}

public class GenericCast {
  public static final int SIZE = 10;

  public static void main(String[] args) {
    FixedSizeStack<String> strings = new FixedSizeStack<String>(SIZE);
    try {
      for (String s : "A B C D E F G H I J K".split(" ")) {
        strings.push(s);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      for (int i = 0; i < SIZE + 1; i++) {
        String s = strings.pop();
        System.out.print(s + " ");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
