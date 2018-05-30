package com.zz.utils;

import java.util.Random;

/**
 * @Author: zz
 * @Description:
 * @Date: 上午 11:05 2018/5/15 0015
 * @Modified By
 */
public class RandomUtil {

    public static void main(String[] args) {
        for(int i = 0 ; i<500 ; i++){
            int rom = (int) Math.random() * 100;
            String str = null;
            if(rom % 2 == 0) {
                str = getItemID(3);
            }else {
                str = getItemID(2);
            }

            System.out.println(str+".exchange");
        }


    }


    /** 生成随机数当作getItemID
     * n ： 需要的长度
     * @return
     */
    private static String getItemID( int n )
    {
        String val = "";
        Random random = new Random();
        for ( int i = 0; i < n; i++ )
        {
            String str = random.nextInt( 2 ) % 2 == 0 ? "num" : "char";
            if ( "char".equalsIgnoreCase( str ) )
            { // 产生字母
                int nextInt = random.nextInt( 2 ) % 2 == 0 ? 65 : 97;
                // System.out.println(nextInt + "!!!!"); 1,0,1,1,1,0,0
                val += (char) ( nextInt + random.nextInt( 26 ) );
            }
            else if ( "num".equalsIgnoreCase( str ) )
            { // 产生数字
                val += String.valueOf( random.nextInt( 10 ) );
            }
        }
        return val;
    }
}