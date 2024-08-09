
import random

def sum(a, b, c):
    return a + b + c

def printBoard(xState, yState):
    zero = 'X' if xState[0] else ('O' if yState[0] else 0)
    one = 'X' if xState[1] else ('O' if yState[1] else 1)
    two = 'X' if xState[2] else ('O' if yState[2] else 2)
    three = 'X' if xState[3] else ('O' if yState[3] else 3)
    four = 'X' if xState[4] else ('O' if yState[4] else 4)
    five = 'X' if xState[5] else ('O' if yState[5] else 5)
    six = 'X' if xState[6] else ('O' if yState[6] else 6)
    seven = 'X' if xState[7] else ('O' if yState[7] else 7)
    eight = 'X' if xState[8] else ('O' if yState[8] else 8)

    print(f"{zero}|{one}|{two}")
    print("-|-|-")
    print(f"{three}|{four}|{five}")
    print("-|-|-")
    print(f"{six}|{seven}|{eight}")

def checkwin(xState, yState):
    wins = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],
        [0, 3, 6], [1, 4, 7], [2, 5, 8],
        [0, 4, 8], [2, 4, 6]
    ]
    for win in wins:
        if sum(xState[win[0]], xState[win[1]], xState[win[2]]) == 3:
            print("X won the match!")
            return 1
        if sum(yState[win[0]], yState[win[1]], yState[win[2]]) == 3:
            print("O won the match!")
            return 0
    return -1

def aiMove(xState, yState):
    combined_state = [xState[i] + yState[i] for i in range(9)]
    available_moves = [i for i, spot in enumerate(combined_state) if spot == 0]
    print(f"AI available moves: {available_moves}")
    return random.choice(available_moves)

if __name__ == "__main__":
    xState = [0, 0, 0, 0, 0, 0, 0, 0, 0]
    yState = [0, 0, 0, 0, 0, 0, 0, 0, 0]
    turn = 1  # turn 1 is given to player X

    print("Welcome to Tic Tac Toe")
    while True:
        printBoard(xState, yState)
        if turn == 1:
            print("X's chance")
            while True:
                try:
                    val = int(input("Please enter a value: "))
                    if 0 <= val < 9 and xState[val] == 0 and yState[val] == 0:
                        xState[val] = 1
                        break
                    else:
                        print("Invalid move, try again.")
                except (ValueError, IndexError):
                    print("Please enter a valid position (0-8).")
        else:
            print("O's chance")
            while True:
                val = aiMove(xState, yState)  # AI makes a move
                if xState[val] == 0 and yState[val] == 0:
                    yState[val] = 1
                    print(f"AI chose position {val}")
                    break

        cwin = checkwin(xState, yState)
        if cwin != -1:
            printBoard(xState, yState)
            print("Match over")
            break
        turn = 1 - turn