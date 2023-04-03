
public class PetaZadaca {
	public static void main(String[] args) {
        int a = 4; 
        int b = 2; 
        int c = 3; 

        int k, d;
        if (a <= 5 && b <= (a - c)) {
            k = 1;
            d = -1; 
        } else {
            k = 0;
            if (c == 0) {
                d = 0;
            } else {
                d = 1;
            }
        }

        System.out.println("k = " + k);
        if (d != -1) {
            System.out.println("d = " + d);
        }
    }
}

