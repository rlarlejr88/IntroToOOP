package mini_project2;

public class Contact extends InputCollector {

    public Contact(String name, long number, String email){
     setName(name);
     setNumber(number);
      setEmail(email);
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
     }

      public void setNumber(long number) {
      this.number = number;
      }

      public long getNumber() {
       return number;
      }

     public void setEmail(String email) {
      this.email = email;
     }

     public String getEmail() {
        return email;
     }


}

