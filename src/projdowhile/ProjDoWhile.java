package projdowhile;

import javax.swing.JOptionPane;
/**
 *
 * @author Jeferson Leon
 */
public class ProjDoWhile {

    public static void main(String[] args) {
    int c,qt, sexo,contM, contF;
    
    contF =0; contM=0;
    qt = Integer.parseInt(
   JOptionPane.
 showInputDialog("Digite quantas pessoas deseja:"));
   for(c=1; c<=qt; c++){ //laços contados
      if(qt>0){
          sexo = Integer.parseInt(
   JOptionPane.
   showInputDialog("Digite 1- M ou 2- F"));
        if(sexo == 1){
            contM++;
        } else if(sexo==2){
            contF++;
        } else{
            c--;
            JOptionPane.showMessageDialog(null,"Sexo invalido");
        }
      }
    }
   c--;
    if(contM == 1 && contF == 1){//cast
       JOptionPane.showMessageDialog(null, 
               "Homem:"+((double)contM/c*100.0)+"%"
    +"\nMulher:"+((double)contF/c*100.0)+"%"); 
    }else if(contM==1 && contF>1){
    JOptionPane.showMessageDialog(null, 
            "Homem:"+((double)contM/c*100.0)+"%"
    +"\nMulheres:"+((double)contF/c*100.0)+"%");
    }else if(contM>1 && contF==1){
    JOptionPane.showMessageDialog(null,
            "Homens:"+((double)contM/c*100.0)+"%"
    +"\nMulher:"+((double)contF/c*100.0)+"%");
    }else{
    JOptionPane.showMessageDialog(null,
            "Homens:"+((double)contM/c*100.0)+"%"
    +"\nMulheres:"+((double)contF/c*100.0)+"%");
    }
    }
    }
