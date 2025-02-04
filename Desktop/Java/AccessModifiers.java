class BaseClass {
    int privateVar = 10;
    protected int protectedVar = 20;
}

class DerivedClass extends BaseClass {
    void showAccess() {
        System.out.println("Protected Variable: " + protectedVar);
    }
}

class AccessModifiers {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.showAccess();
    }
}
