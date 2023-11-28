package ex1.Draws;

import java.util.Scanner;

public class FootShape {
    private Foot foot;

    public void drawAsEllipse() {
        foot = new Ellipse();
    }

    public void drawAsRectangle() {
        foot = new Rectangle();
    }

    public String Draws() {
        return foot.draw();
    }

    public static void main(String[] args) {
        FootShape FootShape = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                FootShape.drawAsEllipse();
                break;
            case 2:
                FootShape.drawAsRectangle();
                break;

        }
        System.out.println(FootShape.Draws());

    }

}