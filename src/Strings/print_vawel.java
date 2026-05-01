package Strings;

public class print_vawel {
    public static void main(String[] args) {
        String  b = "abcdefghijklmnopqrstuvwxyzaeiou";
        int count=0;
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u')
                    count+=1;
            }
        System.out.println("vowel num= "+count);
        }
    }
