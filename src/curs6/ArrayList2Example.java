package curs6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ArrayList2Example {

        public static void main(String[] args) {

            List<String> list = new ArrayList<>(Arrays.asList("rosu", "negru", "galben", "maro"));


            System.out.println(list.size());
            for(String culoare : list) {
                System.out.println(culoare);
            }

            //String masina --> substring(3,5) - ina

            System.out.println("----------------------------");
            list.subList(1, 3).clear();

            for(String culoare : list) {
                System.out.println(culoare);
            }

		/*list.subList(1, 3).clear();
		 * Parameters:
			fromIndex low endpoint (inclusive) of the subList
			toIndex high endpoint (exclusive) of the subList
		 */

            String element = "maron";
            if(list.contains(element)) {
                System.out.println(element + " se afla in lista!");
            }else {
                System.out.println(element + " NU se afla in lista!");

            }

            System.out.println("-------------------------------");

            list.set(0, "galben");

            for(String culoare : list) {
                System.out.println(culoare);
            }
            list.add("oana");
            list.add("ion");
            list.add("maria");
            list.add("gabi");

            System.out.println(list.size());

            System.out.println("------------- for each----------");

            for(String culoare : list) {
                System.out.println(culoare);
            }

            System.out.println("------------- Iterator----------");

            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }


        }

    }

