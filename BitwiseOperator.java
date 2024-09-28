public class BitwiseOperator {
    public static void main(String[] args) {
        byte v1 = 12;
        byte v2 = 10;

        System.out.println(v1+ " & " +v2 );

        System.out.println(v1&v2);
        System.out.println(v1|v2);
        System.out.println(v1<<v2);
        System.out.println(v1>>v2);
        System.out.println(~v2);
        System.out.println(v1^v2);

    }
}

//Bitwise operation is used in low level of programming
//Eg: Error detection and correction 
