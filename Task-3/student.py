#!/usr/bin/env python
# coding: utf-8



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







