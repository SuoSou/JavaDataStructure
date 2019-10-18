package Utils;

public class ArraysUtils<E> {
    // 数组
    private E[] data;
    // 维护数组中的元素个数
    private int size;
    // 无参构造
    public ArraysUtils() {
        this(10);
    }
    // 有参构造
    public ArraysUtils(int capacity) {
        data = (E[])new Object[capacity];
        size = 0;
    }
    // 获取数组实际容量
    public int getSize() {
        return size;
    }
    // 获取数组容量
    public int getCapacity() {
        return data.length;
    }
    // 数组是否为空
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
    // 在制定下标处添加元素
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add methods. the index < 0 or index > size.");
        }
        if (size == data.length) {
            resize((int) (data.length * 1.5));
        }
        for (int i = size; i > index; i++) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size ++;
    }
    // 在末尾添加元素
    public void addList(E e) {
        add(size, e);
    }
    // 在首位添加元素
    public void addFirst(E e) {
        add(0, e);
    }
    // 删除元素
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("remove methods. the index < 0 or index >= size");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size --;
        if (size <= data.length / 4) {
            resize(data.length / 2);
        }
        data[size] = null; // 能让jvm垃圾回收机制快速作出反应
    }
    // 删除末尾元素
    public void removeList() {
        remove(size - 1);
    }
    // 删除首位元素
    public void removeFirst() {
        remove(0);
    }
    // 修改元素
    public void updateElement(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("updateElement methods. the index < 0 or index >= size.");
        }
        data[index] = e;
    }
    // 修改首位元素
    public void updateElementFirst(E e) {
        updateElement(0, e);
    }
    // 修改末尾元素
    public void updateElementList(E e) {
        updateElement(size - 1, e);
    }
    // 查找指定元素是否存在，返回数组下标， 没有返回-1
    public int queryElementByIndex(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    // 查找指定下标处元素, 返回元素
    public E queryElement(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("queryElement methods. the index < 0 or index >= size");
        }
        return data[index];
    }
    // 调整数组大小
    public void resize(int capacity) {
        E[] newdata = (E[])new Object[capacity];
        for (int i = 0; i < size; i++) {
            newdata[i] = data[i];
        }
        data = newdata;
    }
    // 打印输出
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("data: size: %d , capacity: %d\n", size, data.length));
        str.append("[");
        for (int i = 0; i < size; i++) {
            str.append(data[i]);
            if (i < size - 1) {
                str.append(",");
            }
        }
        str.append("]");
        return str.toString();
    }

}
