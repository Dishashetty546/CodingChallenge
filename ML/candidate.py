import pandas as pd

# Input data
data = [
    ['sunny', 'warm', 'normal', 'strong', 'warm', 'same', 'yes'],
    ['sunny', 'warm', 'high', 'strong', 'warm', 'same', 'yes'],
    ['rainy', 'cold', 'high', 'strong', 'warm', 'change', 'no'],
    ['sunny', 'warm', 'normal', 'strong', 'cool', 'change', 'yes']
]

# Create DataFrame
df = pd.DataFrame(data, columns=['Outlook', 'Temperature', 'Humidity', 'Wind', 'Water', 'Forecast', 'PlayTennis'])
print("Input DataFrame:")
print(df)

# Convert DataFrame to list of values
a = df.values.tolist()

# Initialize specific and general hypotheses
n = len(a[0]) - 1
s = a[0][:-1]  # Initial specific hypothesis
g = ['?'] * n  # General hypothesis

print("\nInitial Specific Hypothesis (s):", s)
print("Initial General Hypothesis (g):", g)

# Candidate-Elimination Algorithm
temp = []
for i in range(len(a)):
    if a[i][n] == 'yes':  # Positive example
        for j in range(n):
            if a[i][j] != s[j]:
                s[j] = '?'  # Generalize s
    else:  # Negative example
        for j in range(n):
            if s[j] != a[i][j] and s[j] != '?':
                new_g = g.copy()
                new_g[j] = s[j]
                if new_g not in temp:
                    temp.append(new_g)

# Filter the general hypotheses
final_g = []
for g_hyp in temp:
    valid = True
    for j in range(n):
        if g_hyp[j] != '?' and g_hyp[j] != s[j]:
            valid = False
            break
    if valid:
        final_g.append(g_hyp)

# Output final hypotheses
print("\nFinal Specific Hypothesis (s):", s)
print("Final General Hypotheses (g):")
for hyp in final_g:
    print(hyp)
