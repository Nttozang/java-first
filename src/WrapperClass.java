public class WrapperClass{
    public static void main(String[] args){
        byte a = 127;

        Byte useByte = a;
        System.out.println(useByte);

        short b = 100;
        Short useShort = b;
        System.out.println(useShort);
        int c = 100;
        Integer useInt = c;
        System.out.println(useInt);

        long d = 100L;

        double e = 25.00;
        float f = 25.00f;

        Character grade = 'S';
        Character.isLetterOrDigit(grade);
        System.out.println(Character.isLetterOrDigit(grade));
        Boolean isUse = true;
        parseTechnique();

    }

    public static void parseTechnique(){
        Integer operand1 = Integer.parseInt("500");
        Integer operand2 = Integer.parseInt("100");
        System.out.println(operand1 + operand2);
    }
}
