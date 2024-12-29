import pandas as pd
import numpy as np
from sklearn.preprocessing import OrdinalEncoder, LabelEncoder
customers_df= pd.read_csv("customers.csv")

products_df= pd.read_csv("products.csv")
orders_df= pd.read_csv("orders.csv")
print(customers_df)
print(products_df)
print(orders_df)

# Fill missing values in 'age' with the mean age
customers_df['age'].fillna(customers_df['age'].mean(), inplace=True)

# Fill missing values in 'email' with 'N/A'
customers_df['email'].fillna('N/A', inplace=True)

# Merge the datasets
merged_df = pd.merge(
    pd.merge(customers_df, orders_df, on='customer_id'),
    products_df,
    on='product_id'
)

# Add a new column 'total_price' (quantity * price)
merged_df['total_price'] = merged_df['quantity'] * merged_df['price']

# Add a new column 'Feed_back': "Good" if quantity > 1, otherwise "Bad"
merged_df['Feed_back'] = np.where(merged_df['quantity'] > 1, "Good", "Bad")

# Display the cleaned and transformed data
print("\nCleaned, Integrated, and Transformed Data:")
print(merged_df)

# Apply ordinal encoding to the entire merged DataFrame
ordinal_encoder = OrdinalEncoder()
label_encode = LabelEncoder()

merged_ordinal_encoded = ordinal_encoder.fit_transform(merged_df)

# Apply label encoding to the 'Feed_back' column

feed_back_encoded = label_encode.fit_transform(merged_df['Feed_back'])

# Display encoded features and target
print("\nEncoded Features:")
print(merged_ordinal_encoded)

print("\nEncoded Target (Feed_back):")
print(feed_back_encoded)