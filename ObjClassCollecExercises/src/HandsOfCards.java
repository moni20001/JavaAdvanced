import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<String, HashSet<String>> map = new LinkedHashMap<>();
        while (!line.equals("JOKER")) {
            HashSet<String> cards = new HashSet<>();
            String[] arr = line.split(":\\s+");
            String name = arr[0];
            String cardsAll = arr[1];
            String[] allCards = cardsAll.split(",\\s+");
            Collections.addAll(cards, allCards);
            if (!map.containsKey(name)) {
                map.put(name, cards);
            } else {
                HashSet<String> cardsTemp = map.get(name);
                cardsTemp.addAll(cards);
                map.put(name, cardsTemp);
            }
        line=scan.nextLine();
        }
        //end of while
        Map<String,Integer> answer = new LinkedHashMap<>();

        for (Map.Entry entry : map.entrySet()) {
            String name = entry.getKey().toString();
            Object cards = entry.getValue();
            String[] all = cards.toString().replace('[',Character.MIN_VALUE).replace(']',Character.MIN_VALUE).split(", ");
            int toAdd = 0;
            for (int i = 0; i < all.length; i++) {
              String card = all[i].trim();
              int cardPower = 0;
              int multiply = 0;
              if(card.length() == 3){
                  cardPower = 10;
              }
              else if(Character.isDigit(card.charAt(0))){
                  cardPower = Integer.parseInt(card.substring(0,1));
              }
              else{
                  cardPower = getCardPowerFace(card.charAt(0));
              }
              multiply = getMultiply(card.charAt(card.length()-1));
              toAdd += cardPower*multiply;
            }
            if(!answer.containsKey(name)){
                answer.put(name,0);
            }
            if(answer.containsKey(name)){
                int val = answer.get(name);

                answer.put(name,toAdd);
            }
        }


        for(Map.Entry ent : answer.entrySet()){
            System.out.printf("%s: %s\n",ent.getKey(),ent.getValue());
        }
    }

    public static int getCardPowerFace(char c) {
        int cardPower =0;
        switch (c) {
            case 'J':
                cardPower = 11;
                break;
            case 'Q':
                cardPower = 12;
                break;
            case 'K':
                cardPower = 13;
                break;
            case 'A':
                cardPower = 14;
                break;
        }
        return cardPower;
    }

    public static int getMultiply(char c) {
        int multiply = 0;
        switch (c) {
            case 'S':
                multiply = 4;
                break;
            case 'H':
                multiply = 3;
                break;
            case 'D':
                multiply = 2;
                break;
            case 'C':
                multiply = 1;
                break;
        }
        return multiply;
    }
}
