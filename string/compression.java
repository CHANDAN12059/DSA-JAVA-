package string;

public class compression {
    public static void main(String[] args) {
        
        String a="aabbcccdddd";
        String newString="";
        Integer cnt;


        for(int i=0;i<a.length();i++){

            cnt=1; 
            while(i<a.length()-1&&a.charAt(i)==a.charAt(i+1)){
                cnt++;
                i++;
            }
            newString=newString+a.charAt(i);
            if(cnt>1){
                newString+=Integer.toString(cnt);
            }

        }


System.out.println(newString);













    }
}
