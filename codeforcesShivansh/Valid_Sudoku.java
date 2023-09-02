package com.codeforcesShivansh;
import java.util.*;
public class Valid_Sudoku {
    public static void main(String args[]){
        char[][] board={{'5','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}};
 System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(isValid(i,j,board)) continue;
                    else return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(int row,int col,char[][] board){
        for(int i=0;i<9;i++){
            if(i!=col && board[row][i]==board[row][col]) return false;

            if(i!=row && board[i][col]==board[row][col]) return false;

            if(((3*(row/3))+i/3)==row && ((3*(col/3))+i%3)==col) continue;

            if(board[(3*(row/3))+i/3][(3*(col/3))+i%3]==board[row][col]) return false;
        }
        return true;
    }

}

