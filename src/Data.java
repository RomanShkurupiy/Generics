public class Data<T> {
    T name;

    public Data(T name) {
        this.name = name;
    }

    public void print(T data) {

        System.out.println(name + " & " + data);
    }
}
