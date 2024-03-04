package e1;

public class KnightImpl implements Knight{

    private Pair<Integer, Integer> position;

    public KnightImpl(Pair<Integer, Integer> position){
        this.position = position;
    }

    @Override
    public boolean hit(int x, int y) {
        return position.equals(new Pair<>(x, y));
    }

    @Override
    public boolean move(int x, int y) {
        int row = x - position.getX();
        int col = y - position.getY();
        if (row!=0 && col!=0 && Math.abs(row)+Math.abs(col)==3) {
            this.position = new Pair<>(x, y);
            return true;
        }
        return false;

    }
}
