class FallingPath {

    /*
    Given a square array of integers A, we
    want the minimum sum of a falling path through A.

    A falling path starts at any element in the
    first row, and chooses one element from each row.
    The next row's choice must be in a column that is
    different from the previous row's column by at most one.

    Faster than 89% of Leetcode submissions;


     */
    public int minFallingPathSum(int[][] A) {
        int minpath = 999999999;

        int[][] cache = new int[A.length][A[0].length];
        // you need to initialise the cache.

        for(int i = 0; i < A.length; i++ ){
            for(int j = 0; j < A[0].length; j++){
                cache[i][j] = -1;
                //initialises the cache to a default "Untouched" value.
            }
        }

        for(int i = 0; i < A[0].length; i ++){

            minpath = Math.min(minpath, minFallingPathSum(A,cache,  i, 0 ));

        }

        return minpath;
    }

    public int minFallingPathSum(int[][] A, int[][] cache, int index_x, int index_y){

        // this algorithm is now being modified to have
        // a cache, so that it reduces repeated computation.
        if(index_y == A.length -1){
            //We are at the end of the list. So you should return 0
            return A[index_y][index_x];
        }

        else{
            // this is wrong.
            int minfallingPath = 999999999;

            for(int i = (index_x  - 1 >= 0 ? index_x -1 : index_x);
                i <= (index_x < A[0].length -1 ? index_x + 1 : index_x);
                i++){
                if(cache[index_y + 1][i] != -1){minfallingPath = Math.min(minfallingPath, A[index_y][index_x] + cache[index_y + 1][i]);}
                else{
                    cache[index_y + 1][i] = minFallingPathSum(A,cache, i, index_y + 1);
                    minfallingPath = Math.min(minfallingPath, A[index_y][index_x] + cache[index_y + 1][i]);}

            }

            return minfallingPath;
        }

    }}