package BSTBuilder;
 

public class driver1 {
 
	public static void main(String[] args) 
	{

	 	
		BST<Integer> tree3 = new BST<>();
		// insert some ints
		tree3.insert(4);
		tree3.insert(2);
		tree3.insert(6);
		tree3.insert(1);
		tree3.insert(3);
		tree3.insert(5);
		tree3.insert(7);

		// visit all the tree nodes
		tree3.inOrder();
		
		
		BST<String> tree = new BST<>();
		
		// insert some strings
		tree.insert("hello");
		tree.insert("stan");
		tree.insert("cat");
		tree.insert("dog");
		tree.insert("grass");
		tree.insert("tree");
		tree.insert("abacus");
		tree.insert("zebra");
		tree.insert("doggie");
		
		// visit all the tree nodes
		tree.inOrder();
		 
	}
}

/*
 * 
 * output:
 * 
 * ------------------------ Program Output ------------------------

	[ 1 2 3 4 5 6 7 ]

	[ abacus cat dog doggie grass hello stan tree zebra ]
	
*/
