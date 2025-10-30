public class Robot {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    public Robot(int nvida,int nataque,int ndefensa, String nnombre){
        vida = nvida;
        ataque = nataque;
        defensa = ndefensa;
        nombre = nnombre;
    }

    public Robot(){
        vida = 100;
        ataque = 80;
        defensa = 90;
    }

    public boolean combatir(Robot robotoponente){
        if (robotoponente.defensa > ataque) {
            //System.out.println("El robot enemigo bloqueo el ataque");
        }  else if (ataque > robotoponente.defensa && robotoponente.vida > 0) {
            robotoponente.vida = robotoponente.vida - (ataque - robotoponente.defensa);
            //System.out.println("Al robot oponente le quedan " + robotoponente.vida + " puntos de vida");
        } if (robotoponente.vida <=0){
            return true;
        } else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    @Override
    public String toString(){
        String texto = "El robot "+nombre+" tiene: "+vida+" puntos de vida";
        return texto;
    }
}
