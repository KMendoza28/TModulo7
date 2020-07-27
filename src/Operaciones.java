/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Operaciones {
    private double Valor, Total_Cambio1;
    private int moneda,moneda2;
    
    
    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getMoneda2() {
        return moneda2;
    }

    public void setMoneda2(int moneda2) {
        this.moneda2 = moneda2;
    }

    public double getTotal_Cambio1() {
        return Total_Cambio1;
    }

    public void setTotal_Cambio(double Total_Cambio1) {
        this.Total_Cambio1 = Total_Cambio1;
    }
    
    //Constucto

    public Operaciones() {
    }
  
            //Operaciones
    /* 1 USD = 24,6798 HNL
       1 HNL = 0,0405189 USD
       1 EUR = 28,7638 HNL
       1 HNL = 0,0347659 EUR
       1 USD = 0,858089 EUR
       1 EUR = 1,16538 USD
     */
           
            public double cambiar (){
                if (moneda==0 && moneda2==0){//Dolaes a Lempias
                    Total_Cambio1= Valor * 24.6798;
                }else if (moneda==0 && moneda2==2){
                    Total_Cambio1= Valor;
                }else if (moneda==0 && moneda2==1 ){
                    Total_Cambio1= Valor/1.16538;
                }else if (moneda==1 && moneda2==0 ){
                    Total_Cambio1= Valor;
                }else if (moneda==1 && moneda2==1){
                    Total_Cambio1 =Valor/28.7624;
                }else if (moneda==1 && moneda2==2){
                    Total_Cambio1=Valor/24.6798;
                }else if(moneda==2 && moneda2==0){
                    Total_Cambio1=Valor*28.7609;
                }else if (moneda==2 && moneda2==1){
                    Total_Cambio1=Valor;
                }else if (moneda==2 && moneda2==2){
                    Total_Cambio1=Valor*1.16538;
                }
             return Total_Cambio1;
             
            }

    
            
}
