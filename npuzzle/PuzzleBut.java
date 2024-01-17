
package npuzzle;

import a_etoile.Etat;

public class PuzzleBut implements a_etoile.But {

    public PuzzleEtat but;
    
    public PuzzleBut(PuzzleEtat b){
        but = b;
    }
    
    @Override
    public boolean butSatisfait(Etat e) {
        return but.equals(e);
    }
    
}
