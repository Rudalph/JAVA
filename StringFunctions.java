class StringFunctions {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 ="Rudalph";
        String str3 ="AABBAABBAAABBBAA";

        System.out.println(str1.length());
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.charAt(2));
        System.out.println(str1.compareTo(str2));//difference between ascii code
        System.out.println(str1.startsWith("Hel"));
        System.out.println(str1.endsWith("olp"));
        System.out.println(str3.indexOf("BB"));
        System.out.println(str3.lastIndexOf("BB"));
        System.out.println(str1.replace("He", "Rudalph"));
        System.out.println(str1.substring(0, 3));

        String str4 = "I-am-anthong-gonsalves";
        String [] arr = str4.split("-");
        for(String sp: arr)
        {
            System.out.println(sp);
        }

        String str5 = "lots of spaces";
        System.out.println(str5.trim());
    }
}