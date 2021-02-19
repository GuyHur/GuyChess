package Pieces;

import Game.Player;

import java.lang.reflect.Type;

public abstract class Piece {
    enum color{white, black}

    public void capture(){

    }
    public void captured(){

    }
    public Piece(int x, int y, Player player){

    }

    public abstract Type getType();



}
