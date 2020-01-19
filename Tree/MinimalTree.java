class Node {
    int data;
    Node left = null;
    Node right = null;

    public Node(int d) {
        data = d;
    }
}

public class MinimalTree {

    public int[] getSliceArray(int[] array, int start, int end) {
        if (start >= end) return new int[]{};
        int[] result = new int[end - start];
        for (int i = 0; i < array.length; i++) {
            if (i >= start && i < end) {
                result[i - start] = array[i];
            }
        }
        return result;
    }

    public Node minimalTree(int[] array) {
        if (array.length == 0) {
            return null;
        }

        int middleIndex = array.length / 2;
        Node m = new Node(array[middleIndex]);

        int[] leftArr = getSliceArray(array, 0, middleIndex);
        m.left = minimalTree(leftArr);
            
         int[] rightArr = getSliceArray(array, middleIndex+1, array.length);
        m.right = minimalTree(rightArr);
        
        return m;    
    }

}