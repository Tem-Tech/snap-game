import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    protected ArrayList<Card> deckOfCards;
    protected String name;

    public CardGame(String name) {
        this.name = name;
        deckOfCards = new ArrayList<>();
        createDeck();
    }

    private void createDeck() {
        String[] suits = {"\u2660", "\u2663", "\u2665", "\u2666"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit : suits) {
            for (int i = 0; i < symbols.length; i++) {
                deckOfCards.add(new Card(suit, symbols[i], values[i]));
            }
        }
    }

    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }}