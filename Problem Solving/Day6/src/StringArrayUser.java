import java.util.Scanner;

public class StringArrayUser {
    static boolean status = false;

    static boolean isPresent(String[] arr, String s) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == s) {
                    status = true;
                }
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5];
//        String[] arr = {"ASHA ,SAVI, RUTU ,SNEHAL"};
        System.out.println("Enter Username ");
        for (int i=0;i< arr.length;i++){
            arr[i] = scanner.next();
        }
        System.out.println("Enter Username ");
        String s = scanner.next();
        boolean result = isPresent(arr, s);
        if (result) {
            System.out.println("Username Present in array: " + result);
        } else {
            System.out.println("Username Not Present");
        }
    }
}
