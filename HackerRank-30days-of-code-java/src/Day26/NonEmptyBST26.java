package Day26;


import Day22.Tree;

public class NonEmptyBST26 <D extends Comparable> implements Tree26<D> {
    D data;
    Tree26<D> left;
    Tree26<D> right;

    public NonEmptyBST26(D elt) {
        data = elt;
        left = new EmptyBST26<D>();
        right = new EmptyBST26<D>();
    }

    public NonEmptyBST26 (D elt, Tree26<D> leftTree, Tree26<D> rightTree){
        data = elt;
        left = leftTree;
        right = rightTree;
    }

    public boolean isEmpty() {

        return false;
    }

    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    public boolean member(D elt) {
        if (data == elt) {
            return true;
        } else {
            if (elt.compareTo(data) < 0) {
                return left.member(elt);
            } else {
                return right.member(elt);
            }
        }

    }

    public NonEmptyBST26<D> add(D elt) {
        if (data == elt){
            return this;
        }else {
            if (elt.compareTo(data)<0){
                return new NonEmptyBST26(data, left.add(elt), right);
            }else{
                return new NonEmptyBST26(data, left, right.add(elt));
            }
        }
    }
}
