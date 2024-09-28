public class StringBuffBuil {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Rudalph");
        StringBuilder stringBuilder = new StringBuilder("Gonsalves");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        stringBuffer.append("Victor");
        stringBuilder.append("Anita");

        stringBuilder.insert(3, "Valentina");

        stringBuffer.delete(2, 4);

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);


    }
}
//StringBuffer is careful and slower thread safe(syn)
//StringBuilder is faster and messy no thered safe(not syn)
