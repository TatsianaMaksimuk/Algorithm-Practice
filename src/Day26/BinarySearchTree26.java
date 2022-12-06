package Day26;

public class BinarySearchTree26 {
    public static void main(String[] args)  throws Exception{
        EmptyBST26 e = new EmptyBST26();
        NonEmptyBST26 n = new NonEmptyBST26(5);

        Testers.checkIsEmpty(n); //not gonna print anything because everything is good.
        Testers.checkIsEmpty(e);

        Testers.checkAddMemberAndCardinality(e,5);
        Testers.checkAddMemberAndCardinality(n,5);
        Testers.checkAddMemberAndCardinality(n,6);

        int tests = 1000;

        for (int i = 0; i < tests; i++) {
            Tree26 t;
            if (i%10 == 0){
                t = Testers.rndTree(0);
            } else {
                t = Testers.rndTree(10);
            }
            Testers.checkAddMemberAndCardinality(t, i);
        }
    }
}
