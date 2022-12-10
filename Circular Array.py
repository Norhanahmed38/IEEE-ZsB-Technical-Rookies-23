def circularArrayRotation(a, k, queries):
	n=len(a)
	
	ans=[]
	for q in queries:
		ans.append(a[(n-k+q)%n])
		
	return ans