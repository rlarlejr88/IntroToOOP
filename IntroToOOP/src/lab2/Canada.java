package lab2;

import java.security.PublicKey;

public class Canada{


    private Province[] provinces = new Province[10];
    public Canada(){

        provinces[0] = new Province("British columbia","Victoria",5147712);
        provinces[1] = new Province("Ontario","Toronto",14734014);
        provinces[2] = new Province("Quebec","Quebec City",8574571);
        provinces[4] = new Province("Nova Scotia","Halifax", 979351);
        provinces[5] = new Province("New Brunswick","Fredericton",781476);
        provinces[6] = new Province("Manitoba", "Winnipeg",1379263);
        provinces[7] = new Province("Prince Edward Island", "Charlottetown", 159625);
        provinces[8] = new Province("Saskatchewan", "Regina",1178681);
        provinces[9] = new Province("Alberta", "Edmonton",4421876);
        provinces[10] = new Province("NewFoundland and Labrador", "St.John's", 522103);


    }
    public void displayAllProvinces(){
        for(int i = 0; i < provinces.length; i++){
            System.out.println(provinces[i].getDetails());
        }

    }
    public int getNumOfProvincesBetween(int min, int max){
        int counter = 0;
        for(int i = 0; i < provinces.length;i++){

            if(provinces[i].getPopulation() >= (min *1000000) && provinces[i].getPopulation() <= (max*1000000)){
                counter ++;
            }
        }
        return counter;
    }



}
