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
}
