import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<Character> a = new ArrayList<Character>();
            a.add('d');
            a.add('f');
            a.add('c');
            a.add('a');

            System.out.println(a);

            int a_length = a.size();
            int f_length = 0;
            int alpha_pos = 0;

        for (Character character : a) {
            alpha_pos = character.compareTo('a') + 1;
            f_length = f_length + alpha_pos;
            System.out.println(character + " - " + alpha_pos);
        }

            System.out.println(f_length);

            for(int i=a_length; i<f_length; i++){
                a.add(i,'0');
            }

            int pos = f_length;
            int length = 4;
            alpha_pos = 0;
            int k = 0;
            int counter = 0;

            while(counter<f_length){
                alpha_pos = a.get(counter).compareTo('a') + 1;
                k = length + alpha_pos - 1;
                for(int j=length-1; j>=counter+1; j--){
                    a.set(k-1,a.get(j));
                    k = k-1;
                }
                System.out.println(a);
                for(int j=counter+1; j<=counter+alpha_pos-1; j++){
                    a.set(j,a.get(counter));
                }
                length = length + alpha_pos-1;
                counter = counter + alpha_pos;
                System.out.println(a);
            }
            
            System.out.println("Final array : ");
            System.out.println(a);
    }
}
