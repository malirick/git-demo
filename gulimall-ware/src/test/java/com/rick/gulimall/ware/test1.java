package com.rick.gulimall.ware;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author shuang.kou
 * @createTime 2020年06月15日 17:02:00
 */

public class test1{

    public static class Person {
        private Integer age;

        public Person(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }


        public static void main(String[] args) {
            TreeMap<Person, String> treeMap = new TreeMap<>(new Comparator<Person>() {
                @Override
                public int compare(Person person1, Person person2) {
                    int num = person1.getAge() - person2.getAge();
                    return Integer.compare(num, 0);
                }
            });
            treeMap.put(new Person(3), "person1");
            treeMap.put(new Person(18), "person2");
            treeMap.put(new Person(35), "person3");
            treeMap.put(new Person(16), "person4");
            treeMap.entrySet().stream().forEach(personStringEntry -> {
                System.out.println(personStringEntry.getValue());
            });
        }
    }


}