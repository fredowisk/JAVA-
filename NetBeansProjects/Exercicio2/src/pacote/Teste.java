
package pacote;

/**
 *
 * @author fredaum
 */
public class Teste implements Comparable<Teste> {
    
    public double numeros;
    public Teste(double numeros){
        this.numeros = numeros;
    }
    public int compareTo(Teste nu){
        if(this.numeros<nu.numeros){
            return -1;
        }
        else if(nu.numeros < this.numeros){
            return 1;
        }
        return 0;
    }
    
}
