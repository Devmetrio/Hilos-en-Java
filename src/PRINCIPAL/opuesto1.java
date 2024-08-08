package PRINCIPAL;
import PRINCIPAL.SIMULACION;
import PRINCIPAL.CARRIL_OPUESTO;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class opuesto1 extends Thread{
    SIMULACION s = new SIMULACION();     
    CARRIL_OPUESTO c = new CARRIL_OPUESTO();
    int i=0;
    private JLabel etiqueta;
    private CARRIL_OPUESTO auto;
    DecimalFormat df = new DecimalFormat("#.0");
    public opuesto1(JLabel etiqueta, CARRIL_OPUESTO auto) {
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
                etiqueta.setLocation(etiqueta.getLocation().x + 30,etiqueta.getLocation().y);
                auto.repaint();
                if(((auto2) - (auto1)<=400) && i==0){   
                JOptionPane.showMessageDialog(null,"El tiempo para chocar es: "+df.format(c.tiemp2)+"s");
                i=1;
                if(s.a==0){
                break;
                }
                }
                if(((auto2) - (auto1)<=150)){
                JOptionPane.showMessageDialog(null,"El tipo de choque es: "+c.tchoque);
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
