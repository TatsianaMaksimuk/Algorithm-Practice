package Day14;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;

    }

    public void computeDifference(){
        int difference = Integer.MIN_VALUE;
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((elements[i]-elements[j])>difference){
                    difference = elements[i]-elements[j];
                }
            }
        }
        maximumDifference = difference;
    }
}
