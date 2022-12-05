package Day26;
//Tree26 is a copy of day 22 package
public class Testers {

    public static void checkIsEmpty(Tree26 t) throws Exception{
        //if the tree t is an instance of EmptyBST26 --> t.isEmpty should return true
        //if the tree t is an instance of NonEmptyBST26 --> t.isEmpty should return false
        if (t instanceof EmptyBST26<?>){
            if (!t.isEmpty()){
                throw new Exception("All is not good. Tree is an EmptyBST26 and it is NON empty");
            }
        } else if (t instanceof NonEmptyBST26<?>) {
            if (t.isEmpty()){
                throw new Exception("All is not good. Tree is an NonEmptyBST26 and it is empty");
            }
        }
    }
}
