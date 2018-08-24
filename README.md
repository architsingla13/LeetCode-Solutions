# [LeetCode-Solutions](https://leetcode.com/problemset/algorithms/)

Solutions to the LeetCode evergoing problems in Java

## Algorithms
* [Bit Manipulation](https://github.com/architsingla13/LeetCode-Solutions#bitmanipulation)
* [Array](https://github.com/architsingla13/LeetCode-Solutions#array)
* [String](https://github.com/architsingla13/LeetCode-Solutions#string)
* [Linked List](https://github.com/architsingla13/LeetCode-Solutions#linkedlist)
* Stack
* Queue
* Heap
* [Tree](https://github.com/architsingla13/LeetCode-Solutions#tree)
* [Hash Table](https://github.com/architsingla13/LeetCode-Solutions#hashtable)
* [Math](https://github.com/architsingla13/LeetCode-Solutions#math)
* Two Pointers
* Sort
* Recursion
* [Binary Search](https://github.com/architsingla13/LeetCode-Solutions#binarysearch)
* Binary Search Tree
* Breadth-First Search
* Depth-First Search
* Backtracking
* Dynamic Programming
* Greedy
* Graph
* Geometry
* Simulation
* Design


## BitManipulation


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|461| [Hamming Distance](https://leetcode.com/problems/hamming-distance/description/)      | [Java](./Algorithms/BitManipulation/HammingDistance.java)  | _O(1)_         | _O(1)_          | Easy         | Thoughtful for max optimisation |
|476| [Number Complement](https://leetcode.com/problems/number-complement/description/)      | [Java](./Algorithms/BitManipulation/Complement.java)  | _O(logn)_         | _O(1)_          | Easy         |  |
|868| [Binary Gap](https://leetcode.com/problems/binary-gap/description/)      | [Java](./Algorithms/BitManipulation/BinaryGap.java)  | _O(logn)_         | _O(1)_          | Easy         | n is here constant = 32, O(logn) = O(1)|


## Array


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|832| [Flipping an Image](https://leetcode.com/problems/flipping-an-image/description/)      | [Java](./Algorithms/Array/FlippingImage.java)  | _O(n*m)_         | _O(1)_          | Easy         | Thoughtful for max optimisation |
|561| [Array Partition I](https://leetcode.com/problems/array-partition-i/description/)      | [Java](./Algorithms/Array/ArrayPartition1.java)  | _O(nlogn)_         | _O(1)_          | Easy         |  |
|867| [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/description/)      | [Java](./Algorithms/Array/Transpose.java)  | _O(r*c)_         | _O(r*c)_          | Easy         |  |
|806| [Number of Lines To Write String](https://leetcode.com/problems/number-of-lines-to-write-string/description/)      | [Java](./Algorithms/Array/NumberLines.java)  | _O(n)_         | _O(1)_          | Easy         |  n = string length|
|766| [Toeplitz Matrix](https://leetcode.com/problems/toeplitz-matrix/description/)      | [Java](./Algorithms/Array/ToeplitzMatrix.java)  | _O(n*m)_         | _O(1)_          | Easy         |  |
|463| [Island Perimeter](https://leetcode.com/problems/island-perimeter/description/)      | [Java](./Algorithms/Array/IslandPerimeter.java)  | _O(n*m)_         | _O(1)_          | Easy         |  |


## String


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|709| [To Lower Case ](https://leetcode.com/problems/to-lower-case/description/)      | [Java](./Algorithms/String/ToLowerCase.java)  | _O(n)_         | _O(1)_          | Easy         | n is of input|
|804| [Unique Morse Code Words](https://leetcode.com/problems/unique-morse-code-words/description/)      | [Java](./Algorithms/String/UniqueMorseCode.java)  | _O(n)_         | _O(n)_          | Easy         | n is sum of all words length|
|657| [Judge Route Circle](https://leetcode.com/problems/judge-route-circle/description/)      | [Java](./Algorithms/String/JudgeRouteCircle.java)  | _O(n)_         | _O(1)_          | Easy         | n is string length|
|557| [Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/description/)      | [Java](./Algorithms/String/Reverse111.java)  | _O(n)_         | _O(n)_          | Easy         | n is of A |
|344| [Reverse String](https://leetcode.com/problems/reverse-string/description/)      | [Java](./Algorithms/String/Reverse.java)  | _O(n)_         | _O(n)_          | Easy         | n is of A |
|821| [Shortest Distance to a Character](https://leetcode.com/problems/shortest-distance-to-a-character/description/)      | [Java](./Algorithms/String/Shortest.java)  | _O(n)_         | _O(n)_          | Easy         | n is of A ; Tricky to think for simplest solution|


## LinkedList


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|876| [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/description/)      | [Java](./Algorithms/LinkedList/MiddleNode.java)  | _O(n)_         | _O(1)_          | Easy         | fast and slow pointers |


## Stack


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|682| [Baseball Game](https://leetcode.com/problems/baseball-game/description/)      | [Java](./Algorithms/Stack/Baseball.java)  | _O(n)_         | _O(n)_          | Easy         |  |


## Tree


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|617| [Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/description/)      | [Java](./Algorithms/Tree/MergeTwoBinaryTrees.java)  | _O(n )_         | _O(n)_(Worst Case)          | Easy         | n is min. num of nodes|
|872| [Leaf-Similar Trees](https://leetcode.com/problems/leaf-similar-trees/description/)      | [Java](./Algorithms/Tree/LeafSimilar.java)  | _O(n)_         | _O(h)_          | Easy         | h = max height of tree, n = max num of nodes|
|559| [Maximum Depth of N-ary Tree](https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/)      | [Java](./Algorithms/Tree/MaxDepthNAry.java)  | _O(n)_         | _O(h)_          | Easy         | h = max height of tree, n = max num of nodes|
|590| [N-ary Tree Postorder Traversal](https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/)      | [Java](./Algorithms/Tree/NaryPostOrder.java)  | _O(n)_         | _O(n)_          | Easy         | n = Total num of nodes, Iterative solution is a must|
|669| [Trim a Binary Search Tree](https://leetcode.com/problems/trim-a-binary-search-tree/description/)      | [Java](./Algorithms/Tree/TrimBST.java)  | _O(n)_         | _O(n)_          | Easy         | n = Total num of nodes|



## HashTable


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|771| [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/description/)      | [Java](./Algorithms/HashTable/JewelsAndStones.java)  | _O(n + m)_         | _O(n)_          | Easy         | n is of J and m is of S |
|884| [Uncommon Words from Two Sentences](https://leetcode.com/problems/uncommon-words-from-two-sentences/description/)      | [Java](./Algorithms/HashTable/UncommonWords.java)  | _O(n + m)_         | _O(n + m)_          | Easy         | n is of A and m is of B |
|811| [Subdomain Visit Count](https://leetcode.com/problems/subdomain-visit-count/description/)      | [Java](./Algorithms/HashTable/SubDomain.java)  | _O(n)_         | _O(n)_          | Easy         | n is of cpDomains|
|500| [Keyboard Row](https://leetcode.com/problems/keyboard-row/description/)      | [Java](./Algorithms/HashTable/KeyboardRow.java)  | _O(n)_         | _O(n)_          | Easy         | n is of all words length sum|
|575| [Distribute Candies](https://leetcode.com/problems/distribute-candies/description/)      | [Java](./Algorithms/HashTable/DistributeCandies.java)  | _O(n)_         | _O(n)_          | Easy         | Good question for thinking and optimising|


## Math


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|883| [Projection Area of 3D Shapes](https://leetcode.com/problems/projection-area-of-3d-shapes/)      | [Java](./Algorithms/Math/Projection.java)  | _O(n*n)_         | _O(1)_          | Easy         |  |
|728| [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/description/)      | [Java](./Algorithms/Math/Projection.java)  | _O(n)_(n = num of numbers between [l,r])         | _O(n)_          | Easy         | Assuming R is bounded |


## Binary Search


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|852| [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/description/)      | [Java](./Algorithms/BinarySearch/PeakMountain.java)  | _O(n)_         | _O(1)_          | Easy         |  |


