# CS232 — Project III: Binary Search Tree (BST)

## Overview

This project builds on the `BSTNode` and `BST` generic classes covered in class. `BSTNode` uses `protected` properties so the package-sharing `BST` class can access them directly without method calls.

The provided starter code constructs two generic trees — one from `String` elements and one from `Integer` elements. Your task is to complete the `TODO` sections for `insert`, `remove`, and their helper methods.

---

## Getting Started

Import and implement this as a new project in **Eclipse** or the IDE of your choice.

---

## TODO: BST Insert

Build up the tree by:

1. Identifying the **parent node** using the provided `search()` method
2. Creating a new `BSTNode` and inserting it at the appropriate left or right position under the parent

---

## TODO: Display — `inorder()`

Implement `inorder()` to perform an **in-order traversal** and print the value of each node.

---

## TODO: BST Remove

There are **three removal cases** in a BST:

### Case A — Leaf Node (easiest)

1. Use `search()` to find the **parent** of the node to remove
2. Confirm the target child is a **leaf** (no children)
3. Set the parent's `left` or `right` reference (as appropriate) to `null`

> ✅ Run `inorder()` to verify the node is removed and all others remain.

---

### Case B — Single Child

1. Use `search()` to find the **parent** of the node to remove
2. Confirm the target node has **exactly one child** (one side is `null`, the other is not)
3. The parent **adopts the grandchild** — set the parent's reference (previously pointing to the deleted node) to that node's only child

> ✅ Run `inorder()` to verify the node is removed and all others remain.

---

### Case C — Two Children

> This case requires the provided `inOrderSuccessor()` helper method.

**How it works:** When deleting a node with two children, you do not actually remove that node directly. Instead:

1. Find the **in-order successor (IOS)** of the node to delete by calling `inOrderSuccessor(del)`
2. **Save** the IOS node's data (key)
3. **Remove** the IOS node by calling `remove()` on its key *(the IOS cannot have two children, so this falls into Case A or B)*
4. **Copy** the saved IOS key into the node you originally targeted

**Example:** In a tree containing `15, 17, 22, 23, 25, 27`:
- In-order successor of `15` → `17`
- In-order successor of `25` → `27`
- In-order successor of `22` → `23`

> ✅ Run `inorder()` to verify the node is removed and all others remain.

---

## Expected Program Output

```
TEST_STRING_INSERTS

[ abacus cat dog doggie grass hello stan tree zebra ]

[ abacus cat dog doggie grass hello house stan television tree zebra ]


TEST_INT_INSERTS

[ 1 2 4 18 19 20 21 22 25 27 29 31 32 33 37 39 40 41 44 55 58 59 63 66 67 68 69 72 73 75 81 82 83 85 87 88 92 93 97 ]


TEST_REMOVE_CASE_1_AND_3

[ 1 2 3 4 5 6 7 ]

[ 2 3 4 5 6 7 ]

[ 3 4 5 6 7 ]

[ 3 4 6 7 ]

[ 3 4 7 ]


TEST_REMOVE_CASE_2

[ 1 2 3 4 5 6 7 ]

[ 1 3 4 5 6 7 ]

[ 1 3 4 5 7 ]
```

---

## Remove — Logic Summary

| Case | Condition | Action |
|------|-----------|--------|
| **A — Leaf** | No children | Set parent's child reference to `null` |
| **B — One Child** | One side is `null` | Parent adopts the single grandchild |
| **C — Two Children** | Both children exist | Replace node's value with in-order successor's value, then delete the successor |
