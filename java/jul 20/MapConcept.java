import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;

class MapConcept
{
public static void main(String[] args) {
List<String> tamilcity=new ArrayList<String>();
tamilcity.add("Erode");
tamilcity.add("Salem");
tamilcity.add("Coimbatore");
List<String> keralacity=new ArrayList<String>();
keralacity.add("palaikadu");
keralacity.add("ernakulam");
Map<String,List<String>> state=new HashMap<>();
state.put("tamilnadu", tamilcity);
state.put("kerala",keralacity);
List<String> tamilcity1=new ArrayList<String>();
tamilcity1.add("dis1");
tamilcity1.add("dis2");
tamilcity1.add("dis3");
List<String> keralacity1=new ArrayList<String>();
keralacity1.add("dis4");
keralacity1.add("dis5");
Map<String,List<String>> state1=new HashMap<>();
state1.put("tamilnadu1", tamilcity1);
state1.put("kerala1",keralacity1);
Map<String,Map<String,List<String>>> country=new HashMap<>();
country.put("india",state);
country.put("america",state1);
Map<String,List<String>> a=state.entrySet().stream().filter(str->str.getKey()=="tamilnadu").collect(Collectors.toMap(str->str.getKey(),str->str.getValue()));
a.entrySet().forEach(str -> {
System.out.println("District: " + str.getKey()+"\tDistrict Count:"+str.getValue().size());
});
System.out.println(a);

Map<String,Map<String,List<String>>> b=country.entrySet().stream().filter(str->str.getKey()=="india").collect(Collectors.toMap(str->str.getKey(),str->str.getValue()));
b.entrySet().forEach(coun -> {
System.out.println("Country: " + coun.getKey()+"\tState Count: "+coun.getValue().size());
});
System.out.println(b);
//List<String> listmap = state.entrySet().stream().filter(str->str.getKey()=="tamilnadu").collect(Collectors.toList(str->str.getKey(),str->str.getValue()));
List<String> valueList = a.values().stream().collect(Collectors.toList()); 
System.out.println(valueList);
}
}