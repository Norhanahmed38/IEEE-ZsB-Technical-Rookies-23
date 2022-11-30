#!/usr/bin/env python
# coding: utf-8

# In[7]:




students = []

scores = []

for N in range(int(input())):

    name = input()

    score = float(input())

    scores.append(score)

    students.append([name, score])

    

        

count = scores.count(min(scores))

for i in range(count):

    scores.remove(min(scores))

        

    secondHigh = min(scores)

    

    students.sort()

    output = [x for x in students if x[1] == secondHigh]

    for i in output:

        print(i[0])


# In[13]:


score_lst = []

marksheet = []

for _ in range(int(input())):

    name = input()

    score = float(input())

    marksheet.append([name,score])

    score_lst.append(score)

second_lowest = sorted(list(set(score_lst)))[1]

names = [name for name,marks in sorted(marksheet) if marks == second_lowest]

print('\n'.join(names))


# In[11]:



students = []

scores = []

for N in range(int(input())):

    name = input()

    score = float(input())

    scores.append(score)

    students.append([name, score])





count = scores.count(min(scores))

for i in range(count):

    scores.remove(min(scores))



secondHigh = min(scores)



students.sort()

output = [x for x in students if x[1] == secondHigh]

for i in output:

    print(i[0])


# In[ ]:




