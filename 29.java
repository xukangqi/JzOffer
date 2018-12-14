import java.util.ArrayList;

import javax.xml.stream.events.EndDocument;
public class Solution {
    public ArrayList < Integer > arrayList;
    public ArrayList < Integer > printMatrix(int[][] matrix) {
        arrayList = new ArrayList < > ();
        if (matrix == null) {
            return null;
        }
        int width = matrix[0].length;
        int height = matrix.length;
        int startRow = 0;
        int endRow = height - 1;
        int startCol = 0;
        int endCol = width-1;
        while (startRow <= endRow && startCol <= endCol) {
            if(startRow==endRow){
                for (int j = startCol; j <= endCol; j++) {
                    arrayList.add(matrix[startRow][j]);
                }
                return arrayList;
            }
            if(startCol==endCol){
                for(int i=startRow;i<=endRow;i++){
                    arrayList.add(matrix[i][startCol]);
                }
                return arrayList;
            }

            for (int j = startCol; j <= endCol; j++) {
                arrayList.add(matrix[startRow][j]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                arrayList.add(matrix[i][endCol]);
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                arrayList.add(matrix[endRow][j]);
            }
            for (int i = endRow - 1; i > startRow; i--) {
                arrayList.add(matrix[i][startCol]);
            }
            startCol += 1;
            startRow += 1;
            endCol -= 1;
            endRow -= 1;
        }
        return arrayList;
    }
}