import java.io.*;
import java.util.*;

public class Knights {
    
    private char[][] board;
    private int maxX;
    private int maxY;
    private char empty = '#';
    private char visited = '.';
    private boolean solved;
    
    public void delay(int n){
	    try {
	        Thread.sleep(n);
	    } catch (Exception e) {}
    }
    
    public Knights() {
        maxX=5;
	    maxY=5;
	    board = new char[maxX][maxY];
    }
    
    public static void main(String[] args) {
        Knights k = new Knights();
        System.out.println(k);
    }

}