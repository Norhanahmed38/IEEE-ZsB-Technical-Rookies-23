def groupAna(strs):
        hstr = {}
        for string in strs :
            sortedString= ''.join(sorted(string))
            if sortedString in hstr:
                hstr[sortedString].append(string)
            else:
                hstr[sortedString]=[string]
        return list(hstr.values())
lst = ['eat','tea','tan','ate','nat','bat']
print(groupAna(lst))