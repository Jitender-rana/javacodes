public class shortest_path{
    public static double distance(String path){
        double x=0;
        double y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='W'){
                x-=1;

            }else if(path.charAt(i)=='E'){
                x+=1;
            }else if(path.charAt(i)=='N'){
                y+=1;
            }else{
                y-=1;
            }
        }
        double X=Math.pow(x,2);
        double Y=Math.pow(y,2);
        double dist=(double)(X+Y);


        return Math.sqrt(dist);
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        double path_length=distance(path);
        System.out.println(path_length);
    }
}
