
import java.io.*;
import java.util.*;
import sokoban.*;

/**
 * Point d'entrée de la partie B du TP1 (jeu sokoban).
 * Attention : 
 *  - Ne déplacez pas ce fichier source. Il doit être dans le package racine.
 */
public class demoB {
    
    public static void main(String args[]) throws IOException {
        Reader reader = args.length>=1 ? new FileReader(args[0]) : new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        Probleme probleme = Probleme.charger(br);
        List<a_etoile.Action> plan = a_etoile.AEtoile.genererPlan(probleme.grille, probleme.etatInitial, probleme.but, probleme.heuristique);
        if(plan==null)
            System.out.println("<Aucune solution>");
        else
            for(a_etoile.Action action : plan){
                System.out.print(action + " ");
            }
    }
}
