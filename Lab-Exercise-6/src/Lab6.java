public class Lab6 {
    public static void main(String[] args) {
        Integer arr_i[] = {2,8,20,3,4,};
        int arr_i_size = arr_i.length;

        Double arr_d[] = {2.7,3.8,5.5,6.7,9.7};
        int arr_d_size = arr_d.length; 

        FindMax<Integer> input1 = new FindMax<>();
        FindMax<Double> input2 = new FindMax<>();

        System.out.println(input1.array_max(arr_i, arr_i_size));
        System.out.println(input2.array_max(arr_d, arr_d_size));
    }

}

class FindMax<T>{

    public FindMax() {

    }

    public <T extends Comparable<T>> T array_max(T data[], int n) {
        T max = data[0];

        for (int i = 0; i < n; i++) {
            if(data[i].compareTo(max) > 0) {
                max = data[i];
            }
        }

        return max;
    }

}