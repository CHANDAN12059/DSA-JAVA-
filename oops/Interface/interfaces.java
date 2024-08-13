package oops.Interface;

interface Chess{
void moves();
}

class King implements Chess{
    
public void moves(){
    System.out.println("King");
}
}

class Queen implements Chess{

public void moves()
{
    System.out.println("Queen");
}


}




public class interfaces {
    public static void main(String[] args) {
        King k=new King();
        k.moves();



    }
}
