package string;

public class uppercaseFirstAlphabet {
    public static void main(String[] args) {
        String name="hi my name is rock";
        StringBuilder a=new StringBuilder();
        a.append(Character.toUpperCase(name.charAt(0)));
        for(int i=1;i<name.length();i++){
            if(name.charAt(i)==' '&&i<name.length()-1){
                a.append(" ");
          a.append(Character.toUpperCase(name.charAt(i+1)));
          i++;

            }
            else{
            a.append(name.charAt(i));
            }

        }
        System.out.println(a);
    }
}
