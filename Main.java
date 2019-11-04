package com.lesson.Mistake;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
/*Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
 10 3 1 2
 2 3 2 2
 5 6 7 1
 300 3 1 0
 Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
 2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
 3. Ваши методы должны бросить исключения в случаях:
    Если размер матрицы, полученной из строки, не равен 4x4;
    Если в одной из ячеек полученной матрицы не число; (например символ или слово)
 4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.*/

    public static void main(String[] args) throws IOException {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 и";
        arrEditor(str);

    }

    private static void arrEditor(String str) throws IOException {

        int sum = 0;
        int devision = 0;
        String[][] arr2 = new String[4][4];
        String[] str1 = str.split("\n");
        if (str1.length != 4) {
            throw new IOException("Не подходящая длина");
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = str1[i].split(" ");
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                try {
                    sum += Integer.parseInt(arr2[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Только цыферки, буквы я в расчет не взял");
                }
            }
        }
        devision = sum / 2;
        System.out.println(devision);

    }
}






