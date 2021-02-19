package Game;

import Pieces.Piece

public abstract class Square {
    int squareCord;

    Square(int squareCord){
        this.squareCord = squareCord;
    }
    public abstract boolean isSquareOccupied();

    public abstract Piece getPiece();

    public static final class EmptySquare extends Square{
        EmptySquare(int squareCord){
            super(squareCord);
        }
        @Override
        public boolean isSquareOccupied(){
            return false;
        }

        @Override
        public Piece getPiece(){
            return null;
        }

    }

    public static final class OccupiedSquare extends Square{
        Piece pieceOnSquare;

        OccupiedSquare(int squareCord, Piece pieceOnSquare){
            super(squareCord);
        }
        @Override
        public boolean isSquareOccupied(){
            return true;
        }

        @Override
        public Piece getPiece(){
            return this.pieceOnSquare;
        }

    }
}
