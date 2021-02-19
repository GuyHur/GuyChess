package Game;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import java.util.LinkedList;

import javax.swing.JPanel;

import Pieces.Piece;




@SuppressWarnings("serial")
public class Board extends Jpanel implements  MouseListener, MouseMotionListener{

    //assets
    private static final String WHITE_ROOK = "white_rook.png";
    private static final String WHITE_KNIGHT = "white_knight.png";
    private static final String WHITE_BISHOP = "white_bishop.png";
    private static final String WHITE_QUEEN = "white_queen.png";
    private static final String WHITE_KING = "white_king.png";
    private static final String WHITE_PAWN = "white_pawn.png";

    //black pieces
    private static final String BLACK_ROOK = "black_rook.png";
    private static final String BLACK_KNIGHT = "black_knight.png";
    private static final String BLACK_BISHOP = "black_bishop.png";
    private static final String BLACK_QUEEN = "black_queen.png";
    private static final String BLACK_KING = "black_king.png";
    private static final String BLACK_PAWN = "black_pawn.png";
    // end-assets

    private final Square[][] board;
    private final GameWindow g;

    public final LinkedList<Piece> Bpieces;
    public final LinkedList<Piece> Wpieces;
    public List<Square> movable;

    private boolean whiteTurn;

    private Piece currentPiece;
    private int currX;
    private int currY;

    public Board(GameWindow g){
        this.g = g;
        board = new Square[8][8];
        Bpieces = new LinkedList<Piece>();
        Wpieces = new LinkedList<Piece>();
        setLayout(new GridLayout(8,8,0,0));
        this.addMouseListen(this);
        this.addMouseMotionListener;

    }
    for(int x = 0; x < 8; x++){
        for(int y =0; y < 8; y++){
            int xMod = x % 2;
            int yMod = y % 2;

            if((xMod == 0 && yMod == 0) || (xMod == 1 && yMod == 1)){
                board[x][y] = new Square(this, 1, x, y);
                this.add(board[x][y]);
            }
            else{
                board[x][y] = new Square(this, 0, x, y);
                this.add(board[x][y]);
            }
        }
    }



}
