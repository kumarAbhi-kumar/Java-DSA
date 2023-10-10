public class Pattern {
    public static void hollowRectangePattern(int rows, int cols){
        // Outer Loop
        for(int i = 0; i < rows; i++){
            // Inner Loop
            for(int j = 0; j < cols; j++){
                // Einther I am in I'st row or last OR in I'st column or last 
                // start gets printed on the entire row or enter column for the above
                if(i == 0 || i == (rows-1) || j == 0 || j == (cols-1)){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void inverted_and_rotate_pyramid(int rows){
        // Outer Loop or Say Number of Levels
        for(int i = 0; i < rows; i++){
            // Spaces
            for(int spaces = 0; spaces < (rows - i); spaces++)
                System.out.print(" ");
            
            // Hashe's
                for(int hash = 0; hash <= i; hash++){
                System.out.print("#");
            }
            
            // Line Break
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int rows){
        // Outer Loop for Lines
        for(int i = 1; i <= rows; i++){
            // Inner For Numbers
            // Printing Numbers
            for(int j = 1; j <= rows-(i-1); j++){
                System.out.print(j);
            }
            // OR
            /*
             * for(int j = 1; j <= row - i+1; j++)
             */
            
            // Printing Spaces - You Fool - Why to print Space when its at the end
            /*for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }*/

            // Line Break
            System.out.println();
        }
    }

    public static void floyds_triangle(int rows){
        // function global variable
        int counter = 1;
        // Outer Loop for Lines
        for(int i = 1; i <= rows; i++){
            // Inner Loop
            for(int k = 1; k <= i; k++){
                System.out.print(counter+" ");
                // Incrementing j with each print
                counter++;
            }
            // Line Break
            System.out.println();
        }
    }

    public static void triangle_0_1(int rows){
        int starting_number;
        // Outer For Loop
        for(int i = 1; i <= rows; i++){
            // Inner Loop
            if(i % 2 == 0)
            // if the row number is even it starts with 0
                starting_number = 0;
            else
            // else it starts with 1
                starting_number = 1;
    
            for(int j = 1; j <= i; j++){
                System.out.print(starting_number+" ");
                // Interchanging value each time
                starting_number = (starting_number == 0) ? 1 : 0;
            }

            // Line Break
            System.out.println();
        }

        /*
         * Other approach would be
         * if (sum of the co-ordinates == even) 
         *  print 1 // (1+1), (3, 1), ... print 1
         * else
         *  print 0 // (2, 1), (3, 2), ... print 0
         */
    }

    public static void butterfly_pattern(int rows){
        // At first printing the upper half
        // Outer loop for rows
        for(int i = 1; i < rows; i++){
            // Printing the left half of the pattern
            for(int j = 1; j <= i; j++)
                System.out.print("# ");
            // Printing the spaces
            for(int space = 1; space <= (2*rows - (2*i)); space++) // 2*(rows-i)
                System.out.print("  ");
            // Printing the right half of the pattern
            for(int j = 1; j <= i; j++)
                System.out.print("# ");
            
            System.out.println("  ");
        }
        for(int i = 1; i <= 2*rows; i++){
            if(i == rows){
                System.out.print(" #");
                continue;
            }
            if(i == rows+1){
                System.out.print("  ");
                continue;
            }
            System.out.print("# ");
        }
        System.out.println();
        for(int i = rows-1; i >= 1; i--){
            // Printing the left half of the pattern
            for(int j = 1; j <= i; j++)
                System.out.print("# ");
            // Printing the spaces
            for(int space = 1; space <= (2*rows - (2*i)); space++)
                System.out.print("  ");
            // Printing the right half of the pattern
            for(int j = 1; j <= i; j++)
                System.out.print("# ");
            
            System.out.println("  ");
        }
    }

    public static void rhombus(int rows){
        // Outer for loop for Lines
        for(int i = 1; i <= rows; i++){
            // Printing Spaces
            for(int spaces = 1; spaces <= (rows-i); spaces++){
                System.out.print("  ");
            }
            // Printing pattern
            for(int j = 1; j <= rows; j++){
                System.out.print("# ");
            }

            System.out.println();
        }
    }

    public static void hollow_rhombus(int rows){
        // Outer Loop
        for(int i = 1; i <= rows; i++){
            // Printing Spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }
            // Printing the elements in a row
            for(int j = 1; j <= rows; j++){
                // Printing all the elements in the first and last row and for all the 
                if(i == 1 || i == rows || j == 1 || j == rows)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowRectangePattern(4, 5);
        // inverted_and_rotate_pyramid(5);
        // inverted_half_pyramid_with_numbers(5);
        // floyds_triangle(5);
        // triangle_0_1(5);
        // butterfly_pattern(5);
        // rhombus(5);
        hollow_rhombus(5);

    }
}
