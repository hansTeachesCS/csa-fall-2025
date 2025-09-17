import processing.core.PApplet;

public class Sketch extends PApplet {

    int letter = 65;
    int screen = 1;

    public void settings() {
        size(600, 600);
    }

    public void setup() {
    }

    public void draw() {
        background(220);

        if (screen == 1) {
            fill(0);
            textSize(48);
            text("Choose the Key", 150, 250);
            text("A → ", 250, 300);
            String l = String.valueOf((char)letter);
            text(l, 325, 300);

            noFill();
            strokeWeight(5);
            rect(135, 200, 340, 115);

            textSize(20);
            text("Press the right arrow to change the letter selection", 95, 340);
            text("Press enter to continue", 220, 365);
        }
    }

    public void keyPressed() {
        if (keyCode == RIGHT) {
            letter++;
            if (letter > 90) {
                letter = 65;
            }
        } else if (keyCode == ENTER) {
            screen++;
        }
    }

}
