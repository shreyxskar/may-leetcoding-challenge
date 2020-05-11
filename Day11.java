class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        colorThisImage(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    void colorThisImage(int img[][], int r, int c, int nC, int oC){
        if(r < 0 || r == img.length || c < 0 || c == img[0].length)
            return ;        
        if(img[r][c] == nC)
            return;
        if(img[r][c] == oC){
            img[r][c] = nC;     
            colorThisImage(img, r - 1, c, nC, oC);   
            colorThisImage(img, r + 1, c, nC, oC);   
            colorThisImage(img, r, c - 1, nC, oC);  
            colorThisImage(img, r, c + 1, nC, oC);
        }        
    }   
}
