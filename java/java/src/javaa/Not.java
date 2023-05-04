//package com.te;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArrayDemo {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int size = scanner.nextInt();
//		int arr[] = new int[size];
//		System.out.println("Enter " + size + " values");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scanner.nextInt();
//		}
//
//		int count = getcount(arr);
//		int newArr[] = new int[count];
//		int pos = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0 && arr[i] != 0) {
//				newArr[pos] = arr[i];
//				pos++;
//			}
//
//		}
//		int[] resArr = new int[getbiggest(newArr) + 1];
//		for (int i = 0; i < newArr.length; i++) {
//			resArr[newArr[i]]++;
//		}
////		System.out.println(Arrays.toString(newArr));
////		System.out.println(Arrays.toString(resArr));
//		if (getResult(resArr) == -1) {
//			System.out.println("There is no even value in entered array, the o/p is : " + -1);
//		} else {
//			System.out.println("output : " + getResult(resArr));
//		}
//	}
//
//	static int getcount(int[] arr) {
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0 && arr[i] != 0) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	static int getbiggest(int[] arr) {
//		int big = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] > big) {
//				big = arr[i];
//
//			}
//		}
//		return big;
//	}
//
//	static int getResult(int[] arr) {
//		int big = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (big < arr[i]) {
//				big = arr[i];
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (big == arr[i]) {
//				if (i == 0) {
//					return -1;
//				}
//				return i;
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; i < arr.length; i++) {
//				if (arr[i] == arr[j]) {
//					return i;
//				}
//			}
//		}
//		return -1;
//	}
//}
