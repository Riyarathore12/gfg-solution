    }
    
    private Node build(int[] pre, int[] index, int mirrorStart, int size) {
        
        if (size <= 0)
            return null;
        
        Node root = new Node(pre[index[0]++]);
        
        // Leaf node
        if (size == 1)
            return root;
        
        // Left child in preorder
        int leftChild = pre[index[0]];
        
        // Position of left child in mirror preorder
        int pos = map.get(leftChild);
        
        // In mirror traversal: Root -> Right -> Left
        int rightSize = pos - mirrorStart - 1;
        int leftSize = size - 1 - rightSize;
        
        // Build left subtree first (because preorder)
        root.left = build(pre, index, mirrorStart + 1 + rightSize, leftSize);
        
        // Build right subtree
        root.right = build(pre, index, mirrorStart + 1, rightSize);
        
        return root;
    }
}