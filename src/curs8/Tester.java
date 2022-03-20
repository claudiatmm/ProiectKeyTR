package curs8;

public class Tester <T> {


        T age;

        public Tester(T obj) {
            age=obj;
        }

        public void printAge() {
            System.out.println("Valoarea lui age este:" + age);
        }
}
