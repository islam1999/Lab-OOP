package ru.mirea.Lab3;

public class Tarelka extends Dish {
    private String razmer;

    public String getRazmer() {
        return razmer;
    }

    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }

    public Tarelka(String material, String color, String razmer) {
        super(material, color);
        this.razmer = razmer;
    }

    @Override
    public String toString() {
        return "Tarelka{" +
                "razmer='" + razmer + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
