package Buoi2.Shape1;

public class triangle {
    String sound = "triangle.aif";

    public triangle(String sound) {
        this.sound = sound;
    }

    void rotate() {
        System.out.println("Xoay 360 độ");
    }

    void playSound() {
        System.out.println("Play sound: " + this.sound + " music");
    }
}
