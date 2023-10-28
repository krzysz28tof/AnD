# Sorting Algorithms
<hr>

## Implemented
rekursiveMergeSort <br>
straightMergeSort <br>
naturalMergeSort <br>
quickSort

## Comparison
<table>
    <tr> <th></th> <th>mergeSort</th> <th>quickSort</th> </tr>
    <tr> <th>Runtime</th>  <td><b>O</b>(n * log(n))</td> <td>(<i>O(n^2)</i>) avg.: <b>O</b>(n * log(n))</td> </tr>
    <tr> <th>Swaps</th>  <td><b>O</b>(n * log(n))</td>  <td>(<i>O(n^2)</i>) avg.: <b>O</b>(n * log(n))</td> </tr>
    <tr> <th>Extra space</th> <td><b>O</b>(n)</td> <td><b>O</b>(1)</td> </tr>

</table>

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
