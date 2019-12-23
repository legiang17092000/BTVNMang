package legiang.com;

import java.util.Scanner;

public class TestMang {
	
	static void xuatMang(int []M)
	{
		for (int i = 0; i < M.length; i++) {			
			System.out.print(M[i]+" ");
		}
	}	
	static void xuatChanLe(int[]M)
	{
		int sptLe=0;
		int sptChan=0;
		String x1="";
		String x2="";
		for (int i = 0; i < M.length; i++) {
			if(M[i]%2!=0)
			{
				sptLe++;		
				x1 +=M[i]+",";				
			}
			else 
			{
				sptChan++;				
				x2+=M[i]+",";
			}
		}
		System.out.println(x1+"Có "+sptLe+" số lẻ");
		System.out.println(x2+"Có "+sptChan+" số chẵn");
	}
	
	public static boolean kiemTraSoNguyenTo(int x)
	{
		int dem =0;
		for (int i = 1; i<=x; i++) 
		{
			if(x%i==0)
			{
				dem++;
			}			
		}
		if(dem==2)
		return true;
		else return false;
	}
	public static void xuatSoNguyenTo(int[]X)
	{
		String x1="";
		String x2="";
		int sptNT=0;
		int sptKoNT=0;
		for (int i = 0; i < X.length; i++) {
			if(kiemTraSoNguyenTo(X[i])==true)
			{				
				sptNT++;
				x1+= X[i]+",";
			}
			else 
			{
				sptKoNT++;
				x2+=X[i]+",";
			}
		}
		System.out.println(x1+"Có "+sptNT+" là số nguyên tố");
		System.out.println(x2+"Có "+sptKoNT+" không là số nguyên tố");
	}
	public static void main(String[] args) {

		System.out.println("Bạn muốn nhập bao nhiêu phần tử vào mảng: ");
		Scanner sc= new Scanner(System.in);
		int spt=sc.nextInt();		
		int [] M=new int[spt];		
		for (int i = 0; i < spt; i++) {
			System.out.print("Mời nhập vào phần tử thứ "+(i+1)+": ");
			M[i]=sc.nextInt();			
		}
		System.out.print("Mảng của bạn là: ");
		xuatMang(M);
		System.out.println(" ");
		xuatChanLe(M);
		xuatSoNguyenTo(M);
		
		
		
		
		
		
	 
		
		
		
		
		
		
	}

}
