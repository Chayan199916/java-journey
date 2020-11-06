class MatrixHandler {

    private static void additionHandler(String[] args){

        int matrix1[][] = new int[2][3], matrix2[][];
        int j, k, i = 0;
        matrix2 = new int[2][3];
        for (j = 0; j < 2; j++)
            for (k = 0; k < 3; k++)
                matrix1[j][k] = Integer.parseInt(args[i++]);

        for (j = 0; j < 2; j++)
            for (k = 0; k < 3; k++)
                matrix2[j][k] = Integer.parseInt(args[i++]);

        Matrix obj1 = new Matrix(matrix1, 2, 3);
        Matrix obj2 = new Matrix(matrix2, 2, 3);
        Matrix addResult = obj1.add(obj2);
        System.out.println("First matrix");
        System.out.println("------------------");
        obj1.display();
        System.out.println("Second matrix");
        System.out.println("------------------");
        obj2.display();
        System.out.println("Result after addition");
        System.out.println("------------------");
        addResult.display();        

    }
    private static void subtractionHandler(String[] args){

        int matrix1[][] = new int[2][3], matrix2[][];
        int j, k, i = 0;
        matrix2 = new int[2][3];
        for (j = 0; j < 2; j++)
            for (k = 0; k < 3; k++)
                matrix1[j][k] = Integer.parseInt(args[i++]);

        for (j = 0; j < 2; j++)
            for (k = 0; k < 3; k++)
                matrix2[j][k] = Integer.parseInt(args[i++]);

        Matrix obj1 = new Matrix(matrix1, 2, 3);
        Matrix obj2 = new Matrix(matrix2, 2, 3);
        Matrix subResult = obj1.subtract(obj2);
        System.out.println("First matrix");
        System.out.println("------------------");
        obj1.display();
        System.out.println("Second matrix");
        System.out.println("------------------");
        obj2.display();
        System.out.println("Result after subtraction");
        System.out.println("------------------");
        subResult.display();

    }
    private static void multiplicationHandler(String[] args){

        int matrix1[][] = new int[2][3], matrix2[][];
        int j, k, i = 0;
        matrix2 = new int[3][2];
        for (j = 0; j < 2; j++)
            for (k = 0; k < 3; k++)
                matrix1[j][k] = Integer.parseInt(args[i++]);

        for (j = 0; j < 3; j++)
            for (k = 0; k < 2; k++)
                matrix2[j][k] = Integer.parseInt(args[i++]);

        Matrix obj1 = new Matrix(matrix1, 2, 3);
        Matrix obj2 = new Matrix(matrix2, 3, 2);
        Matrix mulResult = obj1.multiply(obj2);
        System.out.println("First matrix");
        System.out.println("------------------");
        obj1.display();
        System.out.println("Second matrix");
        System.out.println("------------------");
        obj2.display();
        System.out.println("Result after multiplication");
        System.out.println("------------------");
        mulResult.display();

    }
    public static void main(String[] args) {

        if (args[args.length - 1].charAt(0) == 'a') {

            additionHandler(args);

        } else if (args[args.length - 1].charAt(0) == 's') {

            subtractionHandler(args);

        } else if (args[args.length - 1].charAt(0) == 'm') {

            multiplicationHandler(args);

        }

    }

}

class Matrix {

    private int matrix[][];
    private int row, col;

    public Matrix(int row, int col) {

        this.matrix = new int[row][col];
        this.row = row;
        this.col = col;
        int j;
        for (int i = 0; i < row; i++) {

            for (j = 0; j < col; j++) {

                this.matrix[i][j] = 0;

            }

        }

    }

    public Matrix(int matrix[][], int row, int col) {

        this.matrix = new int[row][col];
        this.row = row;
        this.col = col;
        int j;
        for (int i = 0; i < this.row; i++) {

            for (j = 0; j < this.col; j++) {

                this.matrix[i][j] = matrix[i][j];

            }

        }

    }

    public Matrix add(Matrix objMatrix) {

        Matrix result = new Matrix(objMatrix.row, objMatrix.col);
        int j;

        for (int i = 0; i < result.row; i++)
            for (j = 0; j < result.col; j++)
                result.matrix[i][j] = this.matrix[i][j] + objMatrix.matrix[i][j];

        return result;

    }

    public Matrix subtract(Matrix objMatrix) {

        Matrix result = new Matrix(objMatrix.row, objMatrix.col);
        int j;

        for (int i = 0; i < result.row; i++)
            for (j = 0; j < result.col; j++)
                result.matrix[i][j] = this.matrix[i][j] - objMatrix.matrix[i][j];

        return result;

    }

    public Matrix multiply(Matrix objMatrix) {

        Matrix result = new Matrix(this.row, objMatrix.col);
        int j, k;

        for (int i = 0; i < this.row; i++)
            for (j = 0; j < this.col; j++)
                for(k = 0; k < objMatrix.col; k++)
                    result.matrix[i][k] += this.matrix[i][j] * objMatrix.matrix[j][k];

        return result;

    }

    public void display() {

        int j;
        for (int i = 0; i < this.row; i++) {

            for (j = 0; j < this.col; j++) {

                System.out.print(this.matrix[i][j] + "\t");

            }
            System.out.println("\n");

        }

    }

}