from collections import Counter

# Taking user input for training data
reviews = []
num_reviews = int(input("Enter the number of training reviews: "))
for i in range(num_reviews):
    review_text = input(f"Enter review {i+1} (comma-separated words): ").strip().split(',')
    label = input(f"Enter the label for review {i+1} (e.g., 'comedy' or 'action'): ").strip()
    reviews.append((review_text, label))

# Taking user input for test document
D = input("Enter the test document (comma-separated words): ").strip().split(',')

# Calculate prior probabilities
labels = [label for _, label in reviews]
label_counts = Counter(labels)
total_reviews = len(reviews)
priors = {label: count / total_reviews for label, count in label_counts.items()}

print("\nPrior Probabilities:")
for label, prob in priors.items():
    print(f"P({label}) = {prob:.4f}")

# Calculate word likelihoods with add-1 smoothing
word_counts = {label: Counter() for label in label_counts}
total_words = {label: 0 for label in label_counts}

for words, label in reviews:
    word_counts[label].update(words)
    total_words[label] += len(words)

vocab = set(word for words, _ in reviews for word in words)
vocab_size = len(vocab)

print("\nWord Counts:")
for label, counts in word_counts.items():
    print(f"{label} word counts:", counts)

print("\nTotal Words:")
for label, count in total_words.items():
    print(f"{label}: {count}")

print("\nVocabulary Size:", vocab_size)

# Calculate probabilities for each label without using log
probs = {}
for label in priors:
    probs[label] = priors[label]
    print(f"\nCalculating probabilities for '{label}'")
    for word in D:
        # Add-1 smoothing
        word_likelihood = (word_counts[label][word] + 1) / (total_words[label] + vocab_size)
        probs[label] *= word_likelihood
        print(f"P({word}|{label}) = {(word_counts[label][word] + 1)}/{(total_words[label] + vocab_size)} = {word_likelihood:.4f}")

# Predict the class with the highest probability
predicted_label = max(probs, key=probs.get)

print("\nProbabilities:")
for label, prob in probs.items():
    print(f"P({label}|D) = {prob:.10f}")

print("\nPredicted Label:", predicted_label)