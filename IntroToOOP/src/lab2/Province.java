package lab2;

public class Province {
    private String province;
    private String capital;
    private long population;
    private int DEFAULT_POPULATION = 4647055;
    private  String DEFAULT_PROVINCE = "British Columbia";
    private  String DEFAULT_CAPITAL = "Victoria";



    public Province(){
        this.population = DEFAULT_POPULATION; // 4,648,055
        this.province = DEFAULT_PROVINCE; // “British Columbia”
        this.capital = DEFAULT_CAPITAL; // “Victoria”
    }


    public Province(String province, String capital, long population){
        if ((isValidPopulation(population)) && (isValidProvince(province))
                && (isValidCapitalCity(capital))){

            this.province = province;
            this.capital = capital;
            this.population = population;
        }
        else {
            // if there is any error; create the default data, shown below
            this.population = DEFAULT_POPULATION; // 4,648,055
            this.province = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }

    }
    private boolean isValidPopulation(long population){
        if(population >= 30000 && population <= 15000000){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean isValidProvince(String province){
       String [] provinces =  {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Colombia", "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
        for (String s : provinces) {
            if (province.equals(s)) {
                return true;
            }
        }
       return false;
    }


    private boolean isValidCapitalCity(String capital){
        String [] capitalcity = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria", "Chalottetown", "Regina", "Edmonton", "St.John's"};
         for(String c : capitalcity){
             if (capital.equals((c))){
                 return true;
             }
        }
         return false;
    }
    public String getProvince(){
        return province;
    }
    public String getCapital(){
        return capital;
    }
    public long getPopulation(){
        return population;
    }
    public void setProvince(String province){
        this.province = province;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public void setPopulation(long population){
        if(isValidPopulation(population)) {
            this.population = population;
        }
        else{
            this.population = DEFAULT_POPULATION;
        }
    }




    public String getDetails(){
        String s = "The capital of "+province+" (population. "+ population+ ") is "+capital+".";
        return s;

    }
}
