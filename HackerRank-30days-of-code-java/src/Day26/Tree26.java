package Day26;

import Day22.NonEmptyBST;

public interface Tree26 <D extends Comparable>{
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST26<D> add(D elt);
}
