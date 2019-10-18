package Tests;

import Utils.ArraysUtils;

public class TestMain {
    public static void main(String[] args) {
        ArraysUtils<Integer> arraysUtils = new ArraysUtils<>();
        for (int i = 0; i < 10; i++) {
            arraysUtils.addList(i);
        }
        System.out.println(arraysUtils.toString());
        arraysUtils.add(10, 10);
        System.out.println(arraysUtils.toString());
        arraysUtils.addFirst(11);
        System.out.println(arraysUtils.toString());
        arraysUtils.remove(0);
        System.out.println(arraysUtils.toString());
        arraysUtils.removeList();
        arraysUtils.removeList();
        arraysUtils.removeList();
        arraysUtils.removeList();
        System.out.println(arraysUtils.toString());
        arraysUtils.removeFirst();
        arraysUtils.removeFirst();
        arraysUtils.removeFirst();
        arraysUtils.removeFirst();
        System.out.println(arraysUtils.toString());
        Integer integer = arraysUtils.queryElement(0);
        System.out.println(integer);
        System.out.println(arraysUtils.queryElementByIndex(3));
        System.out.println(arraysUtils.queryElementByIndex(10));
        arraysUtils.updateElement(0, 10);
        System.out.println(arraysUtils.toString());
        arraysUtils.updateElementList(11);
        System.out.println(arraysUtils.toString());
        arraysUtils.updateElementFirst(12);
        System.out.println(arraysUtils.toString());
        System.out.println("hello word;");
    }

}
