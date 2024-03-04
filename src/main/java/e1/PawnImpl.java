package e1;

public class PawnImpl implements Pawn{

    Pair<Integer, Integer> position;

    public PawnImpl(Pair<Integer, Integer> position){
        this.position = position;
    }

    @Override
    public boolean hit(int x, int y){
        return position.equals(new Pair<>(x, y));
    }
}
