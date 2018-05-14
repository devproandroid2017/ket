package mang;

import java.util.Arrays;

public class Mang2 {
	//Xóa phần tử trong mảng
	public static int[] removeElement(int[] array, int removeIndex) {
		int [] newArray = new int[array.length-1];
		
		for(int i =removeIndex;i<array.length-1;i++) {
			array[i] = array[i+1];
		}
		
		for (int i = 0; i<array.length-1;i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		  
		//in mang hai chieu  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
		
		int[] intArray = {1,2,3,4,5,6};
		
		
		System.out.println(Arrays.toString(removeElement(intArray, 3)));
		
	}

}
