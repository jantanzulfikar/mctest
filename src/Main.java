import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //TODO soal nomor 1
        System.out.println("Hasil soal nomor 1 : " + case1());
        System.out.println("Hasil soal nomor 2 : " + case2());
        System.out.println("Hasil soal nomor 3 : " + case3());

    }


    public static int case1 () {
        Integer [] nums = {5 , 3 , 2 , 3};
        int result = 0;
        for (int data : nums) {
            for (int i = 0; i< nums.length ; i ++) {
                if (data - nums[i] < 0) {
                    continue;
                } else {
                    if (result > data) {
                        continue;
                    } else {
                        result = data;
                    }
                }
            }
        }

        return result;

    }


    public static List<Integer> case2 () {
        Integer [] nums = {1 , 2 , 3 , 4};
        int x = 4;
        int result = 0;
        List<Integer> results = new ArrayList<>();
        List<Integer> remove = new ArrayList<>();
        for (int data : nums) {
            for (int i = 0; i< nums.length ; i ++) {
                //System.out.println(" data "  + data +  " | nums " + nums[i] + " :  "+ data / nums[i]);
                if (data / nums[i] == x) {
                    remove.add(data);
                } else {
                    results.add(data);
                }
            }
        }

        return removeDupplicate(results , remove);

    }

    public static List<Integer> removeDupplicate (List<Integer> data , List<Integer> remove) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < data.size(); i ++) {
           if (!result.contains(data.get(i)) && !remove.contains(data.get(i)) ) {
               result.add(data.get(i));
           }
        }
        return result;
    }


    public static List<String> case3 () {
        String word = "souvenir loud four lost";
        Integer x = 4;
        List<String> result = new ArrayList<>();
        String [] datas = word.split("\\s+");
        for (String data : datas) {
            if (data.length() == x) {
                result.add(data);
            }
        }

        return result;
    }



}
