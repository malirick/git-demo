package com.rick.gulimall.ware;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class test {


    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
       // nums1 = Arrays.copyOf(nums1,m+n);
        int[] num=new int[m+n];
        int i=0;
        int j=0;
        for(int s=0;s<m+n;s++){

            if (!(i==m-1|j==n-1)) {
                if (nums1[i] >= nums2[j]) {
                    num[s] = nums2[j];
                    if (j < n - 1) {
                        j++;
                    }

                } else if (nums1[i] < nums2[j]) {
                    num[s] = nums1[i];
                    if (i < m - 1) {
                        i++;
                    }
                }
            }else {
                int v=Math.min(m,n);
                if(v==m){
                    for(int x=s-m;x<n;x++){
                        num[s]=nums2[s-m];
                    }

                }else {
                    for(int x=s-n;x<m;x++){
                        num[s]=nums1[s-n];
                    }

                }

            }




        }

        return num;


    }

    @Test
    public void a(){
       int [] nums1 = {1,2,3};
       int  m = 3;
       int [] nums2 = {2,5,6};
       int n = 3;
       int[]  a=merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(a));

    }
}



