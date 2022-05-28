public class recurs {
    static String sumRecAr (String[] array, int i){
        if( i>= array.length ) {
           return "" ;
        } else {
            return array[i]+" "+sumRecAr(array, i+1);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"Без", "труда", "не", "вытащишь", "рыбку", "из", "пруда"};
        int i = 0;
        System.out.println(sumRecAr(arr, i));
    }
}
