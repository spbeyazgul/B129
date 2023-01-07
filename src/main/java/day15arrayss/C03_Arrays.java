package day15arrayss;

import java.util.Arrays;

public class C03_Arrays {

    //INTERWIEN QUESTIONS
    //[0,2,3,0,12,0] sifirlari en sona koyunuz [2,3,12,0,0,0]

    public static void main(String[] args) {

   int orginal []= {0, 2, 3, 0, 12, 0};

   int yeni[] =new int[orginal.length];//[0,0,0,0,0,0]

        int idx=0;
        for (int i = 0; i<orginal.length; i++) {//orginal array icin calisti

            if (orginal[i] !=0){
                yeni[idx]=orginal[i];

                idx++;//bir sonraki indexe gecer
            }
        }
        System.out.println(Arrays.toString(yeni));
    }
}
