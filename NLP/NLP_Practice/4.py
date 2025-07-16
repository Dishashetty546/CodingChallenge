import nltk
from nltk import CFG
from nltk.parse import RecursiveDescentParser,ShiftReduceParser

print("Enter grammar rules (type 'end' to finish):")
grammar_rules= []


while True:
    line= input()
    if line.strip().lower()== 'end':
        break
    grammar_rules.append(line)

grammar_string= "\n".join(grammar_rules)

grammar= CFG.fromstring(grammar_string)

sentence_input= input("Enter the sentence to parse :")


sentence= sentence_input.lower().strip().split()
print("Top down parsing(Recursive Parsing) with detailed tracing\n")

rd_parser=RecursiveDescentParser(grammar,trace=2)

for tree in rd_parser.parse(sentence):
    print("\nFinal parse tree")
    print(tree)
    tree.pretty_print()


print("Botton Up tree parser(Shife Reduce Parser):")

sr_parser=ShiftReduceParser(grammar)
for tree in sr_parser.parse(sentence):
    print("\nFinal parse tree")
    print(tree)
    tree.pretty_print()
