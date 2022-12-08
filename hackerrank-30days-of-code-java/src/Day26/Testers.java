package Day26;

import java.util.Random;

//Tree26 is a copy of day 22 package
public class Testers {

    //random integers

    public static int rndInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max-min)+1)+ min;
        //min = 5, max 15
        //15-5 = 10 +1 ==11 ---> 0 to 10
               // +5 to this random number
    }

    //random binary search trees
    public static Tree26 rndTree(int count){
        if (count==0){
            return new EmptyBST26();
        }else {
            return rndTree(count-1).add(rndInt(0,50));
        }
    }
    //x + (x*2) = x+x*2

    public static void checkIsEmpty(Tree26 t) throws Exception {
        //if the tree t is an instance of EmptyBST26 --> t.isEmpty should return true
        //if the tree t is an instance of NonEmptyBST26 --> t.isEmpty should return false
        if (t instanceof EmptyBST26<?>) {
            if (!t.isEmpty()) {
                throw new Exception("All is not good. Tree is an EmptyBST26 and it is NON empty");
            }
        } else if (t instanceof NonEmptyBST26<?>) {
            if (t.isEmpty()) {
                throw new Exception("All is not good. Tree is an NonEmptyBST26 and it is empty");
            }
        }
    }

    public static void checkAddMemberAndCardinality(Tree26 t, int x) throws Exception {
        int nT = (t.add(x)).cardinality(); //cardinality of the tree once we add element to it
        //1.Either something was added, and cardinality was increased by one
        if (nT == (t.cardinality() + 1)) {
            if (t.member(x)) {
                throw new Exception(" The cardinality was increased by 1, but the thing that was added was already a member of the tree");
            }
//            else {
//                System.out.println("All is good, cardinality increased, an item wasn't in a tree");
//            }

            //2. or the thing that was added was already there and therefore not really added
            //so the cardinality stayed the same.
        } else if (nT == t.cardinality()) {
            if (!t.member(x)) {
                throw new Exception("The cardinality didn't increase by one but we added a new thing");
            }
//            else {
//                System.out.println("All is good, the item was in the trr already, cardinality didn't increase");
//            }
        } else {
            throw new Exception("Something is wrong with our program");
        }
    }
}
