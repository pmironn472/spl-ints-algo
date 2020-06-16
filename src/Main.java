import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> listOfWishes = new ArrayList<>(Arrays.asList("Spaghetti,2",
                "Pepper,5",
                "Water,2"));

        // STORE OFFERS
        List<String> listOfOffers = new ArrayList<>(Arrays.asList("Spaghetti,10.00",
                "Sugar,5.00",
                "Water,2.50"));

        // CLIENT FULFILLED WISHES
        List<String> listOfPurchases = getPurchases(listOfWishes, listOfOffers);


        print(listOfPurchases);
        System.out.println();
        System.out.println();
        List<String> listOfPurchases1 = getPurchases(listOfWishes, listOfOffers);

        print(listOfPurchases1);
    }


    static ArrayList<String> getPurchases(List<String> listOfWishes, List<String> listOfOffers) {
        ArrayList<String> listOfPurchases = new ArrayList<>();


        for (String s :
                listOfWishes) {
            String wish = s.substring(0, s.indexOf(","));
            String[] wishess = s.split(",", 0);
            int qty = Integer.parseInt(Arrays.toString(wishess).replaceAll("[^0-9]", ""));


            for (String p :
                    listOfOffers) {
                String offer = p.substring(0, p.indexOf(","));
                String[] offerss = p.split(",", 0);
                double price = Integer.parseInt(Arrays.toString(offerss).replaceAll("[^0-9]", ""));


                if (wish.contains(offer)) {
                    listOfPurchases.add(wish + ',' + qty + '=' + (qty * (price / 100)));
                }
            }

        }
        return listOfPurchases;
    }

    static ArrayList<String> getAllPurchases(List<String> listOfWishes, List<String> listOfOffers) {
        ArrayList<String> listOfPurchases1 = new ArrayList<>();


        for (String s :
                listOfWishes) {
            String wishes = s.substring(0, s.indexOf(","));
            int qty = Integer.parseInt(s.substring(s.indexOf(",") + 1));


            for (String p :
                    listOfOffers) {

                String offers = p.substring(0, p.indexOf(","));
                double price = Integer.parseInt(p.substring(p.indexOf(",") + 1));



                if (wishes.contains(offers)) {
                    listOfPurchases1.add(wishes + ',' + qty + '=' + (qty * price));
                }
            }

        }
        return listOfPurchases1;
    }


    static void print(List<String> listOfPurchase) {
        for (String purchase :
                listOfPurchase) {
            System.out.println(purchase);
        }
    }


}
