package com.codeforcesShivansh;

public class Word_search {
    public static void main(String args[]){
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCB";
        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(call(i,j,board,word,0)) return true;
                }
            }
        }
        return false;
    }
    public static boolean call(int i,int j,char[][] board,String word,int ind){
        if(ind==word.length()-1) return true;
        boolean left=false;
        boolean right=false;
        boolean up=false;
        boolean down=false;
        if(j-1>=0 && word.charAt(ind+1)==board[i][j-1]){
            char req=board[i][j];
            board[i][j]='*';
            left=call(i,j-1,board,word,ind+1);
            board[i][j]=req;
        }
        if(j+1<board[0].length && word.charAt(ind+1)==board[i][j+1]){
            char req=board[i][j];
            board[i][j]='*';
            right=call(i,j+1,board,word,ind+1);
            board[i][j]=req;
        }
        if(i-1>=0 && word.charAt(ind+1)==board[i-1][j]){
            char req=board[i][j];
            board[i][j]='*';
            up=call(i-1,j,board,word,ind+1);
            board[i][j]=req;
        }
        if(i+1<board.length && word.charAt(ind+1)==board[i+1][j]){
            char req=board[i][j];
            board[i][j]='*';
            down=call(i+1,j,board,word,ind+1);
            board[i][j]=req;
        }
        return left || right || up || down;
    }
}
