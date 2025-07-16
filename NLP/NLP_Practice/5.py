from collections import Counter

reviews=[]

num_reviews= int(input("Enter the number of training reviews:"))

for i in range(num_reviews):
    review_text=input(f"Enter review {i+1} (comma-separated words):").strip().split(",")
    label= input(f"Enter the label for review {i+1} (e.g, 'Comedy' or 'Action')").strip()
    reviews.append((review_text,label))

test= input("Ente the test document (comma-separated words):").strip().split(",")

labels= [label for _,label in reviews]
label_counts= Counter(labels)
total_reviews= len(reviews)

priors= {label: count / total_reviews for label, count in label_counts.items()}
print("\nPrior Probabilities:")


for label, prob  in priors.items():
    print(f"P({label})={prob: .4f}")


word_count= {label:Counter() for label in label_counts}
total_words={label: 0 for label in label_counts}

for words,label in reviews:
    word_count[label].update(words)
    total_words[label]+=len(words)

vocab= set(word for words, label in reviews for word in words)

vocab_size= len(vocab)

print("\n Word counts:")
for label,counts in word_count.items():
    print(f"{label} word counts:",counts)
print("\n Total words:")
for label,count in total_words.items():
    print(f"{label}:{count}")


print("\nVocabulary size:",vocab_size)


probs={}
for label in priors:
    probs[label]=priors[label]
    print(f"calculating probabilities for '{label}'")
    for word in test:
        word_likelihood= (word_count[label][word]+1)/(total_words[label]+vocab_size)
        probs[label]*=word_likelihood
        print(f"P({word}|{label})={word_likelihood:.4f}")

predicted_label= max(probs,key=probs.get)
print("\n probabilities")
for label,prob in probs.items():
    print(f"P{label}|D)={prob:.4f}")

print(f"predicted label:",predicted_label)