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

class House extends Building{
    public String toString(){
        return "House";
    }
}

public class Wildcard {
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
        buildList(ol);
        
        List<House> hl = new ArrayList<>();
        hl.add(new House());
        hl.add(new House());

        // it will give error if we will add a Building into it 
        // using wildcard we can resolve it
        houseList(bl);
    }

    public static void build(Building b){
        System.out.println("Constructin a new " + b.toString());
    }

    // using wildcard ? extends
    // it means we can pass any class that extends Building class
    public static void buildList(List<? extends Building> bl){

        for(int i=0;i<bl.size();i++)
        System.out.println("Constructin a new" + bl.get(i).toString());
    }

    public static void houseList(List<? super House> buildings){
        buildings.add(new House());
        System.out.println("woring");
        
    }
    
}


