public class tugasNotasiBigO {

    
    public static void main(String args[]) {
        
        int bilangan = 10;
        
        int hasil = 0;
        for(int i = 1; i <= bilangan; i++) {
            hasil += bilangan;
        }
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah " + hasil);
 
    }
}