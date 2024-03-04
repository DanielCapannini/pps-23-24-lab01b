package e1;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Pawn pawn;
	private Knight knight;
	private final Random random = new Random();
	private final int size;
	 
    public LogicsImpl(int size){
    	this.size = size;
        this.pawn = new PawnImpl(this.randomEmptyPosition());
        this.knight = new KnightImpl(this.randomEmptyPosition());
    }

	public LogicsImpl(int size, Pair<Integer, Integer> pawn, Pair<Integer,Integer> knight){
		this.size = size;
		this.pawn = new PawnImpl(pawn);
		this.knight = new KnightImpl(knight);
	}
    
	private final Pair<Integer,Integer> randomEmptyPosition(){
    	Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
    	// the recursive call below prevents clash with an existing pawn
    	return this.pawn!=null && this.pawn.hit(pos.getX(), pos.getY()) ? randomEmptyPosition() : pos;
    }
    
	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		// Below a compact way to express allowed moves for the knight
		return this.knight.move(row, col) && this.pawn.hit(row, col);
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.hit(row, col);
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.hit(row, col);
	}
}
