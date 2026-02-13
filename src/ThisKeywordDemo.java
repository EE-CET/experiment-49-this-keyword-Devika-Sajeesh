import java.util.Scanner;

class ThisDemo {
    int value;

    public void setValue(int value) {
        this.value = value; // Use 'this' to refer to the instance variable
    }
    
    // TODO: Define display() to print "Value: " + value
    public void display() {
        System.out.println("Value: " + this.value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        ThisDemo demo = new ThisDemo(); // Create ThisDemo object
        demo.setValue(input); // Call setValue() with the input
        demo.display(); // Call display()        
        
    }
}
