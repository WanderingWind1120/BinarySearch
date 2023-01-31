package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    /*
    BinarySeach chỉ sủ dụng được cho Array hoặc ArrayList của primitive hoặc reference data số học
    đã sắp xếp
    Cụ thể với Declaration dưới đây thì chúng ta đang áp dụng cho Ascendant Sorting
     */

        int[] array = { 1,5,8,8,17,20,57};
        System.out.println(binarySeach(array, 17));



    }
    private static int binarySeach (int[] array, int data){
        int high = array.length -1;
        int low = 0;
        int middle = 0;
        while (low < high){
            middle = (int) low + (high - low)/2;
            int temp = array[middle];
            if(temp < data){
                low = middle+1;
            }
            else if (temp > data){
                high = middle-1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
