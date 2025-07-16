import numpy as np
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity
from scipy.spatial.distance import euclidean,cityblock,jaccard
from sklearn.decomposition import TruncatedSVD

documents=[]

n= int(input("Enter the number of documents: "))

print("Enter the documents:")
for i in range(n):
    doc=input("D{i+1}:").strip()
    documents.append(doc)

query= input("Enter the query:").strip()

