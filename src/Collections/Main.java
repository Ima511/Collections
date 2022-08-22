package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//

        /**
         * ArrayList
          */
//
//    ArrayList<String> names = new ArrayList<>();
//      //  List<String> students = new ArrayList<>();
//        names.add("Meisam");
//        names.add("Sarah");

//        System.out.println(names.get(0));
//        System.out.println(names.size());
//    //    names.clear();
//        System.out.println(names.size());
//        names.remove("Meisam");
//        System.out.println(names.get(0));
//
//        System.out.println(names.contains("Meisam"));
//        System.out.println(names.contains("Sarah"));
//        names.remove("Sarah");
//        System.out.println(names.isEmpty());
//
//        System.out.println(names.indexOf("Meisam"));
//        System.out.println(names.indexOf("Abhay"));
//
//
//        for(int i =0; i<names.size(); i++){
//            System.out.println(names.get(i));
//        }

//        Map<String , String>

        Map<String, String> emailList = new HashMap<>();
        emailList.put("Abhay","abhaykumarjhaexam16@gmail.com");
        emailList.put("Raja", "rajaexam16@gmail.com");
        emailList.put("Saif","saif16@gmail.com");
        emailList.put("suraj","suraj16@gmail.com");
        emailList.put("shwet", "shwet16@gmail.com");
        emailList.put("manvi","manvi16@gmail.com");

        System.out.println(emailList.get("Abhay"));
        System.out.println(emailList.get("Saif"));
        System.out.println(emailList.get("manvi"));

        System.out.println(emailList.size());
        System.out.println(emailList.remove("manvi"));
        System.out.println(emailList.size());

        System.out.println(emailList.containsKey("manvi"));
        System.out.println(emailList.containsKey("Saif"));

        System.out.println(emailList.values());

        System.out.println(emailList.keySet());

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Abhay",1));
        students.add(new Student("Sarah",18));

        System.out.println(students.get(0).getId()+ students.get(0).getName());


        for (Student
                s:students
             ) {
            System.out.println(s.getName());

        }



    }

}
