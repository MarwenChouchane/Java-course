package chapter12Collection;

import java.util.Map;

public class Excercice {
    public static void main (String[] arg){
        Map<String, Integer> test1 = DonnéesExcercice.getOriginalGrades();
        Map<String, Integer> test2 = DonnéesExcercice.getMakeUpGrades();

        for(var name : test2.entrySet()){
            Integer firstGrade = test1.get(name.getKey());
            Integer secondGrade = test2.get(name.getKey());

            if (secondGrade>firstGrade){
                 test1.put(name.getKey(), secondGrade);
            }
            //System.out.println("Student: " + name.getKey() + ", Grade:" + test1.get(name.getKey()));

        }
        System.out.println("Final Grades:");
        test1.forEach((k,v) -> System.out.println("Name= "+k+" Grade= "+v));
    }
}
