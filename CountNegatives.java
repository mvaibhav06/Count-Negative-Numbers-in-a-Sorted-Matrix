class CountNegatives {
    public int countNegatives(int[][] grid) {
        int out = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]<0){
                    out++;
                }
            }
        }
        return out;
    }
}
