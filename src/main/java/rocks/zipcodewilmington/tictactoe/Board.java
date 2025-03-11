package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public char xInBoard='X';
    public char oInBoard='O';
    public int xCounter = 0;
    public int oCounter = 0;
    public Board(Character[][] matrix) {
        int i;
        int j;

            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] == xInBoard) {
                        xCounter++;
                    } else if (matrix[i][j] == oInBoard) {
                        oCounter++;
                    }
                }
                if (xCounter == 3 || oCounter == 3) {
                    break;
                } else {
                    xCounter = 0;
                    oCounter = 0;
                }
            }

        if (xCounter == 0 && oCounter == 0) {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix.length; j++) {
                    if (matrix[j][i] == xInBoard) {
                        xCounter++;
                    } else if (matrix[j][i] == oInBoard) {
                        oCounter++;
                    }

                }
                if (xCounter == 3 || oCounter == 3) {
                    break;
                } else {
                    xCounter = 0;
                    oCounter = 0;
                }
            }
            }


            if (xCounter ==0  && oCounter == 0) {
                for (i = 0; i < matrix.length; i++) {
                    for (j = 0; j < matrix.length; j++) {
                        if (matrix[j][j] == xInBoard) {
                            xCounter++;
                        } else if (matrix[j][j] == oInBoard) {
                            oCounter++;
                        }
                    }
                    if (xCounter == 3 || oCounter == 3) {
                        break;
                    } else {
                        xCounter = 0;
                        oCounter = 0;
                    }
                }
                }


        if (xCounter == 0 && oCounter == 0){
        for (i = 2; i>=0; i--) {
            for (j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == xInBoard) {
                    xCounter++;
                } else if (matrix[i][j] == oInBoard) {
                    oCounter++;
                }
                i--;

            }
            if (xCounter == 3 || oCounter == 3) {
                break;
            } else {
                xCounter = 0;
                oCounter = 0;
            }
        }

        }


    }





    public Boolean isInFavorOfX() {

        return xCounter==3 ;
    }

    public Boolean isInFavorOfO() {

        return oCounter==3;
    }

    public Boolean isTie() {

        return (!isInFavorOfO() && !isInFavorOfX());
    }

    public String getWinner() {
        if(isInFavorOfX()){
            return"X";
        }if(isInFavorOfO()){
            return"O";
        }if(isTie()){
            return "";
        }
        return"Game not complete";
    }

}
