public class ejercicio5{
    public static void main(String[] args) {
        double[] mA = {12.5, 13.0, 12.8, 13.2};
        double[] mB = {14.1, 14.0, 13.9};
        int tMaquinas = mA.length +  mB.length;
        double []mAB= new double [tMaquinas];
        for(int i=0;i<tMaquinas;i++){
            if(i<(mA.length)){
            mAB[i] = mA[i];
            }else{
                mAB[i]= mB[i-mA.length];
            }
        }
        for (double valor: mAB)
        System.out.println(valor);
    }
}
