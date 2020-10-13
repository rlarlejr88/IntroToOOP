package week1.classes;

public class Rectangle {
    private int height;
    private int width;
    private String color;

    public Rectangle(int width, int height, String color){
        if(height < 0){
            this.height = 1;
        }
        if(width < 0){
            this.width = 1;
        }
        this.height = height;
        this.width = width;
        this.color = color;
    }
    public Rectangle(int width, int height){
        if(height < 0){
            this.height = 1;
        }
        if(width < 0){
            this.width = 1;
        }
        this.height = height;
        this.width = width;
        this.color = "Blue";

    }

    //parameter
    public String draw(){

        char [] col = color.toCharArray();
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++){
                System.out.print(col[0]);
                if(j == width-1){
                    System.out.print("\n");
                }

        }
        }

        return "";
    }
}
