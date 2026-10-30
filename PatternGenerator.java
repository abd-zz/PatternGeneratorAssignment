public class PatternGenerator {
    //  Class author:  Abdoul-Aziz Diagne
    //  Date created:  10/28/2026
    //  General description: this class holds various methods that generate various patterns using various loop types
    public static void stars(int rows) {
        int iterations = 1;
        String star = "*";
        while(iterations < rows) {
        
        System.out.println(star);
        star += "*" + "*";
        iterations++;
        }
    }    

    public static void triange(int rows) {
        int iterations = 1;
        String numberToPrint = "";
        int rep = 0;
        do {
            while(rep < iterations) {
                numberToPrint += iterations;
                rep++;
            }
            System.out.println(numberToPrint);
            numberToPrint = "";
            rep = 0;
            iterations++;
        } while(iterations <= rows);
    }
    public static void odds (int start) {
        for(int i = start; i>=0; i -= 2) {
            for(int b = i; b>=1; b--) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    public static void eo(int maxE) {
        char letterToPrint;
        if(maxE % 2 == 0) {
        letterToPrint = 'O';
        } else {
        letterToPrint = 'E';
        }
        for(int i = 1; i <= maxE; i++) {
            for(int b = i; b>=1; b--) {
                System.out.print(letterToPrint);
            }
            System.out.print("\n");
            switch(letterToPrint) {
                case 'E':
                    letterToPrint = 'O';
                    break;
                case 'O':
                    letterToPrint = 'E';
                    break;
            }
        }
        for(int d = maxE-1; d >= 1; d--) {
            for(int b = d; b>=1; b--) {
                System.out.print(letterToPrint);
            }
            System.out.print("\n");
            switch(letterToPrint) {
                case 'E':
                    letterToPrint = 'O';
                    break;
                case 'O':
                    letterToPrint = 'E';
                    break;
            }
    }
}
    public static void pyramid(int rows) {
        int row = rows;
        String space = "";
        for(int i = 1; i<=rows; i++) {
            System.out.print(space);
            for(int b = row+4; b>= 1; b--) {
                System.out.print(i);
            }
            System.out.print("\n");
            row -= 2;
            space += " ";
        }
    }
    public static void main(String[] args) {
        stars(7);
        triange(9);
        odds(9);
        eo(6);
        eo(5);
        pyramid(5);
    }
}
