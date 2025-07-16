import numpy as np
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity
from scipy.spatial.distance import euclidean, cityblock, jaccard
from sklearn.decomposition import TruncatedSVD

# Taking Inputs from User
documents = []
n = int(input("Enter the number of documents: "))
print("Enter the documents:")
for i in range(n):
    doc = input(f"D{i+1}: ").strip()
    documents.append(doc)

query = input("Enter the query: ").strip()

# Vector Space Model (VSM) - TF-IDF Representation
print("\n=== Vector Space Model (VSM) ===")
vectorizer = TfidfVectorizer()
vsm_matrix = vectorizer.fit_transform(documents + [query])
feature_names = vectorizer.get_feature_names_out()
vsm_matrix_dense = vsm_matrix.toarray()

print("\nTF-IDF Matrix:")
for i, vec in enumerate(vsm_matrix_dense):
    print(f"D{i+1 if i < len(documents) else 'Query'}: {vec}")

print("\nTF-IDF Feature Names:")
print(feature_names)

# Latent Semantic Analysis (LSA) - Dimensionality Reduction
print("\n=== Latent Semantic Analysis (LSA) ===")
lsa = TruncatedSVD(n_components=2)
lsa_matrix = lsa.fit_transform(vsm_matrix_dense)

print("\nLSA Matrix:")
for i, vec in enumerate(lsa_matrix):
    print(f"D{i+1 if i < len(documents) else 'Query'}: {vec}")

# Separating Query Vector
query_vector = vsm_matrix_dense[-1]
document_vectors = vsm_matrix_dense[:-1]
query_vector_lsa = lsa_matrix[-1]
document_vectors_lsa = lsa_matrix[:-1]

# Similarity Calculations
scores = []
scores_lsa = []

print("\n=== VSM Similarity Scores ===")
for i, doc_vector in enumerate(document_vectors):
    print(f"\nDocument D{i+1} Vector (TF-IDF): {doc_vector}")
    cosine_sim = cosine_similarity([query_vector], [doc_vector])[0][0]
    euclid_dist = euclidean(query_vector, doc_vector)
    manhattan_dist = cityblock(query_vector, doc_vector)
    dice_coeff = 2 * np.sum(np.minimum(query_vector, doc_vector)) / (np.sum(query_vector) + np.sum(doc_vector))
    jaccard_sim = 1 - jaccard(query_vector > 0, doc_vector > 0)
    scores.append((i + 1, cosine_sim, euclid_dist, manhattan_dist, jaccard_sim, dice_coeff))
    print(f"Cosine: {cosine_sim:.4f}, Euclidean: {euclid_dist:.4f}, Manhattan: {manhattan_dist:.4f}, Jaccard: {jaccard_sim:.4f}, Dice: {dice_coeff:.4f}")

print("\n=== LSA Similarity Scores ===")
for i, doc_vector_lsa in enumerate(document_vectors_lsa):
    print(f"\nDocument D{i+1} Vector (LSA): {doc_vector_lsa}")
    cosine_sim_lsa = cosine_similarity([query_vector_lsa], [doc_vector_lsa])[0][0]
    euclid_dist_lsa = euclidean(query_vector_lsa, doc_vector_lsa)
    manhattan_dist_lsa = cityblock(query_vector_lsa, doc_vector_lsa)
    dice_coeff_lsa = 2 * np.sum(np.minimum(query_vector_lsa, doc_vector_lsa)) / (np.sum(query_vector_lsa) + np.sum(doc_vector_lsa))
    jaccard_sim_lsa = 1 - jaccard(query_vector_lsa > 0, doc_vector_lsa > 0)
    scores_lsa.append((i + 1, cosine_sim_lsa, euclid_dist_lsa, manhattan_dist_lsa, jaccard_sim_lsa, dice_coeff_lsa))
    print(f"Cosine: {cosine_sim_lsa:.4f}, Euclidean: {euclid_dist_lsa:.4f}, Manhattan: {manhattan_dist_lsa:.4f}, Jaccard: {jaccard_sim_lsa:.4f}, Dice: {dice_coeff_lsa:.4f}")

# Sorting by Cosine Similarity (or any other metric as needed)
print("\nTop 2 Relevant Documents (VSM) by Cosine Similarity:")
sorted_scores = sorted(scores, key=lambda x: x[1], reverse=True)[:2]
for doc_id, cos, _, _, _, _ in sorted_scores:
    print(f"D{doc_id}")

print("\nTop 2 Relevant Documents (LSA) by Cosine Similarity:")
sorted_scores_lsa = sorted(scores_lsa, key=lambda x: x[1], reverse=True)[:2]
for doc_id, cos, _, _, _, _ in sorted_scores_lsa:
    print(f"D{doc_id}")
