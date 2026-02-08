import java.util.*;

public class Main {
    private static Map<String, String> fillMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Washington", "Trump");
        map.put("London",     "Holmes");
        map.put("Kiev",       "Zelensky");
        map.put("Kharkiv",    "Sapronov");
        map.put("Odessa",     "Deliev");

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = fillMap();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введіть місто або натисніть клавішу \"S\", щоб завершити програму: ");
        String city = scanner.next();

        while (!city.equalsIgnoreCase("S")) {
            String lastName = map.get(city);
            System.out.println( (lastName != null) ? lastName : "В даному місті ніхто не знайдений. Будь ласка, повторіть спробу!" );

            System.out.println();
            System.out.print("Введіть місто або натисніть клавішу \"S\", щоб завершити програму: ");
            city = scanner.next();

        }
    }
}