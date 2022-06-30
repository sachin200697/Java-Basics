public class Varargs {
    public static <T> void printObject(T... args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }

    public static void main(String[] args) {
        printObject(1,2,3,4,4,5);
    }
}
