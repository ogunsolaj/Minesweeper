import java.util.*;

public class Cell {
    public void plantbomb() {
        this.bomb = true;
    }

    public void checkbomb() {
        if (this.bomb == true) {
            System.out.println("There's a bomb");
            gameover();

        }

    }
    public void gameover() {
        System.out.println("Gameover");
        System.exit(0);
    }


    private int positionx;
    private int positiony;

   private  boolean bomb;


    Cell() {
        this.bomb = false;
    }


    Cell(int x, int y) {
        this.positionx = x;
        this.positiony = y;
    }


}
















