class Solution {
    public boolean isValidSudoku(char[][] board) {
        return allRows(board) && allColumns(board) && subSets(board);
    }
    
    private boolean subSets(char[][] board){
        int[] iS = new int[]{0,3,6};
        int[] iE = new int[]{2,5,8};
        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=2; j++){
                if(!check(board, iS[i], iE[i], iS[j], iE[j])){
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean allRows(char[][] board){
        int max = board.length - 1;
        for(int r = 0; r<=max; r++){
            if(!check(board, r, r, 0, max)){
                return false;
            }
        }
        return true;
    }
    
    private boolean allColumns(char[][] board){
        int max = board.length - 1;
        for(int c = 0; c<=max; c++){
            if(!check(board, 0, max, c, c)){
                return false;
            }
        }
        return true;
    }
    
    private boolean check(char[][] board, int rS, int rE, int cS, int cE){
        HashMap<Character, Integer> map = new HashMap();
        for(int r = rS; r<=rE; r++){
            for(int c =cS; c<=cE; c++){
                if(board[r][c]!='.'){
                    if(map.containsKey(board[r][c])){
                    return false;
                }
                map.put(board[r][c], 1);   
                }                
            }
        }
        return true;
        
    }
}