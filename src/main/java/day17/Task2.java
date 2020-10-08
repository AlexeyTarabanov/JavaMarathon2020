package day17;

import java.util.Arrays;

/**
 * 2. Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY.
 * Эта “фигура” будет обозначать пустое пространство на шахматной доске. Ценность этой фигуры равна -1,
 * а строковое обозначение равно нижнему подчеркиванию ("_").
 * Затем создайте класс Шахматная доска (англ. ChessBoard).
 * Этот класс в единственном аргументе конструктора должен принимать на вход двумерный массив шахматных фигур.
 * Этот двумерный массив задает конфигурацию фигур на шахматной доске.
 * Пустое пространство на шахматной доске задается с помощью значения EMPTY.
 * Также, у класса ChessBoard должен быть реализован метод print(), который выводит шахматную доску в консоль.
 * В методе main() класса Task2 создайте новый объект класса ChessBoard, передав ему в качестве аргумента двумерный массив
 * с расположением фигур как на картинке ниже (матч Крамник - Каспаров 2000 года).
 * Затем, используя метод print() выведите шахматную доску в консоль, используя строковые обозначения шахматных фигур.
 * Вывод в консоль должен быть таким:
 *
 * ♜____♜♚_
 * _♖__♟♟_♟
 * ♟_♞___♟_
 * ♛__♗____
 * ___♝♙___
 * ____♗♙__
 * ♙__♕_♙_♙
 * _____♖♔_
 * */

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[] white = new ChessPiece[8];
        ChessPiece[] black = new ChessPiece[8];

        ChessPiece[][] chessPieces = new ChessPiece[white.length][black.length];
        ChessBoard chessBoard = new ChessBoard(chessPieces);

        for (int i = 0; i < chessPieces.length; i++) {
            Arrays.fill(chessPieces[i], ChessPiece.EMPTY);
        }

        chessPieces[0][0] = ChessPiece.ROOK_BLACK;
        chessPieces[0][5] = ChessPiece.ROOK_BLACK;
        chessPieces[0][6] = ChessPiece.KING_BLACK;

        chessPieces[1][1] = ChessPiece.ROOK_WHITE;
        chessPieces[1][4] = ChessPiece.PAWN_BLACK;
        chessPieces[1][5] = ChessPiece.PAWN_BLACK;
        chessPieces[1][7] = ChessPiece.PAWN_BLACK;

        chessPieces[2][0] = ChessPiece.PAWN_BLACK;
        chessPieces[2][2] = ChessPiece.KNIGHT_BLACK;
        chessPieces[2][6] = ChessPiece.PAWN_BLACK;

        chessPieces[3][0] = ChessPiece.QUEEN_BLACK;
        chessPieces[3][3] = ChessPiece.BISHOP_WHITE;

        chessPieces[4][3] = ChessPiece.BISHOP_BLACK;
        chessPieces[4][4] = ChessPiece.PAWN_WHITE;

        chessPieces[5][4] = ChessPiece.BISHOP_WHITE;
        chessPieces[5][5] = ChessPiece.PAWN_WHITE;

        chessPieces[6][0] = ChessPiece.PAWN_WHITE;
        chessPieces[6][3] = ChessPiece.QUEEN_WHITE;
        chessPieces[6][5] = ChessPiece.PAWN_WHITE;
        chessPieces[6][7] = ChessPiece.PAWN_WHITE;

        chessPieces[7][5] = ChessPiece.ROOK_WHITE;
        chessPieces[7][6] = ChessPiece.KING_WHITE;

        chessBoard.print();
    }
}

