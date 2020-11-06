class ChoiceOperate {
    public static void main(String args[]) {
        char ch;
        int i, j;
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int[][] c = new int[3][3];
        int[][] arr = new int[2][3];
        int[][] arr1 = new int[3][3];
        // System.out.println("Enter your choice:");
        // System.out.println("Enter A for adding two matrices, S for subtracting and P for product");
        String s = args[0];
        ch = s.charAt(0);
        System.out.println("Enter the elements of the first 2x3 matrix");
        int k = 0;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++)
                a[i][j] = Integer.parseInt(args[k++]);
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++)
                b[i][j] = Integer.parseInt(args[k++]);
        }
        switch (ch) {
            case 'A':
                arr = add(a, b);
                System.out.println("The sum of the two matrices are");
                for (i = 0; i < 2; i++) {
                    for (j = 0; j < 3; j++)
                        System.out.print(arr[i][j] + " ");
                    System.out.println();
                }
                break;
            case 'S':
                arr = sub(a, b);
                System.out.println("The difference of the two matrices are");
                for (i = 0; i < 2; i++) {
                    for (j = 0; j < 3; j++)
                        System.out.print(arr[i][j] + " ");
                    System.out.println();
                }
                break;
            case 'M':
                System.out.println("Enter the second 3x3 matrix");
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++)
                        c[i][j] = Integer.parseInt(args[k++]);
                }
                arr1 = mul(a, c);
                System.out.println("The product of the two matrices are");
                for (i = 0; i < 2; i++) {
                    for (j = 0; j < 3; j++)
                        System.out.print(arr1[i][j] + " ");
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static int[][] add(int[][] x, int[][] y) {
        int i, j;
        int[][] res = new int[2][3];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++)
                res[i][j] = x[i][j] + y[i][j];
        }
        return res;
    }

    public static int[][] sub(int[][] x, int[][] y) {
        int i, j;
        int[][] res = new int[2][3];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++)
                res[i][j] = x[i][j] - y[i][j];
        }
        return res;
    }

    public static int[][] mul(int[][] x, int[][] y) {
        int i, j, k;
        int[][] res = new int[2][3];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                res[i][j] = 0;
                for (k = 0; k < 3; k++)
                    res[i][j] += x[i][k] * y[k][j];
            }
        }
        return res;
    }

}