interface Man{
    // functional intergace have only single method
    public void personName(String name);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        Man m = new Man(){
            public void personName(String name){
                System.out.println(name);
            }
        };
        
        m.personName("Sachin");
    }
}
