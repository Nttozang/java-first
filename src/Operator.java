public class Operator{
    public static void main(String[] args) {
        // Execute method
        arithmetic();
        relational();
        logical();
        bitwise();
        assignment();
        unary();
        ternary();
    }
    public static void arithmetic() {
        var add = 10 + 10;
        var minus =  10 - 10;
        var multiply =  10 * 10;
        var divide =  10 / 10;
        var modulo = 89 % 10; // 9
    }

    public static void relational() {
        // relation or comparison
        var isEqual = 10 == 10;
        var isNotEqual = 10 != 10;
        var isGreaterThan = 25 > 10;
        var isGreaterThanEqual = 25 >= 25;
        var isLessThan = 25 < 10;
        var isLessThanEqual = 25 <= 25;
    }

    public static void logical() {
        // AND, OR, NOT
        // AND - both of them true = true
        var score = 85;
        var isScoreGreaterThanEqualZero = score >= 0;
        var isScoreLessThanHundred = score <= 100;
        var isInGradeScore = isScoreGreaterThanEqualZero && isScoreLessThanHundred;
        // OR - Either of them true = true
        var day = 23;
        var isGoToMall = (day >= 5 && day <= 10) || (day >= 20 && day <= 25);

        // Java Short circuit
        // AND - Left is FALSE => FALSE
        // OR - Left is TRUE => TRUE

        // NOT
        var isEnabled = !true; // false
    }

    public static void bitwise() {
 // 4 bit 2^4 = 16 =(0-15)
        // & AND
        var a = 7; // 0111
        var b = 3; // 0011
        //System.out.println(a & b);
        // | OR
        //System.out.println(a | b);
        // ^ XOR
        //System.out.println(a ^ b);
        // ~ Complement
        //System.out.println(~a);
        //System.out.println(~b);
        // << left shift
        // >> right shift
}
    public static void assignment() {
        // assign value to variable
        var day = 25;
        // Combination arithmetic + assignment
        var amount = 20;
        amount += 10; // amount = amount + 10;
        System.out.println(amount);
    }

    public static void unary() {
        // Incremental / Decremental
        // ++, --
        // in front - do operation before execution of variable
        // in back - do operation after execution of variable
        var day = 10;
        day++;
        System.out.println(day); // day = 11
        day--;
        System.out.println(day); // day = 10

        var score = 100;
//        System.out.println(STR."Incremental: \{++score}"); // score = 101
        System.out.println(score); // score = 100
        // score = 101 starting from this line
        System.out.println(score);
    }

    public static void ternary() {
        // If-Else
        var score = 85;
        // Consider PASS / NOT_PASS
//        if (score >= 80) {
//            PASS
//        } else {
//            NOT_PASS
//        }
        var grade = score >= 80 ? "PASS" : "NOT_PASS";
        System.out.println(grade);
    }
}
