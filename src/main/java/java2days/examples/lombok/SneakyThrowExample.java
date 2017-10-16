package java2days.examples.lombok;

import lombok.SneakyThrows;

public class SneakyThrowExample {

    public static void main(String[] args) {
        new SneakyThrowExample();
    }

    @SneakyThrows
    public SneakyThrowExample() {
        throw new Exception();
    }
}
