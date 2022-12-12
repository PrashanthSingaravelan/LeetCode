public class Flipping_an_Image {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] reverse_image = new int[image.length][image[0].length];
                                  // outer array size, inner array size
       
        // Reversing an Array
        for(int i=0;i<image.length;i++) {
           int cnt = image[0].length - 1;
           for(int j=0;j<image[0].length;j++) {
               reverse_image[i][j] = image[i][cnt-j];
           }
        }

        // Image of reversed array
        for(int i=0;i<image.length;i++) {
           for(int j=0;j<image[0].length;j++) {
               reverse_image[i][j] = (reverse_image[i][j] == 0) ? 1:0;
            }
        }

        return reverse_image;

    }
}