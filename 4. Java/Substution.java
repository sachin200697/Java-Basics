import java.util.ArrayList;
import java.util.List;

class Building {
    public String toString(){
        return "Building";
    }
}

class Office extends Building{
    public String toString(){
        return "Office";
    }
}

public class Substution {
    public static void main(String[] args) {
    
        Building b = new Building();
        Office o = new Office();

        build(b);
        build(o);

        List<Building> bl = new ArrayList();
        bl.add(new Building());
        bl.add(new Office());
        buildList(bl);

        List<Office> ol = new ArrayList();
        ol.add(new Office());
        ol.add(new Office());
        // this will give error, we can solve it using wildcards
        // check Wildcard.java
        // buildList(ol);
        
    }

    public static void build(Building b){
        System.out.println("Constructin a new " + b.toString());
    }

    public static void buildList(List<Building> bl){

        for(int i=0;i<bl.size();i++)
        System.out.println("Constructin a new" + bl.get(i).toString());
    }
    
}
