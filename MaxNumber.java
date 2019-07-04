
package ccpttkht;

//create by: Vinh Hung Bao Phuong
//create date: 29/06/19
//email : vovinh006@gmail.com


public class MaxNumber {
    //tinh so max cua 2 so
    public int max2So(int SoA, int SoB) {
        if (SoA >= SoB)
         return SoA;
        else
         return SoB;
 }
// tinh so max cua 3 so    
 public int max3So(int SoA, int SoB   , int SoC) {
    if (SoA >= SoB)
        if (SoA >= SoC)
            return SoA;
        else
            return SoC;
        else if (SoB >= SoC)
            return SoB;
    else
        return SoC;
 }
}
