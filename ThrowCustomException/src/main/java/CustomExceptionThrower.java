
public class CustomExceptionThrower {
   String animal="elephant";
    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     */
    public void throwCustomException( ) throws CustomException{
         
            
        if (animal!="elephant"){
            try{
            System.out.println (animal ="panda");
            throw new CustomException();

            } catch (CustomException a){
            }
        }else {
            System.out.println(animal);
        }
    } 
    
    }


