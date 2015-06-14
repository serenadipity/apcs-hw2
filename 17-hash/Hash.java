/*
hashing/hash tables
    you want to store data in a table (array) by some unique ID.

a hash function is a mapping that takes an ID and converts it into a table
index.
ex: ID is OSIS#
  hcx)= x%10000
       better might be:
        h(x) = (product of all nonzero digits in x) % 10000
       	                                            ^always end
       	                                            w/% tablesize
when multiple IDs hash to the same table index we have a collision or clash
--> your hash table must be large enough so that it is sparsely populated
       
--> try to have a good hash function, one that distributes our IDs all over
    the array

h=1;
for (i=0 to length(s))) {
   h = h * 3 + int(s.charAt(i)));
}
return h % tablesize

*/
