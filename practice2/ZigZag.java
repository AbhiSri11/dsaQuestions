package com.practice2;

public class ZigZag {
        public static String convertToVShape(String s) {
            int length = s.length();
            int numRows = (length + 1) / 2; // Number of rows in the V shape

            char[][] vShapeArray = new char[numRows][length];

            int row = 0;
            int col = 0;

            // Fill the V shape array
            for (int i = 0; i < length; i++) {
                vShapeArray[row][col] = s.charAt(i);

                if (row == numRows - 1) {
                    col += 2;
                } else {
                    col++;
                }

                row++;
            }

            // Read horizontally
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < length; j++) {
                    if (vShapeArray[i][j] != '\0') {
                        result.append(vShapeArray[i][j]);
                    }
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "GREATER";
            String output = convertToVShape(input);
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }



}
