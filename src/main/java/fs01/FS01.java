package fs01;

import java.util.ArrayList;
import java.util.List;

public class FS01 {
    public static void filter(){
        List<Integer> log = new ArrayList<>();
        for (int i = 0;i<=50;i++){
            if(i%5==0)
            {
                log.add(i);
            }
            for(int l : log)
            {
                System.out.println(l);
            }
System.out.println(log.stream().filter(n->n%10==0).reduce(0,(c,e)->c+e));
        }
    }
}
