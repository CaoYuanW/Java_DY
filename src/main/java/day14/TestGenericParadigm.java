package day14;

public class TestGenericParadigm {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>();
        p1.name = "Tom";
        System.out.println(p1.name);

        TestGenericParadigm.method("Bob");

        Plane plane = new Plane();
        Swallow<String> swallow = new Swallow<>();
    }

    // 泛型方法
    public static <T> void method(T t) {
        System.out.println(t);
    }


}

// 泛型类
class Person<T> {
    T name;
}



class Plane implements Fly<String>{

    @Override
    public void fly() {
        System.out.println("plane fly");
    }
}


class Swallow<A> implements Fly<A>{

    @Override
    public void fly() {

    }
}


// 泛型接口
interface Fly<A>{
    void fly();
}