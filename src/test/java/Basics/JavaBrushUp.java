package Basics;

public class JavaBrushUp {

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int a= 0; a<arr1.length;a++){
            if(arr1[a] % 2 ==0){
                System.out.println(arr1[a]);
                //break;
            }
            else{
                System.out.println("Not a multiple of 2" + " " + arr1[a]);
            }


        }
    }
}
