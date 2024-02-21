package AdvancedExercises;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEs {
    public enum Operazioni {
    SOMMA,
    SOTTRAZIONE,
    MOLTIPLICAZIONE,
    DIVISIONE,
    MIN,
    MAX;
}
    public static void main(String[] args) {
        System.out.println(metodoOperazione(BigDecimal.valueOf(16), BigDecimal.valueOf(19.2),Operazioni.SOMMA));
    }
    public static BigDecimal metodoOperazione(BigDecimal big1, BigDecimal big2, Operazioni operatore){
        BigDecimal risultato = BigDecimal.valueOf(0);

        switch (operatore){
            case SOMMA : risultato = big1.add(big2);
                break;
            case SOTTRAZIONE : risultato = big1.subtract(big2);
                break;
            case MOLTIPLICAZIONE : risultato = big1.multiply(big2);
                break;
            case DIVISIONE : risultato = big1.divide(big2);
                break;
            case MIN : risultato = big1.min(big2);
                break;
            case MAX : risultato = big1.min(big2);
                break ;

        }return risultato;

    }
}
//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione,
// sottrazione, moltiplicazione e divisione, min e max) definita in un enum
//Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
