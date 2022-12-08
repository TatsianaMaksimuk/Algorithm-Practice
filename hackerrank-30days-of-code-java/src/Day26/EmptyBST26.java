package Day26;



public class EmptyBST26 <D extends Comparable> implements Tree26<D> {
    public EmptyBST26(){
    }

    public boolean isEmpty(){
        return true;
    }

    public int cardinality(){
        return 0;
    }

    public boolean member(D elt){
        return false;
    }

    public NonEmptyBST26<D> add(D elt) {
        return new NonEmptyBST26<D>(elt);
    }
}
