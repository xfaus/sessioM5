package quick_sort;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("holaaa");

		int[] array={3,8,15,21,33,64,73,81};
		boolean trobat=false;
		int inici,fi,pivot,num;
		
		escriure("Quin nombre vols buscar? ");
		num=llegir();
		
		inici=0;
		pivot=0;
		fi=array.length;
		
		while((fi>inici)&&(!trobat)){
			
			pivot=(inici+fi)/2;
			if(array[pivot]==num){
				trobat=true;
			}else{
				if(num<array[pivot]){
					fi=pivot-1;
				}else{
					inici=pivot+1;
				}
				
			}	
		}
		
		if(trobat){
			escriure("\nLa posicio es: "+(pivot));
		}else{
			escriure("\nEl "+num+" no existeix en l'array: ");
			escriure_array(array);
		}
	}

	private static void escriure(String cadena){
		System.out.print(cadena);
	}
	
	private static void escriure_array(int[] array){
		for (int i=0; i<array.length;i++){
			escriure("["+array[i]+"]");
		}
	}
	
	private static int llegir(){
		Scanner ll=new Scanner(System.in);
		return ll.nextInt();
	}
	
}
