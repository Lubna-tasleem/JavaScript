import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class stream {
public static void main(String[] args) {
List<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);

list.add(2);
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Partitioning the numbers into even and odd
Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
    .collect(Collectors.partitioningBy(num -> num % 2 == 0));

// Printing the results
System.out.println("Even numbers: " + partitionedNumbers.get(true));
System.out.println("Odd numbers: " + partitionedNumbers.get(false));
int li=list.stream().findFirst().orElse(null);
System.out.println(li);


System.out.println(li);
List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());

System.out.println("even"+even);
List<Integer> compare=list.stream().sorted((e1,e2)->e1.compareTo(e2)).collect(Collectors.toList());
System.out.println("compare"+compare);
//list.stream().toArray(Integer[]::new);

List<Integer> result=list.stream().distinct().collect(Collectors.toList());
System.out.println(result);

Set<Integer> set=list.stream().distinct().collect(Collectors.toSet());
System.out.println(set);

HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<list.size();i++){
    if(map.containsKey(list.get(i))){
        map.put(list.get(i), map.get(list.get(i))+1);
    }else{
map.put(list.get(i),1);
    }
}
System.out.println(map);
for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    Integer val=entry.getValue();
    if(val>1){
        System.out.println("duplicate in the list is"+entry.getKey());
    }
}

String str="pap";
StringBuilder str1=new StringBuilder(str);
str1.reverse();
if(str1==str1.reverse()){
    System.out.println(str1);
}

if(str1.equals(str1.reverse())){
    System.out.println(str1+"equals");

}
char c[]=str.toCharArray();
HashMap<Character,Integer> map1=new HashMap<>();

for (char ch : c) {
    // Use getOrDefault to handle both cases in one line
    map1.put(ch, map1.getOrDefault(ch, 0) + 1);
}
System.out.println(map1);
    }
    


    




}
