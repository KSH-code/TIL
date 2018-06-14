class Solution {
    private int m,n;
    private char mBoard[][];
    public int solution(int m, int n, String[] board) {
        this.m=m;
        this.n=n;
        mBoard = new char[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                mBoard[i][j] = board[i].charAt(j);
            }
        }
        return H(0,0);
    }
    private int H(int x,y){
        if(mBoard[x][y]==mBoard[x+1][y]&&mBoard[x][y]==mBoard[x][y+1]&&mBoard[x+1][y+1]){
            mBoard[x][y]='';
            mBoard[x][y+1]='';
            mBoard[x+1][y]='';
            mBoard[x+1][y+1]='';
            change(x+1,y+1);
        }
        if(x+1<m&&y+1<n){
            H(x+1,y);
            H(x,y+1);
        }
    }
    private change(int x,int y){
        
    }
  }