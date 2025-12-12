public  class starpatterncalling2 {


    static void mirroredTriangle(int n) {
        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
    
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
       mirroredTriangle(5); 
    }
}
    
    
}
