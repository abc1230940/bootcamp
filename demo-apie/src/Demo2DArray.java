public class Demo2DArray {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3};
    int[] arr2 = new int[3];
    String s = "hello";
    arr2[0] = s.length();

    // 2D array
    // 3 roles
    // level 1, 2, 3
    // MAX_HP, MAX_MP, PA, PD, MA, MD...
    // ! new int [row][column]
    // ! 3 roles -> 有的話會變3d
    // ! 10 levels
    // ! 6 attributes
    int[][] warrior_values = new int[10][6]; // 會變到有3個for loops
    int[][] mage_values = new int[10][6];
    int[][] archer_values = new int[10][6];

    
    // write
    warrior_values[0] = new int[] {200, 80, 10, 8, 5, 3}; // ! 第一個[]係row的array
    warrior_values[9] = new int[] {500, 200, 80, 50, 40, 20};

    int[][] arr2d = new int[][] {{10, 20, 30}, {100, 90, -100}}; // !　直接寫晒

    // read
    System.out.println(arr2d[1][1]); // 90
    System.out.println(arr2d[1][2]); // -100
    System.out.println(arr2d.length); // ! 2 -> no. of rows
    System.out.println(arr2d[0].length); // ! 3 -> no. of columns of each row

    for(int i = 0; i < arr2d.length; i++) { // 整條array row的長度[2]
      for (int j = 0; j < arr2d[i].length; j++) { // 每個row的長度[3]
        System.out.println("row=" + i + ",col=" + j + ",value=" + arr2d[i][j]);
      }
    }
    
    
  }
  
}
