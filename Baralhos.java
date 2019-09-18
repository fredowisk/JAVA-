package pacote;

/**
 *
 * @author fredaum
 */
public class Baralhos {
    
    public enum Naipes {
        Paus("Paus"), Copas("Copas"), Ouros("Ouros"), Espadas("Espadas");
        
        private String naipesText;

        private Naipes(String naipesText) {
            this.naipesText = naipesText;
        }

        public String getNaipesText() {
            return naipesText;
        }
    };

    public enum Cartas {
        As("1"), Dois("2"), Tres("3"), Quatro("4"), Cinco("5"), 
        Seis("6"), Sete("7"), Oito("8"), Nove("9"), Dez("10"), 
        Valete("Valete"), Dama("Dama"), Rei("Rei");
        
        private String cartasText;

        private Cartas(String cartasText) {
            this.cartasText = cartasText;
        }
        
        public String getCartasText() {
            return cartasText;
        }
    };
}
