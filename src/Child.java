public class Child extends Parent {

    @Override
    public Integer getValue() {
        return 2;
    }

    public void process(Integer data) {
        System.out.println(data);
    }

     public void process(String data) {
        System.out.println(data);
    }

}
