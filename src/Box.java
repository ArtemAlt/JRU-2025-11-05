public class Box <T>{
    /*
    T - Type (любой тип)
    E - Element (элемент коллекции)
    K - Key (ключ)
    V - Value (значение)
    N - Number (число)
     */
    private T data;

    public Box(T data){
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public void someMethod() {
        data.toString();
    }
}
