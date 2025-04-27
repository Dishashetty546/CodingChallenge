import nltk
from nltk import CFG
from nltk.parse import RecursiveDescentParser, ShiftReduceParser

# Get grammar from user
print("Enter grammar rules (type 'end' to finish):")
grammar_rules = []
while True:
    line = input()
    if line.strip().lower() == 'end':
        break
    grammar_rules.append(line)

# Create CFG grammar
grammar_string = "\n".join(grammar_rules)
grammar = CFG.fromstring(grammar_string)

# Get sentence from user
sentence_input = input("\nEnter a sentence to parse: ")
sentence = sentence_input.lower().split()

# Top-Down Parsing
print("\nTop-Down Parsing (Recursive Descent Parser):")
rd_parser = RecursiveDescentParser(grammar)
for tree in rd_parser.parse(sentence):
    print(tree)
    tree.pretty_print()

# Bottom-Up Parsing
print("\nBottom-Up Parsing (Shift-Reduce Parser):")
sr_parser = ShiftReduceParser(grammar)
for tree in sr_parser.parse(sentence):
    print(tree)
    tree.pretty_print()
