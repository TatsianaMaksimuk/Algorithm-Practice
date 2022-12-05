package Day26;

public class BinarySearchTree26 {
    public static void main(String[] args)  throws Exception{
        EmptyBST26 e = new EmptyBST26();
        NonEmptyBST26 n = new NonEmptyBST26(5);

        Testers.checkIsEmpty(n); //not gonna print anything because evewrything is good.
        Testers.checkIsEmpty(e);
    }
}
