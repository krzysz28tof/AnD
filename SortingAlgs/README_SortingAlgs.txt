Notes:
Short:
	ground middle => includi middle in left partition
	recursiveMergeSort creates partitions where middle only shifts by 1
	straightMergeSort creates partitions where middle can shift by a lot
	Recursion can give StackOverflow	

Explenation
Ground middle and include in left shifts middle by less then 1 element. By grounding and not including it shifts more.

Doing rekursiveMergeSort middle is exactly between left and right.
Doing straightMergeSort we first try to partition as much powers of two as possible, and are then left with a rest partition. In that rest partition the middle calculated by (left + right)/2 doesn't hold.

