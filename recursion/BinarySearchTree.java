package myjava.recursion;

// like a set, no duplicates

class BinarySearchTree {

	Node root;

	public Node insert(Node root, int key) {
        	if (root == null) { root = new Node(key); return root; }
        	else if (key < root.key) { root.left = insert(root.left, key); }
        	else if (key > root.key) { root.right = insert(root.right, key); }
        	return root;
	}

	public Node delete(Node root, int key) {
        	if (root == null) { return root; }
        	else if (key < root.key) { root.left = delete(root.left, key); }
        	else if (key > root.key) { root.right = delete(root.right, key); }
        	else {
        		// found a match where root key = key
			if (root.left == null) { return root.right; }
            		if (root.right == null) { return root.left; }

            		// min value
            		Node r = root.right;
            		int minv = r.key;
            		while (r.left != null) {
                		minv = r.left.key;
                		r = r.left;
            		}
            		root.key = minv;
            
            		root.right = delete(root.right, root.key);
        	}

        	return root;
	}

	public Node search(Node root, int key) {
		if (root != null && root.key < key) { return search(root.right, key); }
		if (root != null && root.key > key) { return search(root.left, key); }
		return root;
	}

	public void order(Node root, String ordering) {
        	if (root != null) {
        		if (ordering.equalsIgnoreCase("inorder")) {
        			order(root.left, ordering); System.out.print(root.key + " "); order(root.right, ordering);
        		}
        		else if (ordering.equalsIgnoreCase("preorder")) {
        			System.out.print(root.key + " "); order(root.left, ordering); order(root.right, ordering);
        		}
        		else if (ordering.equalsIgnoreCase("postorder")) {
        			order(root.left, ordering); order(root.right, ordering); System.out.print(root.key + " ");
        		}
        	}
	}
    
	public void testBinarySearchTree() {
        	BinarySearchTree tree = new BinarySearchTree();

        	root = tree.insert(root, 50);
        	root = tree.insert(root, 30);
        	root = tree.insert(root, 20);
        	root = tree.insert(root, 35);
        	root = tree.insert(root, 40);
        	root = tree.insert(root, 70);
        	root = tree.insert(root, 15);
        	root = tree.insert(root, 80);
        	root = tree.insert(root, 45);
        
        	System.out.println("Inorder traversal:");
        	tree.order(root, "inorder");

		//tree.delete(root, 20);
		tree.delete(root, 30);
		//tree.delete(root, 80);

		// traversals
		System.out.println("\nInorder traversal after delete:");
		tree.order(root, "inorder");
		System.out.println("\nPreorder traversal:");
		tree.order(root, "preorder");
		System.out.println("\nPostorder traversal:");
		tree.order(root, "postorder");

		System.out.println("\nIs 70 present in the tree? " + tree.search(root, 70));
		System.out.println("Is 30 present in the tree? " + tree.search(root, 30));
	}
}

public class BST {
	public static void main(String... args) {
        	new BinarySearchTree().testBinarySearchTree();
	}
}
