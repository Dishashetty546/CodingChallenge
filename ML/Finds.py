dataset = [
    ['sunny','warm','normal','strong','warm','same','yes'],
    ['sunny','warm','high','strong','warm','same','yes'],
    ['rainy','cold','high','strong','warm','change','no'],
    ['sunny','warm','normal','strong','cool','change','yes']

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