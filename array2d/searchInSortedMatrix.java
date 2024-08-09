package array2d;

public class searchInSortedMatrix {
    public static void main(String[] args) {

        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int row = 0;
        int col = arr[0].length - 1;
        int key = 33;
        boolean found=false;
        while (row <= arr.length - 1 && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("KEY FOUND AT " + "(" + row + " " + col + ")");
                found=true;
                break;
            
            } else if (key > arr[row][col]) {
                row++;

            } else {
                col--;
            }
        }
        
       if(found==false){
        System.out.println("Key not found");
       }

    }

}
