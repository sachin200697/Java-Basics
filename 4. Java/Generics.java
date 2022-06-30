import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static <T> List<T> getList(T arr[]){
        List<T> list = new ArrayList<T>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1,2,3,4,6};
        List<Integer> list = getList(arr);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    
}
