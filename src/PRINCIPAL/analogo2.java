package PRINCIPAL;
import PRINCIPAL.SIMULACION;
import PRINCIPAL.CARRIL_ANÁLOGO;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;
public class analogo2 extends Thread{
    SIMULACION s = new SIMULACION();
    private JLabel etiqueta;
    private CARRIL_ANÁLOGO auto;
    public analogo2(JLabel etiqueta, CARRIL_ANÁLOGO auto){
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    @Override
    public void run() {
        int auto1=0,auto2=0,extremo;
        while(true){
            try{
                sleep((int)(500));
                auto1 = auto.getPrimerauto().getLocation().x;
                auto2 = auto.getSegundoauto().getLocation().x;
                extremo = auto.getextremo().getLocation().x - 125;
             if(auto2 < extremo){
                etiqueta.setLocation(etiqueta.getLocation().x + 15,etiqueta.getLocation().y);
                auto.repaint();
                if((auto2)-(auto1)<=280){
                if(s.a==0){                    
                break;
                }
                }
                if(((auto2) - (auto1)<=150)){
                break;
                }
             }else{
                 break;
             }
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
