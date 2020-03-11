public class ClassnameExampleTest {
    private static ClassnameExample classnameExample;
    private static final String[] validClassname = new String[] {"C0318G"};
    private static final String[] invalidClassname = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        classnameExample = new ClassnameExample();
        for(String name : validClassname){
            boolean isvalid = classnameExample.validate(name);
            System.out.println("Name is" + name + " is valid: " + isvalid);
        }
        for(String name : invalidClassname){
            boolean isvalid = classnameExample.validate(name);
            System.out.println("Name is " + name + " is valid: " + isvalid);
        }
    }
}
