package Day22;

public class BinaryTrees {

    public static int getHeight(Node root){
        //Write your code here
        if (root.left != null && root.right!=null) { // if we have both left and right children we measure height of each subtree
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            if (leftHeight > rightHeight) { //we compare which one is bigger
                return 1 + leftHeight;
            } else {
                return 1 + rightHeight;
            } //we use the bigger one to determine
        } else if (root.left != null) {
            return 1+(getHeight(root.left));
        }else if (root.right != null) {
            return 1+ (getHeight(root.right));
        } else{
            return 0; //not 1 , because root = 0
        }
    }

}
