package estruturaSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {9,3,14,2,43,11,58,22};
        System.out.println("Before Insertion Sort");

        for(int i:numbers){
            System.out.print(i+" ");
        }

        // Iteração para colocar em ordem
        // Fazer um "for" a partir da posição 1
        // Cria uma variável de auxilio
        // Pega o indice anterior

        // Faz um "while" comparando o valor atual com o valor anterior
        // Troca de posição

        // Coloca a posição do auxiliar no correto

        for(int i = 1 ; i < numbers.length; i ++){
            int key = numbers[i];
            int indice = i-1;

            while((indice > -1) && numbers[indice] > key){
                numbers[indice+1] = numbers[indice];
                indice--;
            }

            numbers[indice+1] = key;
        }


        System.out.println("\n After Insertion Sort");
        for(int i:numbers){
            System.out.print(i+" ");
        }
    }
}
