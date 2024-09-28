import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Mumbai");
        cityList.add("Kolkata");
        cityList.add("Ahemdabad");
        
        System.out.println(cityList);

        cityList.add(2,"Rudalph");
        cityList.remove(2);

        for(String city: cityList)
        {
            System.out.println(city);
        }
    }
}
