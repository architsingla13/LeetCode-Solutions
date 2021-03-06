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
* [Binary Search Tree](https://github.com/architsingla13/LeetCode-Solutions#binary-search-tree)
* [Breadth-First Search](https://github.com/architsingla13/LeetCode-Solutions#bfs)
* [Depth-First Search](https://github.com/architsingla13/LeetCode-Solutions#dfs)
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
|136| [Single Number](https://leetcode.com/problems/single-number/description/)      | [Java](./Algorithms/BitManipulation/SingleNumber.java)  | _O(n)_         | _O(1)_          | Easy         | |
|693| [Binary Number with Alternating Bits](https://leetcode.com/problems/binary-number-with-alternating-bits/description/)      | [Java](./Algorithms/BitManipulation/AlternatingBits.java)  | _O(1)_         | _O(1)_          | Easy         | |
|762| [Prime Number of Set Bits in Binary Representation](https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/)      | [Java](./Algorithms/BitManipulation/PrimaryOfSetBits.java)  | _O(R-L)_         | _O(1)_          | Easy         | Good Question|


## Array


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|832| [Flipping an Image](https://leetcode.com/problems/flipping-an-image/description/)      | [Java](./Algorithms/Array/FlippingImage.java)  | _O(n*m)_         | _O(1)_          | Easy         | Thoughtful for max optimisation |
|561| [Array Partition I](https://leetcode.com/problems/array-partition-i/description/)      | [Java](./Algorithms/Array/ArrayPartition1.java)  | _O(nlogn)_         | _O(1)_          | Easy         |  |
|867| [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/description/)      | [Java](./Algorithms/Array/Transpose.java)  | _O(r*c)_         | _O(r*c)_          | Easy         |  |
|806| [Number of Lines To Write String](https://leetcode.com/problems/number-of-lines-to-write-string/description/)      | [Java](./Algorithms/Array/NumberLines.java)  | _O(n)_         | _O(1)_          | Easy         |  n = string length|
|766| [Toeplitz Matrix](https://leetcode.com/problems/toeplitz-matrix/description/)      | [Java](./Algorithms/Array/ToeplitzMatrix.java)  | _O(n*m)_         | _O(1)_          | Easy         |  |
|463| [Island Perimeter](https://leetcode.com/problems/island-perimeter/description/)      | [Java](./Algorithms/Array/IslandPerimeter.java)  | _O(n*m)_         | _O(1)_          | Easy         |  |
|412| [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/description/)      | [Java](./Algorithms/Array/FizzBuzz.java)  | _O(n)_         | _O(1)_          | Easy         |  |
|566| [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/description/)      | [Java](./Algorithms/Array/Reshape.java)  | _O(n*m)_         | _O(n*m)_          | Easy         |  |
|892| [Surface Area of 3D Shapes](https://leetcode.com/problems/surface-area-of-3d-shapes/description/)      | [Java](./Algorithms/Array/SurfaceArea.java)  | _O(n^2)_         | _O(1)_          | Easy         |  |
|485| [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/description/)      | [Java](./Algorithms/Array/Max1s.java)  | _O(n)_         | _O(1)_          | Easy         |  |


## String


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|709| [To Lower Case ](https://leetcode.com/problems/to-lower-case/description/)      | [Java](./Algorithms/String/ToLowerCase.java)  | _O(n)_         | _O(1)_          | Easy         | n is of input|
|804| [Unique Morse Code Words](https://leetcode.com/problems/unique-morse-code-words/description/)      | [Java](./Algorithms/String/UniqueMorseCode.java)  | _O(n)_         | _O(n)_          | Easy         | n is sum of all words length|
|657| [Judge Route Circle](https://leetcode.com/problems/judge-route-circle/description/)      | [Java](./Algorithms/String/JudgeRouteCircle.java)  | _O(n)_         | _O(1)_          | Easy         | n is string length|
|557| [Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/description/)      | [Java](./Algorithms/String/Reverse111.java)  | _O(n)_         | _O(n)_          | Easy         | n is of A |
|344| [Reverse String](https://leetcode.com/problems/reverse-string/description/)      | [Java](./Algorithms/String/Reverse.java)  | _O(n)_         | _O(n)_          | Easy         | n is of A |
|821| [Shortest Distance to a Character](https://leetcode.com/problems/shortest-distance-to-a-character/description/)      | [Java](./Algorithms/String/Shortest.java)  | _O(n)_         | _O(n)_          | Easy         | n is of A ; Tricky to think for simplest solution|
|521| [Longest Uncommon Subsequence I](https://leetcode.com/problems/longest-uncommon-subsequence-i/description/)      | [Java](./Algorithms/String/LongestUncommonSubseq.java)  | _O(min(a,b))_         | _O(1)_          | Easy         | Good puzzle|
|824| [Goat Latin](https://leetcode.com/problems/goat-latin/description/)      | [Java](./Algorithms/String/GoatLatin.java)  | _O(N + W^2)_         | _O(N)_          | Easy         | Good to visualise complexity |
|443| [String Compression](https://leetcode.com/problems/string-compression/description/)      | [Java](./Algorithms/String/StringCompression.java)  | _O(n)_         | _O(1)_          | Easy         |  |


## LinkedList


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|876| [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/description/)      | [Java](./Algorithms/LinkedList/MiddleNode.java)  | _O(n)_         | _O(1)_          | Easy         | fast and slow pointers |


## Stack


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|682| [Baseball Game](https://leetcode.com/problems/baseball-game/description/)      | [Java](./Algorithms/Stack/Baseball.java)  | _O(n)_         | _O(n)_          | Easy         |  |
|225| [Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/description/)      | [Java](./Algorithms/Stack/ImplementStack.java)  | _(O(n) - push, O(1) - rest ops)_         | _O(1)_          | Easy         |  |


## Tree


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|617| [Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/description/)      | [Java](./Algorithms/Tree/MergeTwoBinaryTrees.java)  | _O(n )_         | _O(n)_(Worst Case)          | Easy         | n is min. num of nodes|
|872| [Leaf-Similar Trees](https://leetcode.com/problems/leaf-similar-trees/description/)      | [Java](./Algorithms/Tree/LeafSimilar.java)  | _O(n)_         | _O(h)_          | Easy         | h = max height of tree, n = max num of nodes|
|559| [Maximum Depth of N-ary Tree](https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/)      | [Java](./Algorithms/Tree/MaxDepthNAry.java)  | _O(n)_         | _O(h)_          | Easy         | h = max height of tree, n = max num of nodes|
|590| [N-ary Tree Postorder Traversal](https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/)      | [Java](./Algorithms/Tree/NaryPostOrder.java)  | _O(n)_         | _O(n)_          | Easy         | n = Total num of nodes, Iterative solution is a must|
|669| [Trim a Binary Search Tree](https://leetcode.com/problems/trim-a-binary-search-tree/description/)      | [Java](./Algorithms/Tree/TrimBST.java)  | _O(n)_         | _O(n)_          | Easy         | n = Total num of nodes|
|104| [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)      | [Java](./Algorithms/Tree/MaxDepth.java)  | _O(n)_         | _O(n)_          | Easy         | n = Total num of nodes|
|589| [N-ary Tree Preorder Traversal](https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/)      | [Java](./Algorithms/Tree/NAryPreorder.java)  | _O(n)_         | _O(n)_          | Easy         | n = Total num of nodes|
|226| [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/description/)      | [Java](./Algorithms/Tree/InvertTree.java)  | _O(n)_         | _O(n)_          | Easy         | n = Total num of nodes|


## HashTable


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|771| [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/description/)      | [Java](./Algorithms/HashTable/JewelsAndStones.java)  | _O(n + m)_         | _O(n)_          | Easy         | n is of J and m is of S |
|884| [Uncommon Words from Two Sentences](https://leetcode.com/problems/uncommon-words-from-two-sentences/description/)      | [Java](./Algorithms/HashTable/UncommonWords.java)  | _O(n + m)_         | _O(n + m)_          | Easy         | n is of A and m is of B |
|811| [Subdomain Visit Count](https://leetcode.com/problems/subdomain-visit-count/description/)      | [Java](./Algorithms/HashTable/SubDomain.java)  | _O(n)_         | _O(n)_          | Easy         | n is of cpDomains|
|500| [Keyboard Row](https://leetcode.com/problems/keyboard-row/description/)      | [Java](./Algorithms/HashTable/KeyboardRow.java)  | _O(n)_         | _O(n)_          | Easy         | n is of all words length sum|
|575| [Distribute Candies](https://leetcode.com/problems/distribute-candies/description/)      | [Java](./Algorithms/HashTable/DistributeCandies.java)  | _O(n)_         | _O(n)_          | Easy         | Good question for thinking and optimising|
|888| [Fair Candy Swap](https://leetcode.com/problems/fair-candy-swap/description/)      | [Java](./Algorithms/HashTable/FairCandySwap.java)  | _O(n)_         | _O(n)_          | Easy         | |
|496| [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/description/)      | [Java](./Algorithms/HashTable/NextGreater1.java)  | _O(n)_         | _O(n)_          | Easy         | Good question to consider|


## Math


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|883| [Projection Area of 3D Shapes](https://leetcode.com/problems/projection-area-of-3d-shapes/)      | [Java](./Algorithms/Math/Projection.java)  | _O(n*n)_         | _O(1)_          | Easy         |  |
|728| [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/description/)      | [Java](./Algorithms/Math/SelfDividing.java)  | _O(n)_(n = num of numbers between [l,r])         | _O(n)_          | Easy         | Assuming R is bounded |
|292| [Nim Game](https://leetcode.com/problems/nim-game/description/)      | [Java](./Algorithms/Math/NimGame.java)  | _O(1)_         | _O(1)_          | Easy         |  |
|812| [Largest Triangle Area](https://leetcode.com/problems/largest-triangle-area/description/)      | [Java](./Algorithms/Math/TriangleArea.java)  | _O(n^3)_         | _O(1)_          | Easy         | Know formula to solve this|
|67| [Add Binary](https://leetcode.com/problems/add-binary/description/)      | [Java](./Algorithms/Math/AddBinary.java)  | _O(max(a,b))_         | _O(1)_          | Easy         | |


## Binary Search


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|852| [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/description/)      | [Java](./Algorithms/BinarySearch/PeakMountain.java)  | _O(n)_         | _O(1)_          | Easy         |  |
|704| [Binary Search](https://leetcode.com/problems/binary-search/description/)      | [Java](./Algorithms/BinarySearch/BinarySearch.java)  | _O(log(n))_         | _O(1)_          | Easy         |  |


## Binary Search Tree


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|700| [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/description/)      | [Java](./Algorithms/BinarySearchTree/Search.java)  | _O(logn)_         | _O(1)_          | Easy         | |


## BFS


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|637| [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/description/)      | [Java](./Algorithms/BFS/AverageOfLevels.java)  | _O(n)_         | _O(m)_          | Easy         | n = total nodes, m = max nodes at any level; Can be solved by DFS as well, Must look|
|429| [N-ary Tree Level Order Traversal](https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/)      | [Java](./Algorithms/BFS/NaryLevelOrder.java)  | _O(n)_         | _O(m)_          | Easy         | n = total nodes, m = max nodes at any level;|

## DFS


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|897| [Increasing Order Search Tree](https://leetcode.com/problems/increasing-order-search-tree/description/)      | [Java](./Algorithms/DFS/IncreasingOrder.java)  | _O(n)_         | _O(h)_          | Easy         | n = total nodes, h = max height; Iterative Solution; Bookmarked|
|112| [Path Sum](https://leetcode.com/problems/path-sum/description/)      | [Java](./Algorithms/DFS/PathSum.java)  | _O(n)_         | _O(h)_          | Easy         | n = total nodes, h = max height; |
