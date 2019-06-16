package com.jarod.itvdn.main;

public class ArraysV2 {
    public static void main(String[] args) {
        int[] arrs = new int[5];

//        Заполнение массива
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = i * 2;
            System.out.println(arrs[i]);
        }

        // Специальная запись цикла for для прохождения элементов массива (Java 8)
        // Аналогична конструкции foreach, используемой в других языках программирования (например C#, PHP)
        // for (int ключ, массив)
        for (int anArray : arrs) {
            System.out.print(anArray + " ");
        }

        System.out.println();

        //  initialization arrays
        int[] arr = new int[]{1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // object arrays
        String [] arr3 = new String [5];
        arr3 [3] = "88";

        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3 [i]);
        }

    }
}
