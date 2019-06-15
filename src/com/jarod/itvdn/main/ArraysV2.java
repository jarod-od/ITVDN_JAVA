package com.jarod.itvdn.main;

public class ArraysV2 {
    public static void main(String[] args) {
        int[] arrs = new int[5];

//        Заполнение массива
        for (int i = 0; i < arrs.length; i++){
            arrs [i] = i *2;
            System.out.println(arrs [i]);
        }

        // Специальная запись цикла for для прохождения элементов массива (Java 8)
        // Аналогична конструкции foreach, используемой в других языках программирования (например C#, PHP)
        // for (int ключ, массив)
        for (int anArray : arrs){
            System.out.print(anArray +" ");
        }
    }
}
