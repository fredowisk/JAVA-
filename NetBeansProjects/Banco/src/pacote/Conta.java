
package pacote;

/**
 *
 * @author fredaum
 */
public class Conta {
    
    private final String titular;
    private final int numero;
    private final String agencia;
    private final double saldo;
    private final String abertura;

      /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the abertura
     */
    public String getAbertura() {
        return abertura;
    }
    
    
    
    public Conta(String titular, int numero, String agencia, double saldo, String abertura){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.abertura = abertura;
    }

    public double saca(Conta saldo, double saque){
        return saldo.getSaldo() - saque;
    }
    
    public double deposita(Conta saldo, double deposita){
        return saldo.getSaldo() + deposita;
    }
    
    
  
}
