class FinalDemo {
    final int finalVar = 100;
}

class Base {
    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

final class FinalClass {}

class FinalDemoMain {
    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        System.out.println("Final Variable: " + fd.finalVar);
        Base base = new Base();
        base.finalMethod();
    }
}
