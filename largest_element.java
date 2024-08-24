//WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

public class largest_element {

    public static void main(String[] args) {

        int [] arr = new int [] {75,100,23,45,111};

        int largest = arr[0];

        for (int i : arr) {

            if (i > largest)
                largest = i;
        }
        System.out.println("Largest element from the array : " + largest);
    }
}