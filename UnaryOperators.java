

public class UnaryOperators {
    public static void main(String[] args) {
        int var1 = 50;

        int var2=-var1;
        System.out.println(var2);

        int var3=70;
        int var4=var3++;//save then increment
        System.out.println(var4);

        int var5=80;
        int var6=++var5;//increment then save
        System.out.println(var6);

        //similar is the working for decrement operator

        boolean bool1 = true;
        System.out.println(bool1);

        boolean result = !bool1;
        System.out.print(result);
    }
}
