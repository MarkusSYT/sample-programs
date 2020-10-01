class Singleton {
    public static void main(String[] args) {
        Example single = Example.getInstance();
    }
}

class Example {
    private static Example MyInstance;
    private Example() {}

    public static Example getInstance(){
        if(MyInstance == null){
            MyInstance = new Example();
        }
        return MyInstance;
    }
}