package exercice10;

/*
 * Remarque : Hérite de RuntimeException (Unchecked Exception).
 * Contrairement aux checked exceptions (qui héritent de Exception), le compilateur
 * n'oblige pas à la déclarer avec 'throws' dans la signature de la méthode,
 * ni à utiliser un bloc try/catch à l'appel.
 */
public class SoldeNulOuNegatifException extends RuntimeException {
    public SoldeNulOuNegatifException(String message) {
        super(message);
    }
}