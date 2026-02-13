public class NumberBox<T extends Number> {
    /*
    T - Type (любой тип)
    E - Element (элемент коллекции)
    K - Key (ключ)
    V - Value (значение)
    N - Number (число)
     */
    T data;

    public NumberBox(T data) {
        this.data = data;
    }

    public void  someMethod2() {
        data.floatValue();
    }


}
