
# TODO: make function for taking player input, using that input, and handling related exceptions


# Dictionary representing the state of each blank spaceon the board
gameBoard = {"TL": " ", "TM": " ", "TR": " ",
             "ML": " ", "MM": " ", "MR": " ",
             "BL": " ", "BM": " ", "BR": " ",}

def drawBoard():
    print(" " + gameBoard["TL"] + "|" + " " + gameBoard["TM"] + "|" + " " + gameBoard["TR"])
    print("--+--+--")
    print(" " + gameBoard["ML"] + "|" + "" + gameBoard["MM"] + "|" + " " + gameBoard["MR"])
    print("--+--+--")
    print(" " + gameBoard["BL"] + "|" + "" + gameBoard["BM"] + "|" + " " + gameBoard["BR"])      



def main():
    drawBoard()
    for turn in range(3):
        
        print("It's turn number " + str(turn+1) + ", where do you want to move?")
        moveLocation = input()
        if turn % 2 == True:
            symbol = "O"
        else:
            symbol = "X"

        if moveLocation not in gameBoard.keys():
            print("Invalid location")
        else:
            gameBoard[moveLocation] = symbol
            
        
        drawBoard()
















main()