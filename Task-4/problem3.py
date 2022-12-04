def minimumDistance(a):
    hmap = dict()
    minDistance = 100
    previousIndex = 0
    currentIndex = 0
    for i in range(len(a)):
        if a[i] in hmap:
            currentIndex = i
            previousIndex = hmap[a[i]]
            minDistance = min((currentIndex -
                        previousIndex), minDistance)
        hmap[a[i]] = i
    return minDistance
x = [2,5,3,4,5,2]
print(minimumDistance(x))
