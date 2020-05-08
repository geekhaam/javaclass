package com.java.algorithm;

public class QuickSort {
	//int[] list = {69, 10, 30, 2, 16, 8, 31, 22};
	static int i=0;
    static int size;
    public static int partition(int[] a, int begin, int end) {
        int pivot, temp, L, R;
        i++; //���� Ƚ��
        L = begin;
        R = end;
        pivot = (int)((begin+end)/2);
        System.out.println(i+"�ܰ�: pivot="+a[pivot]);
         //1. while(L<R)�ΰ��
        while(L<R) {
            while((a[L]<=a[pivot]) && (L<=R)) L++;
            while((a[R]>a[pivot]) && (L<=R)) R--;
            if(L<=R) { 
                temp = a[L];
                a[L] = a[R];
                a[R] = temp;
                if(R == pivot) { // L�� R ���Ҹ� ��ȯ�Ͽ� ��������� pivot ������ ��ġ�� ����� ���
                    for(int t=0;t<size;t++) {
                        System.out.print(a[t]+" ");
                    }
                    System.out.println();
                    return L; // L�� Ȯ���� pivot�� ��ġ
                }
            }
        }
        //2. while(L>R)�� ���
        temp = a[pivot];
        a[pivot] = a[R];
        a[R] = temp;
        for(int t=0;t<size;t++) {
            System.out.print(a[t]+" ");
        }
        System.out.println();
        return R;//R�� Ȯ
    }
    
    public static void quickSort(int[] a, int begin, int end) {
        if(begin<end) {
            int p = partition(a, begin, end); 
            quickSort(a, begin, p-1);// pivot�� ���� �κ����տ� ���� �� ���� ���ȣ��
            quickSort(a, p+1, end);//pivot�� ������ �κ����տ� ���� �� ���� ���ȣ��
        }
    }
    
    public static void main(String[] args) {
        int[] list = {69, 10, 30, 2, 16, 8, 31, 22};
        size = list.length;
        quickSort(list, 0, size-1);
    }
 
}