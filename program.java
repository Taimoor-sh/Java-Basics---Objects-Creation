
 class Main {
    int x = 5;
    int y = 15;
    public static void main(String[] args) {
        int z ;
        Main myObj = new Main();
        Main myObj1 = new Main();
        // myObj.x = 10;
        z = myObj.x + myObj1.y ;
        System.out.println("Sum of our two created objects is :");
        System.out.println(z);
    }
  }

