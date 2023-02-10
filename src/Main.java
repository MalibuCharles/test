public class Main {
    public static void main(String[] args) {
        sum(12,5);
        name("Sara");
        add(5, 7);
    }

    public static void sum(int a, int b){
        int sumy = a/b;
        System.out.println(sumy);;
    }

    public static boolean name(String word){
        for (int i = 0; i < word.length(); i++) {
        }
        if (word.length() < 5){
            System.out.println("There is less than 5");
        } else {
            System.out.println("There is more than 5");
        }

        return false;
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static String vacay(String dest){
        if (dest.length() < 10){
            return dest;
        }
        return null;
    }

    public static void num(){
        int a = 2;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
    }

    public static int num2(int a, int b){
        return a + b;
    }

    public static boolean contains(String stores){
        if (stores.startsWith("a")){
            return true;
        }
        return false;
    }

    public static int total(){
        int sum = 10;
        if (sum == 5){
            return sum;
        } else if (sum == 10){
            return sum;
        } else {
            return sum;
        }
    }

    public static String itsHappening(){
        String name = "Malibu";
        return name;
    }

    public static String whoCalling(){
        String name = "nana";
        if (name.equals("nana")){
            return name;
        }
        return "nope not her";
    }

    public static int addy(int a, int b){
        return a + b;
    }

    public static boolean namep(String n){
        if (n.equals("Hello World")){
            return  true ;
        }
        return false;
    }
}