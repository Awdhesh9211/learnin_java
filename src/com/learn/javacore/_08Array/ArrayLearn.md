📘 Explanation in Markdown
# Arrays in Java (With Methods)

Arrays are **objects** in Java, and the `java.util.Arrays` class provides many **utility methods** to work with them.

---

## 1. Common Methods in `Arrays` Class

### a) `toString()`
Converts 1D array into a readable string.
```java
System.out.println(Arrays.toString(arr));


Output:

[5, 2, 9, 1, 7]

b) sort()

Sorts the array in ascending order.

Arrays.sort(arr);

c) binarySearch()

Searches an element in a sorted array and returns its index.

int index = Arrays.binarySearch(arr, 7);

d) copyOf()

Creates a copy of an array.

int[] copy = Arrays.copyOf(arr, arr.length);

e) fill()

Fills the entire array with a given value.

int[] filled = new int[5];
Arrays.fill(filled, 42); // [42, 42, 42, 42, 42]

f) equals()

Checks if two arrays are equal.

Arrays.equals(arr1, arr2);

g) deepToString() (For 2D / Jagged Arrays)

Converts multi-dimensional arrays into a readable string.

System.out.println(Arrays.deepToString(matrix));

2. Example Output
=== 1D Array (Original) ===
[5, 2, 9, 1, 7]
Sorted: [1, 2, 5, 7, 9]
Index of 7: 3
Copy: [1, 2, 5, 7, 9]
Filled: [42, 42, 42, 42, 42]
arr equals copy? true

=== 2D Array ===
[[1, 2, 3], [4, 5, 6]]

=== Jagged Array ===
[[10, 20], [30, 40, 50]]

🔑 Key Points

Use Arrays.toString() for 1D arrays,

Use Arrays.deepToString() for 2D/jagged arrays.

Arrays.sort() + Arrays.binarySearch() are most commonly used in algorithms.

Arrays.copyOf() and Arrays.fill() are useful in initialization.