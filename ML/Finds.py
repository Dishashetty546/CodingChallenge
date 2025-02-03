dataset = [
    ['sunny','warm','strong','less','strong','normal','yes'],
     ['sunny','warm','strong','less','strong','normal','yes'],
      ['sunny','hot','strong','less','weak','normal','no'],
       ['sunny','warm','strong','less','strong','normal','yes'],
]
def find_s(examples):
    hypothesis = ['0','0','0','0','0','0']
    for example in examples:
        if example[-1]=='yes':
            for i in range(len(hypothesis)):
                if hypothesis[i]=='0':
                    hypothesis[i]=example[i]
                elif hypothesis[i]!=example[i]:
                      hypothesis[i]='?'

    return hypothesis

result = find_s(dataset)
print(result)