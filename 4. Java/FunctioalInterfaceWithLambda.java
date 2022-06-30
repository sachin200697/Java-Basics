interface I1{
    public void myName(String name);
}

public class FunctioalInterfaceWithLambda {
    public static void main(String[] args) {

        I1 i1 = (String name)->{    //no need to use tye of variable, means we can remove String 
            System.out.println(name);
        };

        i1.myName("Sachin");
    }
}
