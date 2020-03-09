package gt.com.celera;

public class ResponseClass {
    private String greeting;

    public ResponseClass(String greetings) {
        this.greeting = greetings;
    }
    
    public ResponseClass() {

    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}