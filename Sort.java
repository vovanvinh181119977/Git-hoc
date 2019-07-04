package ccpttkht;

//create by: Vinh Hung Bao Phuong
//create date: 29/06/19
//email : vovinh006@gmail.com

public class Sort {
    int SoA;
    int SoB;
    int SoC;
//ham sap xep cac so      
 public void ascSort(){
  if(SoA>SoB)
  {
        int tam =SoA;
        SoA = SoB;
        SoB = tam;
  }
  if(SoA>SoC)
  {
        int tam =SoA;
        SoA = SoC;
        SoC = tam;
  }
  if(SoB>SoC)
  {
        int tam =SoB;
        SoB = SoC;
        SoC = tam;
  }
 }
}
