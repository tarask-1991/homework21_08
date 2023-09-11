package org.example;

public class Person {



        private String name;
       int age;
        private double height;
        private double weight;
        private int money;

           public Person (String name,    int age,  double height,  double weight,  int money) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.money = money;

           }


        public void getInfo() {
            System.out.println();
            System.out.println("Info about person:");
            System.out.println("Name" + name);
            System.out.println("Age" + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("Money: " + money);
            System.out.println();
        }

        public String getName () {
               return name;
        }

//        public void work() {
//            if (age < 18 ){
//                System.out.println(" Under 18 ");
//            }
//            if (age < 0) {
//                System.out.println("under 0");
//            }
//            if (age > 18 || age < 65){
//                System.out.println(" Working ");
//            }
//            else {
//                System.out.println("More than 65" );
//            }
//
//        }



//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public int getMoney() {
//        return money;
//    }
//    public void setMoney(int money) {
//        this.money = money;
//    }
//
//    public void second () {
//        System.out.println("No profile");
//    }

}
