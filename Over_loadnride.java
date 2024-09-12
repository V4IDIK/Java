package lab;

class overloading{
    public int add(int x, int y) {

        return x+y;
    }
    
    public int add(int x, int y, int z){
    
        return x+y+z;
    }
}
class Override extends overloading{

    public int add(int x, int y){

        return x-y;
    }
}

public class Over_loadnride {
    public static void main(String[] args) {
        
        overloading o=new overloading();
        System.out.println(o.add(1, 2));
        System.out.println(o.add(1, 2, 3));
        
        Override oo=new Override();
        System.out.println(oo.add(1, 2));
    }
}



