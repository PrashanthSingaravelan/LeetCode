s = "codeleet"
indices = [4,5,6,7,0,2,1,3]

cnt = 0
ans = [0]*len(indices)
print("index  value")
for i,j in zip(indices, range(len(indices))):
    ans[i] = s[j]
    print(i, "      ", s[j])
print(ans)


cnt = 0
ans = []
print("index  value")
for i,j in zip(indices, range(len(indices))):
    ans.insert(i, s[j])
    print(i, "      ", s[j])
print(ans)