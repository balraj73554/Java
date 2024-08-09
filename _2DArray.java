public class _2DArray {
    public static void main(String[] args){
        // 2D Array - is matrix array where items stored in matrix form.
        String[][] cars = new String[3][3];
        // Row 1
        cars[0][0] = "Citroen";
        cars[0][1] = "Scorpio";
        cars[0][2] = "Swift";
        // Row 2
        cars[1][0] = "Punch";
        cars[1][1] = "Bugati";
        cars[1][2] = "Punch";
        // Row 3
        cars[2][0] = "Creta";
        cars[2][1] = "Thar";
        cars[2][2] = "Fortuner";

        for(int i=0;i<cars.length;i++){
            for(int j=0;j<cars.length;j++){
                System.out.printf(cars[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
