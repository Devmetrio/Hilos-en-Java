package PRINCIPAL;
import PRINCIPAL.SIMULACION;
import PRINCIPAL.CARRIL_OPUESTO;
import javax.swing.JLabel;
public class opuesto2 extends Thread{
    SIMULACION s = new SIMULACION(); 
    private JLabel etiqueta;
    private CARRIL_OPUESTO auto;
    public opuesto2(JLabel etiqueta, CARRIL_OPUESTO auto) {
    this.etiqueta = etiqueta;
    this.auto = auto;
    }
    @Override
    public void run() {
        int auto1,auto2;
        while(true){
            try{
                sleep((int)(500));
                auto1 = auto.getprimerauto().getLocation().x;
                auto2 = auto.getsegundoauto().getLocation().x;
             if(auto1 < auto2 || auto1 > auto2){
                etiqueta.setLocation(etiqueta.getLocation().x - 20,etiqueta.getLocation().y);
                auto.repaint();
                if((auto2) - (auto1)<=400){    
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
