package org.example.exercise;

public interface EserciziStringhe {
    /**
     * Data una stringa contare quante vocali e quante consonanti ci sono
     *
     * @param str input string
     * @return an array containint in position [0] the vowels' number, and in
     * position [1] the consonants' number
     *
     * <p>
     * Example
     * </p>
     * <p>
     * input => "Ciao"
     * </p>
     * <p>
     * return => {1, 3}
     * </p>
     */
    String countVowelsAndConsonants(String str);

    /**
     * Implementa un metodo che controlli se una data sottostringa esiste
     * all'interno di una stringa
     *
     * @param mainStr la stringa principale
     * @param subStr la sottostringa
     * @return true se la sottostringa è contenuta nella stringa
     *         <p>
     *         Example
     *         </p>
     *         <p>
     *         input => "Capitombolo", "tombo"
     *         </p>
     *         <p>
     *         return => true
     *         </p>
     */
    boolean containing(String mainStr, String subStr);

    /**
     * implementare un metodo che data una stringa in input, mi ritorni se tutte le
     * parentesi (solo tonde) vengono aperte e chiuse correttamente
     *
     * @param str la stringa in input
     * @return true se tutte le parentesi vengono aperte e chiuse correttamente
     *         <p>
     *         Example
     *         </p>
     *         <p>
     *         input => "Ciao (serve (voce del verbo (non sel Signore) servire) per
     *         salutare la gente (anche quella che ti sta sulle scatole))"
     *         </p>
     *         <p>
     *         return => true
     *         </p>
     */
    boolean parenthesys(String str);

    /**
     * Implementa un metodo che ruoti una stringa di n posizioni a sinistra. Ad
     * esempio, "abcdef" ruotato di 2 posizioni diventa "cdefab".
     *
     * @param str Stringa in input
     * @param positions numero di posizioni da shiftare
     * @return La nuova stringa shiftata di X
     *         <p>
     *         Example
     *         </p>
     *         <p>
     *         input => "abcdef", 2
     *         </p>
     *         <p>
     *         return => "cdefab"
     *         </p>
     */
    String shift(String str, int positions);
}
