package Xenosis_Internship.Assignment4.Q3;

public class exception {
    public exception(String message) {
    }

    public static void main(String[] args) {
        try{
            //null pointer exception
            cust cust = new cust("abc");
            cust = null;
            cust.display("abc");

            //Arithmetic Exception (If we divide any number by 0 ,then it give Arithmetic exception)
            int a = 10/0;
            System.out.println("Answer : " +a);


            //number format exception
            String s ="123/";
            int num = Integer.parseInt(s);
            System.out.println("Number is : " +num);

            //custom exception
            checkAge(21);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is occurred "+e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Null pointer Exception is occurred "+e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Number Format Exception is occurred "+e.getMessage());
        }catch (customeException e){
            System.out.println("Custom Exception is occurred "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception  is occurred");
        }
    }

    public static  void checkAge(int age) throws customeException {
        if(age < 18){
            throw new customeException("Age must be above 18");
        }else{
            System.out.println("Age : "+age);
        }
    }
}
//custom exception
class customeException extends Exception{
    public customeException(String message){
        super(message);
    }
}

class cust{
    String name;
    cust(String name){
        this.name = name;
    }
    public void display(String name){
        System.out.println("Name : "+name);
    }
}

