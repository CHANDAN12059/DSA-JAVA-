package backtracking;

public class nqueen {

public static boolean isSafe(char board[][],int row,int col){

for(int i=row-1;i>=0;i--){
    if(board[i][col]=='q'){
        return false;
    }
}

for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
if(board[i][j]=='q'){
    return false;
}
}


for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
    if(board[i][j]=='q'){
        return false;
    }
}


return true;

}


    public static void nqueen(char board[] [],int row){

if(row==board.length){
    print(board);
    return;
}

        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
            board[row][i]='q';
            nqueen(board, row+1);
            board[row][i]='.';
        }

        }

    }
    public static void print(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
    int n=4;
    char board[][]=new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='.';
        }
    }
    nqueen(board,0);
    



    }
}
