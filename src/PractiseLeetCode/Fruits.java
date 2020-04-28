/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author kinja
 */
public class Fruits implements Comparable<Fruits> {

    private String Name;
    private int price;
    private String availabilityInWeather;

    public Fruits() {
    }

    public Fruits(String Name, int price, String availabilityInWeather) {
        this.Name = Name;
        this.price = price;
        this.availabilityInWeather = availabilityInWeather;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Fruits f) {
        if (this.getName().length() > f.getName().length()) {
            return 1;
        } else if (this.getName().length() < f.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Fruits apple = new Fruits("Apple", 3, "All");
        Fruits kiwi = new Fruits("Kiwi", 2, "Winters");
        Fruits greenApple = new Fruits("Apple", 3, "All");
        Fruits redApple = apple;
        System.out.println(kiwi.compareTo(apple));
        System.out.println(greenApple.compareTo(apple));

        System.out.println(apple.equals(greenApple));
        System.out.println(apple.equals(redApple));
        System.out.println("Fruit Kiwi has hash code: \t" + kiwi.hashCode());
        System.out.println("Fruit Apple has hash code: \t" + apple.hashCode());
        System.out.println("Fruit Green Apple  has hash code: \t" + greenApple.hashCode());
        System.out.println("Fruit Red Apple  has hash code: \t" + redApple.hashCode());

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAvailabilityInWeather() {
        return availabilityInWeather;
    }

    public void setAvailabilityInWeather(String availabilityInWeather) {
        this.availabilityInWeather = availabilityInWeather;
    }
}
