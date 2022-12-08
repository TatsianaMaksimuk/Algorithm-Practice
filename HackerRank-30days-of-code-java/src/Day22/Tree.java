package Day22;

public interface Tree <D extends Comparable>{
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}

//Tree interface implemented by NonEmptyBST - class representing non-empty binary search tree, EmptyBST = class representing empty binary search trees.
