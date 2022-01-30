package homeWork.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Integer[] mass = new Integer[]{1, 2, 3};
        ArrManager<Integer> arr = new ArrManager<>();
        arr.setData(mass);
        System.out.println("Real arr is - " + arr);
        ArrManager<Integer> arrCopy = arr.copy();
        System.out.println("Copy of arr is - " + arrCopy);
    }
}
