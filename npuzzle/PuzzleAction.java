
package npuzzle;

public class PuzzleAction extends a_etoile.Action{
    public char direction;

    public PuzzleAction(char dir) {
        super(1);
        direction = dir;
    }
    
    @Override
    public String toString(){
        return "" + direction;
    }
}
