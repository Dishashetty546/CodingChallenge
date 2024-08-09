import random

numOfStones = 0
turn = 1
isGameEnded = False
numOfStones = int(input("Enter the number of stones to start the game: "))
numOfStonesToWithdraw = 0

while not isGameEnded:
    print("Total number of stones remaining: " + str(numOfStones))
    if turn == 1:
        print("--------- Player 1's turn -----------")
        numOfStonesToWithdraw = int(input("Enter the number of stones to withdraw (1-3): "))
        while numOfStonesToWithdraw < 1 or numOfStonesToWithdraw > 3:
            print("Invalid move. Please enter a number between 1 and 3.")
            numOfStonesToWithdraw = int(input("Enter the number of stones to withdraw (1-3): "))
        numOfStones -= numOfStonesToWithdraw
        if numOfStones <= 0:
            isGameEnded = True
            print("Player 1 won the game")
        turn = 2

    elif turn == 2:
        print("-------- Player 2's turn --------")
        numOfStonesToWithdraw = int(input("Enter the number of stones to withdraw (1-3): "))
        while numOfStonesToWithdraw < 1 or numOfStonesToWithdraw > 3:
            print("Invalid move. Please enter a number between 1 and 3.")
            numOfStonesToWithdraw = int(input("Enter the number of stones to withdraw (1-3): "))
        numOfStones -= numOfStonesToWithdraw
        if numOfStones <= 0:
            isGameEnded = True
            print("Player 2 won the game")
        turn = 3

    else:
        print("-------- Computer's turn --------")
        if numOfStones <= 3:
            numOfStonesToWithdraw = numOfStones  # AI takes the remaining stones to win
        else:
            numOfStonesToWithdraw = random.randint(1, 3)
        print(f"Computer withdraws {numOfStonesToWithdraw} stones.")
        numOfStones -= numOfStonesToWithdraw
        if numOfStones <= 0:
            isGameEnded = True
            print("Computer won the game")
        turn = 1
