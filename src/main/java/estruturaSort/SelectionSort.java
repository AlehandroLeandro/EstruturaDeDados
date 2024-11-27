package estruturaSort;

public class SelectionSort {public static void main(String[] args) {
    int[] arr = {9, 3, 14, 2, 43, 11, 58};
    int count = 0;

    System.out.println("Before Selection sort:" );
    for (int num : arr) {
        System.out.print(num + " ");
    }

    // Desenvolver um programa que ordene o array acima utilizando o selection sort

    // Fazer um "for" a partir da posição 0
    // Fazer um "for" a partir da posição subsequente
    // Pegar o menor valor
    // Fazer a troca de posição
    for(int i = 0 ; i < arr.length; i++){
        int minIndex = i;
        for(int j = i+1 ; j < arr.length; j++){
            count++;
            if(arr[j] < arr[minIndex]){
                minIndex = j;

            }


        }
        int aux = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = aux;
    }

    System.out.println("\n After Selection sort:");
    for (int num : arr) {
        System.out.print(num + " ");
    }

    System.out.println("\n Quantidade de loops: " + count);

}


}
