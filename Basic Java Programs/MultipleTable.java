//write a java program to display the multiplication table from 1 to 15.
public class MultipleTable {
    public static void main(String[] args) {
        for(int row=1; row<=15; row++)
        {
            System.out.println("Table of "+row);
            for(int col=1; col<=10; col++)
            {
                System.out.println(row + " X " + col + " = " +row*col);
            }
            System.out.println();
        }
    }
    
}

/*
 2X1 = 2 3X1=3 ...
 */