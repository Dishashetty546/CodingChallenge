def fuzzy_union(set1,set2):
    union_set={}
    for element in set1:
        if element in set2:
            union_set[element]= max(set1[element], set2[element])
        else:
            union_set[element]= set1[element]
    return union_set
    for element in set2:
        if element in set1:
            union_set[element]= max(set1[element], set2[element])
        else:
            union_set[element]=set1[element]
def fuzzy_intersection(set1,set2):
    intersection_set={}
    for element in set1:
        if element in set2:
            intersection_set[element]= min(set1[element],set2[element])
    return intersection_set
def display_fuzzy_set(fuzzy_set):
    for element,membership in fuzzy_set.items():
        print(f"{element}:{membership:.2f}")
set1={'a':0.5,'b':0.7,'d':0.9}
set2={'a':0.9,'b':0.8,'c':0.8}

union= fuzzy_union(set1,set2)
intersection= fuzzy_intersection(set1,set2)

print("union of numbers")
display_fuzzy_set(union)

print("intersection of numbers")
display_fuzzy_set(intersection)
        
    

        
    
