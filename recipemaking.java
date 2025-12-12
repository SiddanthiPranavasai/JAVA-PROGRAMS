import java.util.*;

public class recipemaking {
    
    static void ingredients() {
        System.out.println("Step 1: Gather the vegetables, rice, masala, biryani leaves.");
    }

    static void wash() {
        System.out.println("Step 2: Wash the vegetables and rice.");
    }

    static void chop() {
        System.out.println("Step 3: Chop the vegetables.");
    }

    static void fry() {
        System.out.println("Step 4: Fry whole spices in oil/ghee (bay leaf, cloves, cinnamon, cardamom).");
    }

    static void add() {
        System.out.println("Step 5: Add vegetables + spices (chilli, turmeric, garam masala, salt).");
    }

    static void rice() {
        System.out.println("Step 6: Parboil rice to 70% doneness and drain.");
    }

    static void cook() {
        System.out.println("Step 7: Cook on high flame for 5 mins + low flame for 20 mins.");
    }

    static void serve() {
        System.out.println("Step 8: Keep it for 10 mins, gently mix and serve.");
    }

    // NEW: Method to show any specific step
    static void showStep(int step) {
        switch(step) {
            case 1: ingredients(); break;
            case 2: wash(); break;
            case 3: chop(); break;
            case 4: fry(); break;
            case 5: add(); break;
            case 6: rice(); break;
            case 7: cook(); break;
            case 8: serve(); break;
            default: System.out.println("Invalid step number! Choose between 1–8.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a step number (1-8) to view that step:");
        System.out.println("OR Enter 0 to view ALL steps.");

        int choice = sc.nextInt();

        if (choice == 0) {
            // print all steps
            ingredients();
            wash();
            chop();
            fry();
            add();
            rice();
            cook();
            serve();
        } else {
            // print only the selected step
            showStep(choice);
        }

        sc.close();
    }
}
