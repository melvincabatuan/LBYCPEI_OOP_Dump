package module5.port;

public class CalculateMatrix {
    // data fields
    int col = 3;
    int row = 3;

    double matrix[][] = new double[col][row];
    double matrix2[][] = new double[col][row];

    double trans1[][] = new double[col][row];
    double trans2[][] = new double[col][row];

    double matrixResult[][] = new double[col][row];

    int colMatrix1;
    int rowMatrix1;

    int colMatrix2;
    int rowMatrix2;

    public int setMatrixRows1(int input){
        this.rowMatrix1 = input;
        if(rowMatrix1 > 3){
            this.rowMatrix1 = 3;
        }

        return rowMatrix1;
    }

    public int setMatrixColumns1(int input) {
        this.colMatrix1 = input;
        if(colMatrix1 > 3){
            this.colMatrix1 = 3;
        }

        return colMatrix1;
    }

    public int setMatrixRows2(int input){
        this.rowMatrix2 = input;
        if(rowMatrix2 > 3){
            this.rowMatrix2 = 3;
        }

        return rowMatrix2;
    }

    public int setMatrixColumns2(int input) {
        this.colMatrix2 = input;
        if(colMatrix2 > 3){
            this.colMatrix2 = 3;
        }

        return colMatrix2;
    }

    public void setMatrix1Values(int row, int col,double input){
        this.matrix[row][col] = input;
    }

    public void setMatrix2Values(int row, int col,double input){
        this.matrix2[row][col] = input;
    }


    public void calculateMatrixSum(){

        this.col =  colMatrix1;
        if (colMatrix1 < colMatrix2) this.col =  colMatrix2;

        this.row =  rowMatrix1;
        if (rowMatrix1 < rowMatrix2) this.row =  rowMatrix2;

        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                this.matrixResult[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
    }

    public void calculateMatrixDifference(){

        this.col =  colMatrix1;
        if (colMatrix1 < colMatrix2) this.col =  colMatrix2;

        this.row =  rowMatrix1;
        if (rowMatrix1 < rowMatrix2) this.row =  rowMatrix2;

        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                this.matrixResult[i][j] = 0;
                this.matrixResult[i][j] = matrix[i][j] - matrix2[i][j];
            }
        }
    }

    public void calculateMatrixProduct(){

        this.col =  colMatrix1;
        if (colMatrix1 < colMatrix2) this.col =  colMatrix2;

        this.row =  rowMatrix1;
        if (rowMatrix1 < rowMatrix2) this.row =  rowMatrix2;

        for (int i = 0 ; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.matrixResult[i][j] = 0;
                for (int k = 0; k < row; k++)
                    this.matrixResult[i][j] = matrixResult[i][j] + (matrix[i][k] * matrix2[k][j]);
            }
        }
    }

    public void calculateMatrixTranspose(){

        for(int i=0;i<rowMatrix1;i++) {
            for(int j=0;j<colMatrix1;j++) {
                this.trans1[j][i] = matrix[i][j];
            }
        }

        for(int i=0;i<rowMatrix2;i++) {
            for(int j=0;j<colMatrix2;j++) {
                this.trans2[j][i] = matrix2[i][j];
            }
        }

    }

    public double getMatrix1Values(int row, int col){
        return matrix[row][col];
    }

    public double getMatrix2Values(int row, int col){
        return matrix2[row][col];
    }

    public double getMatrix1Transpose(int row, int col){
        return trans1[row][col];
    }

    public double getMatrix2Transpose(int row, int col){
        return trans2[row][col];
    }

    public double getMatrixResult(int row, int col){
        return matrixResult[row][col];
    }

}
