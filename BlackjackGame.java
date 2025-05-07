package com.udemy.oca;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import java.util.Random;

import java.util.Scanner;

enum Suit {

    CLUBS("♣️"),

    DIAMONDS("♦️"),

    HEARTS("♥️"),

    SPADES("♠️");

    private final String symbol;

    Suit(String symbol) {

        this.symbol = symbol;

    }

    public String getSymbol() {

        return symbol;

    }

}

enum Rank {

    TWO("2", 2),

    THREE("3", 3),

    FOUR("4", 4),

    FIVE("5", 5),

    SIX("6", 6),

    SEVEN("7", 7),

    EIGHT("8", 8),

    NINE("9", 9),

    TEN("10", 10),

    JACK("J", 10),

    QUEEN("Q", 10),

    KING("K", 10),

    ACE("A", 11);

    private final String display;

    private final int value;

    Rank(String display, int value) {

        this.display = display;

        this.value = value;

    }

    public String getDisplay() {

        return display;

    }

    public int getValue() {

        return value;

    }

}

record Card(Suit suit, Rank rank) {

    @Override

    public String toString() {

        return rank.getDisplay() + suit.getSymbol();

    }

    public int value() {

        return rank.getValue();

    }

}

public class BlackjackGame {

    private final List<Card> deck;

    private final List<Card> playerHand;

    private final List<Card> dealerHand;

    private final Random random = new Random(); // Initialization hereprivate final Random random = new Random(); //
                                                // Initialization here

    private final Scanner scanner;

    public BlackjackGame() {

        this.deck = createDeck();

        this.playerHand = new ArrayList<>();

        this.dealerHand = new ArrayList<>();

        // this.random = new Random();

        this.scanner = new Scanner(System.in);

    }

    private List<Card> createDeck() {
        List<Card> newDeck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                newDeck.add(new Card(suit, rank));
            }
        }
        System.out.println("Value of 'random' before shuffle: " + this.random); // Add this line
        Collections.shuffle(newDeck, this.random); // Explicitly use the instance field
        return newDeck;
    }

    private Card dealCard() {

        if (!deck.isEmpty()) {

            return deck.remove(0);

        }

        return null;

    }

    private int calculateHandValue(List<Card> hand) {

        int value = 0;

        int aceCount = 0;

        for (Card card : hand) {

            value += card.value();

            if (card.rank() == Rank.ACE) {

                aceCount++;

            }

        }

        while (value > 21 && aceCount > 0) {

            value -= 10;

            aceCount--;

        }

        return value;

    }

    public void dealInitialCards() {

        for (int i = 0; i < 2; i++) {

            playerHand.add(dealCard());

            dealerHand.add(dealCard());

        }

    }

    public void displayHands(boolean hideDealerSecondCard) {

        System.out.println("\nYour hand: " + playerHand + " (" + calculateHandValue(playerHand) + ")");

        System.out.print("Dealer's hand: ");

        if (hideDealerSecondCard) {

            System.out.println(dealerHand.get(0) + ", ?");

        } else {

            System.out.println(dealerHand + " (" + calculateHandValue(dealerHand) + ")");

        }

    }

    public boolean hit(List<Card> hand) {

        Card card = dealCard();

        if (card != null) {

            hand.add(card);

            return true;

        }

        return false;

    }

    public void play() {

        dealInitialCards();

        displayHands(true);

        while (true) {

            System.out.print("Hit (h) or Hold (hld)? ");

            String action = scanner.nextLine().toLowerCase();

            if (action.equals("h")) {

                hit(playerHand);

                displayHands(true);

                if (calculateHandValue(playerHand) > 21) {

                    System.out.println("Bust! You lose.");

                    displayHands(false);

                    return;

                }

            } else if (action.equals("hld")) {

                break;

            } else {

                System.out.println("Invalid action. Please enter 'h' or 'hld'.");

            }

        }

        System.out.println("\nDealer's turn...");

        displayHands(false);

        while (calculateHandValue(dealerHand) < 17) {

            System.out.println("Dealer hits.");

            hit(dealerHand);

            displayHands(false);

            if (calculateHandValue(dealerHand) > 21) {

                System.out.println("Dealer busts! You win.");

                return;

            }

        }

        int playerValue = calculateHandValue(playerHand);

        int dealerValue = calculateHandValue(dealerHand);

        System.out.println("\nFinal hands:");

        displayHands(false);

        if (playerValue > dealerValue || dealerValue > 21) {

            System.out.println("You win!");

        } else if (playerValue < dealerValue) {

            System.out.println("Dealer wins!");

        } else {

            System.out.println("It's a push!");

        }

        scanner.close();

    }

    public static void main(String[] args) {

        BlackjackGame game = new BlackjackGame();

        game.play();

    }

}