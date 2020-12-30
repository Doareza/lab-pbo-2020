public class prak3Lat3 { 
 public static void main(String args[]) {
    //Array 2 dimensi
        int[][] arrx = new int[3][3]; 
        arrx[0][0] = 1;
        arrx[0][1] = 2;
        arrx[0][2] = 3; 
        arrx[1][0] = 4;
        arrx[1][1] = 5;
        arrx[1][2] = 6; 
        arrx[2][0] = 7;
        arrx[2][1] = 8;
        arrx[2][2] = 9; 

        System.out.println("Nilai arrx[0][0] : " + arrx[0][0]); 
        System.out.println("Nilai arrx[0][1] : " + arrx[0][1]); 
        System.out.println("Nilai arrx[0][2] : " + arrx[0][2]); 
        System.out.println("Nilai arrx[1][0] : " + arrx[1][0]); 
        System.out.println("Nilai arrx[1][1] : " + arrx[1][1]); 
        System.out.println("Nilai arrx[1][2] : " + arrx[1][2]); 
        System.out.println("Nilai arrx[2][0] : " + arrx[2][0]); 
        System.out.println("Nilai arrx[2][1] : " + arrx[2][1]); 
        System.out.println("Nilai arrx[2][2] : " + arrx[2][2]); 

        int sum = 0;

        for (int[] arr : arrx ){
          for (int num : arr){
            sum += num;
          }
        }

        System.out.println("Jumlah semua data : "+ sum);
}
}    

/**  
 * Program berikut untuk mencoba array dua dimensi
*/  