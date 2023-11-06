package org.example;

import java.util.*;

/**
 * Class for phonebook
 *
 * @author Hana Mahmutović
 */
public class Imenik {

    private Map<String, TelefonskiBroj> numbers;

    public Imenik() {
        this.numbers = new HashMap<String,TelefonskiBroj>();
    }

    public Map<String, TelefonskiBroj> getNumbers() {
        return numbers;
    }

    public void setNumbers(Map<String, TelefonskiBroj> numbers) {
        this.numbers = numbers;
    }

    /**
     * Adds a number to the directory
     * @param name - the owner of the number
     * @param number - phone number mob, landline, international
     */
    public void add(String name, TelefonskiBroj number) {
        this.numbers.put(name, number);
    }

    /**
     * Returns the phone number of the person named name in the form of a string by calling the print() method of the PhoneNumber class
     * @param name
     * @return
     */
    public String getNumber(String name) {
        TelefonskiBroj number = this.numbers.get(name);
        if (number != null) {
            return number.ispisi();
        } else {
            return null;
        }
    }

    /**
     * returns the name of the person whose phone number is a number - and this operation should use a HashMam
     * @return
     */
    public String getName(TelefonskiBroj number) {
        for (Map.Entry<String, TelefonskiBroj> entry : this.numbers.entrySet()) {
            if (entry.getValue().ispisi().equals(number.ispisi())) { // use print to compare numbers
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * returns all numbers in the phonebook for people whose name starts with the letter s in the format:
     * <p>
     * 1. Name Surname - number
     * 2. Name Surname - number
     * ...         *
     * @param c
     * @return
     */
    public String onLetter(char c) {
        StringBuilder builder = new StringBuilder();

        int counter = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : this.numbers.entrySet()) {
            if (entry.getKey().startsWith(String.valueOf(c))) {
                builder.append(counter) // use string builder to avoid memory overload
                        .append(". ")
                        .append(entry.getKey())
                        .append(" - ")
                        .append(entry.getValue().ispisi())
                        .append(System.lineSeparator());
            }
            counter++;
        }
        return builder.toString();
    }

    /**
     * returns a set of Strings containing the first and last names of all persons living in city c (of the same enumerated type given in the FixedNumber class),
     * which can be found out if the person has a landline phone number in that city. In doing so, the set should be sorted alphabetically.
     * @param c
     * @return
     */
    public Set<String> fromCity(Grad c) {
        Set<String> results = new TreeSet<String>(); // tree set impl should sort automatically
        for (Map.Entry<String, TelefonskiBroj> entry : this.numbers.entrySet()) {
            if (isFromCity(entry.getValue(), c)) {
                results.add(entry.getKey());
            }
        }
        return results;
    }

    /**
     * returns numbers for people from the city c. This set should be sorted by the string obtained by the print() method.
     * @param c
     * @return
     */
    public Set<TelefonskiBroj> fromCityNumbers(Grad c){
        Set<TelefonskiBroj> results = new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return o1.ispisi().compareTo(o2.print());
            }
        });

        for (Map.Entry<String, TelefonskiBroj> entry : this.numbers.entrySet()) {
            if (isFromCity(entry.getValue(), c)) {
                results.add(entry.getValue());
            }
        }

        return results;
    }

    private boolean isFromCity(TelefonskiBroj number, Grad c) {
        if (number instanceof FiksniBroj) {
            return c.equals(((FiksniBroj) number).getGrad());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int counter = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : this.numbers.entrySet()) {
            builder.append(counter) // use string builder to avoid memory overload
                    .append(". ")
                    .append(entry.getKey())
                    .append(" - ")
                    .append(entry.getValue().ispisi())
                    .append(System.lineSeparator());
            counter++;
        }
        return builder.toString();
    }
}