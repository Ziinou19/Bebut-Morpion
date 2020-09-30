package morpion;

public class Grille {

    public static void showTable(int [][] tableau) {
        for(int i =0; i < tableau.length; i = i + 1) {
            System.out.println(" ");
            for(int j = 0; j < tableau.length;j = j + 1 ){

                tableau[0][j]= 50;
                tableau[i][0]=  50;
                tableau[tableau.length - 1][j]=50;
                tableau[i][tableau.length - 1 ] = 50;



