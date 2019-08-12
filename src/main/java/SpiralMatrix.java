import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        if(matrix.length ==0){return new ArrayList<Integer>();}

        return recursively_return(result, matrix);
    }

    private List<Integer> recursively_return(List<Integer> result, int[][] matrix){
        if (matrix.length == 1){
            result.addAll(Arrays.stream(matrix[0])
                    .boxed()
                    .collect(Collectors.toList()));
            return result;

        }
        else{
            result.addAll(Arrays.stream(matrix[0])
                    .boxed()
                    .collect(Collectors.toList()));

            return recursively_return(result, rotate_matrix(matrix));

        }
    }

    private int[][] rotate_matrix(int[][] matrix){
        int[][] rotated = new int[matrix[0].length ][matrix.length - 1];
        
        for (int i = 0; i < matrix[0].length; ++i) {
            for (int j = 0; j < matrix.length - 1; ++j) {

                rotated[i][j] = matrix[j + 1][matrix[0].length - i - 1];
            }
        }

        return rotated;
    }
}
