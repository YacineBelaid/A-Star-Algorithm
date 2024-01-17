
package npuzzle;
import java.util.LinkedList;
import java.util.List;

public class PuzzleMonde implements a_etoile.Monde {

    @Override
    public List<a_etoile.Action> getActions(a_etoile.Etat e) {
        PuzzleEtat etat = (PuzzleEtat) e;
        LinkedList<a_etoile.Action> actions = new LinkedList<a_etoile.Action>();
        if(etat.xVide<etat.cases.length-1)
            actions.add(new PuzzleAction('E'));
        if(etat.xVide>0)
            actions.add(new PuzzleAction('W'));
        if(etat.yVide>0)
            actions.add(new PuzzleAction('N'));
        if(etat.yVide<etat.cases[0].length-1)
            actions.add(new PuzzleAction('S'));
        return actions;
    }

    @Override
    public a_etoile.Etat executer(a_etoile.Etat e, a_etoile.Action a) {
        PuzzleAction action = (PuzzleAction) a;
        PuzzleEtat e1 = (PuzzleEtat) e;
        PuzzleEtat e2 = e1.clone();
        switch(action.direction){
            case 'W':
                e2.deplaceOuest();
                break;
            case 'E':
                e2.deplaceEst();
                break;
            case 'N':
                e2.deplaceNord();
                break;
            case 'S':
                e2.deplaceSud();
                break;
            default:
                throw new Error("Erreur!");
        }
        return e2;
    }

}
