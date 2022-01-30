package homeWork.patterns.prototype;

import java.util.Arrays;

public class ArrManager<T> {
    private T[] data;

    public ArrManager() {
    }

    public ArrManager<T> copy(){
        ArrManager<T> arrManagerClone = new ArrManager<>();
        arrManagerClone.setData(this.data);
        return arrManagerClone;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ArrManager{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}