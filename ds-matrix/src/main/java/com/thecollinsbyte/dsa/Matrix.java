package com.thecollinsbyte.dsa;

public class Matrix<T extends Number> {
    private int rows;
    private int cols;
    private T[][] data;


    public Matrix(int rows, int cols, T[][] data) {
        this.rows = rows;
        this.cols = cols;
        this.data = data;
    }

    /**
     * TODO:
     *     1. Addition: Perform element-wise matrix addition
     *     2. Multiplication: Multiply matrices for complex computations
     *     3. Rotation: Rotate the matrix elements to transform the structure
     */

    public void insertAtBeginning(T[] elements) {
        if(elements == null) throw new IllegalStateException("Elements array cannot be null");

        if (rows == 0 && cols == 0) {
            resizeMatrix(1, elements.length);
            System.arraycopy(elements, 0, data[0], 0, elements.length);
        } else if(elements.length != cols) {
            throw new IllegalStateException("Number of elements must match the number of columns in the matrix");
        }else {
            resizeMatrix(rows + 1, cols);
            shiftDown(0);
            System.arraycopy(elements, 0, data[0], 0, cols);
        }
    }

    public void insertAtPosition(int position, T[] elements) {
        if(elements == null) throw new IllegalStateException("Elements array cannot be null");

        if(position < 1 || position > rows + 1) throw new IllegalStateException("Position must be between 0 and " + (rows + 1));

        if(position == 1) {
            insertAtBeginning(elements);
            return;
        }

        if(position == rows + 1) {
            insertAtEnd(elements);
            return;
        }

        if(cols == 0 && rows == 0) {
            resizeMatrix(1, elements.length);
            System.arraycopy(elements, 0, data[0], 0, elements.length);
        }else if(elements.length != cols) {
            throw new IllegalStateException("Number of elements must match the number of columns in the matrix");
        }else {
            resizeMatrix(rows + 1, cols);
            shiftDown(position - 1);
            System.arraycopy(elements, 0, data[position - 1], 0, cols);
        }
    }

    public void insertAtEnd(T[] elements) {
        if(elements == null) throw new IllegalStateException("Elements array cannot be null");

        if(cols == 0 && rows == 0) {
            resizeMatrix(1, elements.length);
            System.arraycopy(elements, 0, data[0], 0, elements.length);
        } else if(elements.length != cols) {
            throw new IllegalStateException("Number of elements must match the number of columns in the matrix");
        } else {
            resizeMatrix(rows + 1, cols);
            System.arraycopy(elements, 0, data[rows - 1], 0, cols);
        }
    }

    public void traverse() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void traverseRowWise(MatrixElementVisitor<T> visitor) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                visitor.visit(i, j, data[i][j]);
            }
        }
    }

    public void traverseColumnWise(MatrixElementVisitor<T> visitor) {
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                visitor.visit(i, j, data[i][j]);
            }
        }
    }

    public T get(int row, int col) {
        if(isValidPosition(row, col)) {
            return data[row][col];
        } else {
            throw new IllegalStateException("Invalid matrix position");
        }
    }

    public boolean contains(T element) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(element.equals(data[i][j])) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public T[][] getData() {
        return data;
    }

    public Matrix<Double> add(Matrix<T> matrix) {

        if(this.rows != matrix.rows || this.cols != matrix.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        Double[][] result = new Double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j].doubleValue() + matrix.data[i][j].doubleValue();
            }
        }

        return new Matrix<>(rows, cols, result);
    }

    private void resizeMatrix(int newRows, int newCols) {
        T[][] newData = createEmptyMatrix(newRows, newCols);

        for (int i = 0; i < Math.min(rows, newRows); i++) {
            System.arraycopy(data[i], 0, newData[i], 0, Math.min(cols, newCols));
        }
        this.data = newData;
        this.rows = newRows;
        this.cols = newCols;
    }

    private void shiftDown(int fromRow) {
        for (int i = rows - 1; i > fromRow; i--) {
            data[i] = data[i - 1];
        }
        data[fromRow] = createEmptyMatrix(1, cols)[0];
    }

    private T[][] createEmptyMatrix(int rows, int cols) {
         return (T[][]) new Number[rows][cols];
    }

    public interface MatrixElementVisitor<T> {
        void visit(int row, int col, T element);
    }
}
