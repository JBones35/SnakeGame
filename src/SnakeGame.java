import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JPanel {
    int boardWith;
    int boardHeight;

    Tile snakeHead;

    SnakeGame(int boardWith,int boardHeight){
        this.boardWith = boardWith;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWith,this.boardHeight));
        setBackground(Color.BLACK);
        snakeHead = new Tile(5,5);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    private class Tile {
        int x;
        int y;
        Tile(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
    }

