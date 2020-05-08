class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2) //If only two points are present
            return true;
        if(coordinates[coordinates.length-1].length > 2)
            return false;
         int xi = 0, yi = 0;
        double slope = (coordinates[coordinates.length-1][1]-coordinates[0][1]);
        slope /= (coordinates[coordinates.length-1][0]-coordinates[0][0]);
        
        for(int i = 1; i < coordinates.length; i++)
            if((double)(coordinates[i][1] - coordinates[0][1]) != slope*(coordinates[i][0] - coordinates[0][0]))
                return false;    
  
        return true;
    }
}
