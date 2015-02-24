import java.io.*;
import java.util.*;

public class MakeLake {

    private int[][] board; // actual game board
    private int maxrow;
    private int maxcol;
    private int size = maxrow * maxcol; // total number of spaces on board
    private Random random = new Random();

    public MakeLake() {
        maxrow = 4;
	maxcol = 6;
	board = new int[maxrow][maxcol];
	int num = 0;
