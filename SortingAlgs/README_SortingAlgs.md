## Notes
### Short
recursion can give StackOverflow <br>
ground middle => include middle in left partition <br>
recursiveMergeSort creates partitions where middle only shifts by 1 <br>
straightMergeSort creates partitions where middle can shift by a lot <br>
naturalMergeSort has best case <b>O</b>(n) if array sorted <br>

### Explenation
Recursion forces computer to create stack frames for every function call, which generates a lot of unneccessary data. <br>

Grounding middle and include middle element in left partition shifts middle by less than 1 element. <br>

Doing recursive MS middle is exactly between left and right and both get passed down in the recursion call in a way. <br>
Doing straight MS we partition the array in as many partitions of length 2^i as possible, which leaves us with a weird partition at the end. For that weird partition (left + right)/2 doesn't hold.
