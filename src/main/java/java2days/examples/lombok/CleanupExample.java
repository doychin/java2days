package java2days.examples.lombok;

import lombok.Cleanup;

public class CleanupExample {
    public static void main(String[] args) {
        @Cleanup("dispose") RAllocator allocator = new RAllocator();
        allocator.doSomethingWithResource();
    }
}

class RAllocator {
    void doSomethingWithResource() {}
    void dispose() {}
}
