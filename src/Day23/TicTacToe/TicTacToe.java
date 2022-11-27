package Day23.TicTacToe;
//picture of Game with index
// 0 | 1 | 2
//-----------
// 3 | 4 | 5
//-----------
// 6 | 7 | 8

//USER LOGIC
// 1 | 2 | 3
//-----------
// 4 | 5 | 6
//-----------
// 7 | 8 | 9

//Game UI
// | - | - | -
//-----------
// | - | - | -
//-----------
// | - | - | -

//GamePlay
// | 0 | - | 0
//-----------
// | - | x | -
//-----------
// | - | - | x


public class TicTacToe {
    protected char[] board; //board of characters
    protected char userMarker;//for user
    protected char aiMarker; //for computer, algorithm we're gonna create
    protected char winner;
    protected char currentMarker; //for defining whose turn it is


    public TicTacToe(char playerToken, char aiMarker) {
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard(); //we're creating a function that is going to set our board
        this.currentMarker = userMarker;
    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-'; //setting our board to - because nothing has been entered yet
        }
        return board;
    }

    public boolean playTurn(int spot) { //return if we are able to play the turn, and false if we're not, spot where the user wants to play
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker; //see comments: user thinks that spot is 1 but index is 0, so -1
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker; //if statement: if currentMarker == userMarker than make currentMarker aiMarker
            // otherwise if (currentMarker !== userMarker ) make currentMarker userMarker, we're flipping the turn
        }
        return isValid;
    }

    //Check if our spot is in range:
    public boolean withinRange(int number) { //number is our spot
        return number > 0 && number < board.length + 1; //from 0 to 9.
    }

    //Check if the spot is taken
    public boolean isSpotTaken(int number) {
        return board[number - 1] != '-'; //User wants to put something in 5, we look at 4. if there's something at 4 it's not going to be equal '-' - so true, it's taken. If not - false
    }

    public void printBoard() {
        // | - | - | -
        //-----------
        // | - | - | -
        //-----------
        // | - | - | -

        System.out.println(); //printing new line;

        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) { //printing out dashes after every third
                System.out.println();
                System.out.println("---------------");
            }
            System.out.print(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println(); //printing new line;

        for (int i = 0; i <9; i++) {
            if (i % 3 == 0 && i != 0) { //printing out dashes after every third
                System.out.println();
                System.out.println("---------------");
            }
            System.out.print(" | " + (i + 1));
        }
        System.out.println();
    }

    public boolean isThereAWinner() {
        //Function will include many helpers-functions
        boolean diagonalsAndMiddles = (rightDiagonal() || leftDiagonal() || middleRow() || secondColumn()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstColumn()) && board[0] != '-';
        boolean bottomAndThird = (bottomRow() || thirdColumn()) && board[8] != '-';
        if (diagonalsAndMiddles){
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndThird) {
            this.winner = board[8];
        }
        return diagonalsAndMiddles || topAndFirst || bottomAndThird;
    }

    public boolean topRow(){
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean middleRow(){
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean bottomRow(){
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstColumn(){
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondColumn(){
        return board[1] == board[4] && board[4] == board[7];
    }

    public boolean thirdColumn(){
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean rightDiagonal(){
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean leftDiagonal(){
        return board[2] == board[4] && board[4] == board[6];
    }

    public boolean isBoardFilled(){
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '-'){
                return false;
            }
        }
        return true;
    }

    public String gameOver(){
        boolean didSomeoneWin = isThereAWinner();
        if (didSomeoneWin){
            return "We have a winner! The winner is " + this.winner + "'s";
        } else if (isBoardFilled()) {
            return "Draw: Game Over";
        }else {
            return "Not Over";
        }
    }
}
