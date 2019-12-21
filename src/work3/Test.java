package work3;

import java.util.*;

/*“主公”，刘备，36岁；
“大将军”，赵子龙，28岁；
“参军”，魏延，25岁；
“军师”，孔明，26岁；*/
public class Test {
    public static void main(String[] args) {
        HashMap<String,Hero> map=new HashMap <String,Hero>();
        Hero h1=new Hero("刘备",36);
        Hero h2=new Hero("赵子龙",28);
        Hero h3=new Hero("魏延",25);
        Hero h4=new Hero("孔明",26);
        map.put("主公",h1);
        map.put("大将军",h2);
        map.put("参军",h3);
        map.put("军师",h4);
        Collection <Hero> values = map.values();
        Iterator <Hero> iterator = values.iterator();
        while (iterator.hasNext()){
            Hero next = iterator.next();
            System.out.println(next.getName()+" "+next.getAge());
        }
        System.out.println("********************************");
        Set <Map.Entry <String, Hero>> entries = map.entrySet();
        for (Map.Entry <String, Hero> entry : entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
