public class Test {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidNumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for(String phone : validNumber){
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println(phone + " " + isvalid);
        }
        for(String phone : invalidNumber){
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println(phone + " " + isvalid);
        }
    }
}
