package PRINCIPAL;
import PRINCIPAL.CARRIL_ANÁLOGO;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class analogo1 extends Thread{
    SIMULACION s = new SIMULACION();
    CARRIL_ANÁLOGO c = new CARRIL_ANÁLOGO();
    int i=0;
    private JLabel etiqueta;
    private CARRIL_ANÁLOGO auto;
    DecimalFormat df = new DecimalFormat("#.0");
    public analogo1(JLabel etiqueta, CARRIL_ANÁLOGO auto) {
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
             if(auto1 < extremo && auto2 < extremo){
                if(c.vf1 < s.velmax){ 
                etiqueta.setLocation(etiqueta.getLocation().x + 15,etiqueta.getLocation().y);
                auto.repaint();
                }else{
                etiqueta.setLocation(etiqueta.getLocation().x + 35,etiqueta.getLocation().y);
                auto.repaint();    
                 }
                 if(((auto2)-auto1)<=280 && i==0){   
                 JOptionPane.showMessageDialog(null,"El tiempo para chocar es: "+df.format(c.tiemp1)+" s");
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
