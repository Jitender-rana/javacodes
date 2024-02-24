class Try3 {
    int a, b;

    Try3(int x, int y) {
        this.a = x; // Use 'this' to explicitly assign to instance variables
        this.b = y;
    }

    Try3(Try3 T) {
        this.a = ++T.a; // Use pre-increment for updated values
        this.b = ++T.b;
    }

    void display() {
        System.out.println("the value of a is: " + a + " and b is:" + b);
    }

    public static void main(String[] args) {
        Try3 t1 = new Try3(5, 6);
        t1.display();
        Try3 t2 = new Try3(t1);
        t1.display(); // Output: the value of a is: 5 and b is:6
        t2.display(); // Output: the value of a is: 6 and b is:7
    }
}