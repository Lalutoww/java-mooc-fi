public class MagicSquareFactory { 
    
    public MagicSquare createMagicSquare(int size) { 
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd number.");
        }

        MagicSquare square = new MagicSquare(size); 
        
        // Start in the middle of the first row
        int row = 0;
        int col = size / 2;
        int totalCells = size * size;
        
        for (int number = 1; number <= totalCells; number++) {
            // Place the current number in the square
            square.placeValue(row, col, number);
            
            // Calculate next positions (up one row, right one column)
            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;
            
            // If the cell is already occupied, move down instead
            if (square.readValue(nextRow, nextCol) != 0) {
                row = (row + 1) % size;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }
        
        return square; 
    } 
}
