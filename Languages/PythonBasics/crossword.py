import random
def generate_crossword(words):
    max_len=max(len(word) for word in words)
    grid_size= max_len+2
    grid= [[' 'for _ in range(grid_size)] for _ in range(grid_size)]
    for word in words:
        placed=False
        if random.choice([True,False]):
           for row in range(grid_size):
                for col in range(grid_size-len(word)):
                    if all(grid[row][col+k]==' ' or grid[row][col+k]==word[k] for k in range (len(word))):
                        for k in range(len(word)):
                           grid[row][col+k]=word[k]
                        placed=True
                        break
                if placed:
                    break

        else:
            for col in range(grid_size):
                for row in range(grid_size-len(word)):
                    if all(grid[row+k][col]==' ' or grid[row+k][col]==word[k] for k in range(len(word))):
                        for k in range(len(word)):
                            grid[row+k][col]=word[k]
                        placed=True
                        break
                if placed:
                    break


    for row in grid:
        print(' '.join(row))

words=["PYTHON","CROSSWORD","NAME","IS"]
generate_crossword(words)

                    
