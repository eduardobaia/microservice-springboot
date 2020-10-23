package academy.devdojo.youtube.auth.secutiry.user;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeNames {


    public static String[] uniqueNames(String[] names1, String[] names2) {
        // throw new UnsupportedOperationException("Waiting to be implemented.");
        Stream<String> a = Arrays.stream(names1);
        Stream<String> b = Arrays.stream(names2);
        return Stream.concat(a, b).toArray(String[]::new);

    }
//    public static Integer[] uniqueNumber(Integer[] names1, Integer[] names2) {
//        // throw new UnsupportedOperationException("Waiting to be implemented.");
//        Stream<Integer> a = Arrays.stream(names1);
//        Stream<Integer> b = Arrays.stream(names2);
//        Stream<Integer> c= Stream.concat(a, b).toArray(Integer[]::new);
//        return
//    }
    public static void main(String[] args) {
//        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
//        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
//        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
//
        int [] v= {1,1,2,3,5,5,6,7,8,9,8,9};




        int [] w = removerDuplicated(v);


        Set<Integer> set = new HashSet<>();

        for(int a: v){
            set.add(a);
        }
        System.out.println(set);

    }


    private  static int [] removerDuplicated(int [] v){
        int n = v.length;
        int [] w = Arrays.copyOf(v,n);

        for (int i=0; i<n; i++){
            int k = 1+1;
            for( int j =i+1; j<n; j++){

            }

        }

        return w;
    }


}
